package com.guptaakshay.jokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guptaakshay.jokes.service.JokeService;

@Controller
public class JokeController {

	private JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	};
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}
	
}
