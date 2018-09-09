package GrupoFingeso.ProyectoFingeso.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "challenges")
public class Challenge {
	@Id
	int id_challenge;
	
	private String topic;
	private String description;
		
	public Challenge(String topic,String description) {
		this.topic = topic;
		this.description = description;
	}
	
	public int getId() {
		return this.id_challenge;
	}
	public void setId(int id) {
		this.id_challenge = id;
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
