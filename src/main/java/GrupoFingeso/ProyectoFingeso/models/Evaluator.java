package GrupoFingeso.ProyectoFingeso.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Evaluator{
	@Id
	String id;
	public String username;

	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public Evaluator(String username) {
		this.username = username;
	}
	public void evaluate(Idea publication) {
		
	}
	public void proposeChallenge(String topic) {
		
	}

}
