package GrupoFingeso.ProyectoFingeso.controllers;

import GrupoFingeso.ProyectoFingeso.models.User;


import GrupoFingeso.ProyectoFingeso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	//Index
	@RequestMapping(value = "/user")
	public String user(Model model) {
		model.addAttribute("users",userRepository.findAll());
		return "user";
	}
	//Create
	@RequestMapping(value = "/create")
    public String create(Model model) {
        return "create";
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
