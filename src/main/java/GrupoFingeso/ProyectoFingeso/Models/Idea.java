package GrupoFingeso.ProyectoFingeso.Models;

import java.sql.Date;
import java.util.List;

public class Idea {
	private int idIdea;
	
	private String name;
	private String owned_username;
	private Date created_at;
	private float evaluation;
	private String formulary_n;
	private String formulary_a;
	private String formulary_b;
	private String formulary_c;
	private Boolean formalized;
	
	private List<Commentary> commentarys;
	
	public Idea(int id){
		this.idIdea=id;
		//Buscar resto de atributos a partir de la bd
		
	}
	public void addCommentary(String owner,String com) {
		this.commentarys.add(new Commentary(owner,com));
	}
	
	public void formalize() {
		
	}
	

}
