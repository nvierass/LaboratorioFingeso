package GrupoFingeso.ProyectoFingeso.Models;

public class User {
	
	
	public int id_user;
	public String username;
	/*Metodos Get y Set*/
	public int getID() {
		return id_user;
	}
	public void setID(int id) {
		id_user = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void commentIdea(Idea publication) {
		String commentary = System.console().readLine();
		publication.addCommentary(this.username,commentary);
	}
	
	public void publicateIdea() {
		
		
	}
}
