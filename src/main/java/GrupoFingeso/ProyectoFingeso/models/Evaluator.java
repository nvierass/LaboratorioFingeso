package GrupoFingeso.ProyectoFingeso.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Evaluator{
	
	int id_evaluator;
	public String username;

	public int getID() {
		return id_evaluator;
	}
	public void setID(int id) {
		id_evaluator = id;
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
