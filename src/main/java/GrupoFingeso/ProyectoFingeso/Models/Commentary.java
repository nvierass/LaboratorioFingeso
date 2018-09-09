package GrupoFingeso.ProyectoFingeso.Models;

import java.sql.Date;

public class Commentary {
	private String text;
	//private Date created_at;
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
