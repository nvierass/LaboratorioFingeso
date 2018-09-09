package GrupoFingeso.ProyectoFingeso.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "commentaries")
public class Commentary {
	
	@Id
	String id;
	private String text;
	private String owner_username;

	public Commentary(String owner,String com) {
		this.owner_username = owner;
		this.text = com;
		//this.created_at = new Date(****);
	}
	
	public void saveCommentary(){
		//implementar almacenado en la bd
		}
}
