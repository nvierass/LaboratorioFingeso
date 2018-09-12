package GrupoFingeso.ProyectoFingeso.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Commentaries")
public class Commentary {
	
	@Id
	String id;
	private String text;
	private String owner_username;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getOwner() {
		return this.owner_username;
	}
	public void setOwner(String owner) {
		this.owner_username = owner;
	}
}
