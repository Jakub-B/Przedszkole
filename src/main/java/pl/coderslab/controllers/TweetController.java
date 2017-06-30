package pl.coderslab.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.coderslab.model.Tweet;
import pl.coderslab.repository.TweetRepository;
import pl.coderslab.repository.UserRepository;

@Controller
@RequestMapping("/tweet")
public class TweetController {

	@Autowired
	private TweetRepository tweetRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping(path="/add", method=RequestMethod.GET)
	public String test(Model model){
		model.addAttribute("tweet", new Tweet());
		model.addAttribute("users", userRepository.findAll());
		return "tweetForm";
	}
	
	
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public String processAddTweetForm(@Valid Tweet tweet, BindingResult result){
		
		if (result.hasErrors()){
			return "authorForm";
		}
		tweetRepository.save(tweet);
		return "redirect:/tweet/list";
	}
	
	@RequestMapping(path="/list", method=RequestMethod.GET)
	public String showBooks(Model model){
		model.addAttribute("tweets", tweetRepository.findAll());
		return "tweetList";
	}

}