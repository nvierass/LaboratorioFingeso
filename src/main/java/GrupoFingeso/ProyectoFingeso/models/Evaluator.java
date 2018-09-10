package GrupoFingeso.ProyectoFingeso.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Evaluators")
public class Evaluator{
	
	//Atributes
	@Id
	String id;
	public String username;
	//Constructor
	public Evaluator(String name) {
		this.username = name;
	}
	
	// Gets and Sets
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

	//Methods
	public void evaluate(Idea publication) {
		
	}
	public void proposeChallenge(String topic) {
		
	}

}
