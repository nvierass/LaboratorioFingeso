package GrupoFingeso.ProyectoFingeso.Models;

import java.util.List;

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
