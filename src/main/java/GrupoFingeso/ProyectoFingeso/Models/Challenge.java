package GrupoFingeso.ProyectoFingeso.Models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Challenge {
	private String topic;
	private String description;
	
	private List<Idea> relatedIdeas;
	
	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addIdea(Idea newIdea) {
		relatedIdeas.add(newIdea);
	}
}
