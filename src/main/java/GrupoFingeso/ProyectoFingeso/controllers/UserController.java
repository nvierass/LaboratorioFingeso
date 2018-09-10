package GrupoFingeso.ProyectoFingeso.controllers;

import GrupoFingeso.ProyectoFingeso.models.User;


import GrupoFingeso.ProyectoFingeso.repositories.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	//Index
	@RequestMapping(method = RequestMethod.GET)
	public List<User> index() {
		return this.userRepository.findAll();
	}
	//Create
	@RequestMapping(value = "/create-{username}",method = RequestMethod.POST)
    public User create(@PathVariable String username) {
		User user = new User(username);
        return this.userRepository.save(user);
    }
	//Store
	@RequestMapping(value = "/save")
	public String save(@RequestParam String username) {
		User user = new User(username);
		userRepository.save(user);
		return "redirect:/show/"+user.getId();
	}
	//Show
	@RequestMapping(value = "/show/{id}")
	public String show(@PathVariable String id,Model model) {
		model.addAttribute("user",userRepository.findUserById(id));
		return "redirect:/user";
	}
	//Edit
	@RequestMapping(value = "/edit/{id}")
	public String edit(@PathVariable String id,Model model) {
		model.addAttribute("user",userRepository.findUserById(id));
		return "edit";
	}
	//Update
	@RequestMapping(value = "/update")
	public String update(@RequestParam String id,@RequestParam String username) {
		User user = userRepository.findUserById(id);
		user.setUsername(username);
		userRepository.save(user);
		return "redirect:/show/"+user.getId();
	}
	//Destroy
	@RequestMapping(value = "/delete")
	public String delete(@RequestParam String id) {
		User user = userRepository.findUserById(id);
		userRepository.delete(user);
		return "redirect:/user";
	}
	
}
