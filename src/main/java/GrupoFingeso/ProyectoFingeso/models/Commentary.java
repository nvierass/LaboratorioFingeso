package GrupoFingeso.ProyectoFingeso.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "commentaries")
public class Commentary {
	
	@Id
	String id;
	private String text;
	private String owner_username;

	public Commentary(String owner,String commentary) {
		this.owner_username = owner;
		this.text = commentary;
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
