package pl.coderslab.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.BindingType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import pl.coderslab.model.Teacher;
import pl.coderslab.repository.ChildrenRepository;
import pl.coderslab.repository.TeacherRepository;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;

	@Autowired
	private ChildrenRepository childrenRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		model.addAttribute("teacher", new Teacher());
		return "loginTeacher";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	
	public String loginUser(@ModelAttribute Teacher teacher, Model model, HttpServletRequest request) {
		Teacher teacherToCheck = teacherRepository.findByLogin(teacher.getLogin());

		if (teacherToCheck != null && teacher.getPassword().equals(teacherToCheck.getPassword())) {
			request.getSession().setAttribute("userId", teacherToCheck.getId());
			return "head";
		} else {
			request.getSession().removeAttribute("userId");
			return "loginTeacher";
		}
	}

	@RequestMapping(path = "/listChildren", method = RequestMethod.GET)

	public String logining(@SessionAttribute(required=false) Long userId, Model model) {
		if (userId != null) {
			model.addAttribute("childrens", childrenRepository.findAll());

			return "childrenList";
		} else {
			return "loginTeacher";
		}

	}

	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "logout";
	}

}
