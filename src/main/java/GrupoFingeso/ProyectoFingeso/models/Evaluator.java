package GrupoFingeso.ProyectoFingeso.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Evaluators")
public class Evaluator{

	@Id
	String id;
	public String username;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public void evaluate(Idea publication) {
		
	}
	public void proposeChallenge(String topic) {
		
	}

}
