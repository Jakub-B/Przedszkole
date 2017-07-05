package pl.coderslab.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.model.Children;
import pl.coderslab.model.Parent;
import pl.coderslab.repository.ChildrenRepository;
import pl.coderslab.repository.ParentRepository;

@Controller
public class ParentsController {

	@Autowired
	private ParentRepository parentRepository;

	

	@RequestMapping(method = RequestMethod.GET)
	public String logining(Model model) {
		model.addAttribute("parent", new Parent());
		return "loginparents";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String logining(@RequestParam("login") String login, @RequestParam("password") String password, Model model,
			HttpServletRequest request) {
		try {
			model.addAttribute("parent", new Parent());
			Parent parent = parentRepository.findByLogin(login);
			System.out.println(parent.toString());
			if (parent.getPassword().equals(password)) {
				request.getSession().setAttribute("userId", parent.getId());
				return "head";
			}

			return "loginparents";
		} catch (Exception e) {
			return "loginparents";
		}
	}

	@RequestMapping(path = "/finanse/{id}", method = RequestMethod.GET)
	public String logining(@PathVariable long id) {
		
		//List<Children> childrenbyparent = parentRepository.findParentsChildrenByParentId(id);
		
		return "";
	}

	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "logout";
	}

}
