package pl.coderslab.controllers;



import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.groups.Default;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping(path="/add", method=RequestMethod.GET)
	public String test(Model model){
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public String processAddUserForm(@Valid User user, BindingResult result ){
		
		
		
		if (result.hasErrors()){
			return "bookForm";
		}
		
		userRepository.save(user);
		return "redirect:/user/list";
	}
	
	@RequestMapping(path="/list", method=RequestMethod.GET)
	public String showBooks(Model model){
		model.addAttribute("users", userRepository.findAll());
		return "userList";
	}
	
	@RequestMapping(path="/edit/{id}", method=RequestMethod.GET)
	public String showEditUserForm(@PathVariable Long id, Model model){
		model.addAttribute("user", userRepository.findOne(id));
		return "userForm";
	}
	
	@RequestMapping(path="/edit/{id}", method=RequestMethod.POST)
	public String editUserForm(@ModelAttribute User user){
		userRepository.save(user);
		return "redirect:/books/list";
	}
	
	@RequestMapping(path="/delete/{id}", method=RequestMethod.GET)
	public String deleteUserFromForm(@PathVariable Long id, Model model){
		userRepository.delete(userRepository.findOne(id));
		return "redirect:/user/list";
	}

	

}