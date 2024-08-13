package com.FriendManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.FriendManagementSystem.Entity.Friend;
import com.FriendManagementSystem.service.FriendService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private FriendService service;
	
	
	@GetMapping("/Home")
	public String home()
	{
		return "Home";
	}
	@GetMapping("/Friends")
	public String getAllStudent(Model model) {
		System.out.println("Hello ");
		model.addAttribute("Friends",service.getAllFriend());
		
		System.out.println("Hello ");
		return "Friends";
		
		
	}
	@GetMapping("Friends/New")
	public String CreateFriendsForm(Model model) {
		
		Friend friend=new Friend();
		model.addAttribute("Friends",friend);
		
		return "create-Friend";
	}
	@PostMapping("/Friends")
	public String saveFriend(@ModelAttribute("Friends") Friend friend) {
		 service.saveFriend(friend);
		 
		 return "redirect:/Friends";
	}
	@GetMapping("/Friends/edit/{id}")
	public String editFriendForm(@PathVariable int id, Model model)
	{
		model.addAttribute("Friends",service.getById(id));
		return "edit_friend";
		
	}

}
