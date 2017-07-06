package pl.coderslab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import pl.coderslab.model.Children;
import pl.coderslab.model.Parent;
import pl.coderslab.model.Teacher;
import pl.coderslab.repository.ChildrenRepository;
import pl.coderslab.repository.ParentRepository;
import pl.coderslab.repository.TeacherRepository;

@Controller
@RequestMapping("/children")
public class ChildrenControler {

	@Autowired
	private ChildrenRepository childrenRepository;

	@Autowired
	private TeacherRepository teacherRepository;

	@Autowired
	private ParentRepository parentRepository;

	@ModelAttribute("teachers")
	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();
	}

	@ModelAttribute("parents")
	public List<Parent> getAllParents() {
		return parentRepository.findAll();
	}

	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public String addChildren(@SessionAttribute(required = false) Long userId, Model model) {
		if (userId != null) {
			model.addAttribute("children", new Children());
//			model.addAttribute("parent", new Parent());
			// model.addAttribute("parents", getAllParents());
			return "addChildren";
		} else {
			return "redirect:/login";
		}
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String addChildren(@SessionAttribute(required = false) Long userId, Children children, Model model) {
		teacherRepository.save(children.getTeacher());
		childrenRepository.save(children);
		return "head";
//		if (userId != null) {
//
//			childrenRepository.save(children);
//
//			return "head";
//		} else {
//			return "loginTeacher";
//		}
	}

	@RequestMapping(path="/delete/{id}", method = RequestMethod.POST)
	public String deleteChildren(@PathVariable Long id, Model model, Children children) {
		childrenRepository.delete(childrenRepository.findOne(id));
		return "head";
	}
}

// + @RequestMapping(path="/delete/{id}", method = RequestMethod.POST)
// + public String deleteUserFromDb(@PathVariable Long id, Model model, User
// user) {
// + userRepository.delete(user);
// + model.addAttribute("user", user);
// + return "redirect:/user/all";
// + }