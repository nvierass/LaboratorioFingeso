package GrupoFingeso.ProyectoFingeso.controllers;


import GrupoFingeso.ProyectoFingeso.models.Idea;
import GrupoFingeso.ProyectoFingeso.repositories.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "idea")
public class IdeaController {
		@Autowired
		IdeaRepository ideaRepository;
		
		//Index
		@RequestMapping(method = RequestMethod.GET)
		public List<Idea> index() {
			return this.ideaRepository.findAll();
		}
		//Create
		@RequestMapping(value = "/create",method = RequestMethod.POST)
		@ResponseBody
	    public Idea create(@RequestBody Idea idea) {
	        return this.ideaRepository.save(idea);
	    }
		/*Update
		@RequestMapping(value = "/create",method = RequestMethod.PUT)
		@ResponseBody
	    public Idea update(@RequestBody Idea idea) {
	        return this.ideaRepository.save(idea);
	    }
	    //Filter By topic
		@RequestMapping(value = "/byTopic{topic}",method = RequestMethod.GET)
	    public List<Idea> searchTopic(@PathVariable String topic) {
	        return this.ideaRepository.findIdeaBytopic(topic);
	    }*/
		@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
		public void delete() {
			this.ideaRepository.deleteAll();
		}
}
