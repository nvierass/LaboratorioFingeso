package GrupoFingeso.ProyectoFingeso.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Challenges")
public class Challenge {
	@Id
	String id;
	
	private String topic;
	private String description;
			
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	
}
