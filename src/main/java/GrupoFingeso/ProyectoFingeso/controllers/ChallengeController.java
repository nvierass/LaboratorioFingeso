package GrupoFingeso.ProyectoFingeso.controllers;

import GrupoFingeso.ProyectoFingeso.models.Challenge;
import GrupoFingeso.ProyectoFingeso.repositories.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "reto")

public class ChallengeController {
	@Autowired
	ChallengeRepository challengeRepository;
	
	//Index
	@RequestMapping(method = RequestMethod.GET)
	public List<Challenge> index() {
		return this.challengeRepository.findAll();
	}
	//Create
	@RequestMapping(value = "/create",method = RequestMethod.POST)
	@ResponseBody
    public Challenge create(@RequestBody Challenge idea) {
        return this.challengeRepository.save(idea);
    }
	/*Update
	@RequestMapping(value = "/create",method = RequestMethod.PUT)
	@ResponseBody
    public Challenge update(@RequestBody Challenge idea) {
        return this.challengeRepository.save(idea);
    }
	@RequestMapping(value = "/byTopic={topic}",method = RequestMethod.GET)
    public List<Challenge> searchTopic(@PathVariable String topic) {
        return this.challengeRepository.findChallengeByTopic(topic);
    }
    */
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public void delete() {
		this.challengeRepository.deleteAll();
	}
}

		
