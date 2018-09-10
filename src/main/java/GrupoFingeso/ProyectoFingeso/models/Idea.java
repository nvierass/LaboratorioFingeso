package GrupoFingeso.ProyectoFingeso.models;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Ideas")
public class Idea {
	@Id
	String id;
	
	private String name;
	private String owner_username;
	private String formulary_n;
	private String formulary_a;
	private String formulary_b;
	private String formulary_c;
	private Boolean formalized;
	private float evaluation;
	
	private int challengeId;
	private String challengeRelated;
	private Boolean categorized;
	
	public Idea(String name,String creator){
		this.name=name;
		this.owner_username = creator;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getOwner() {
		return this.owner_username;
	}
	public void setOwner(String owner) {
		this.owner_username = owner;
	}
	public String getN() {
		return this.formulary_n;
	}
	public void setN(String n) {
		this.formulary_n =n;
	}
	public String getA() {
		return this.formulary_a;
	}
	public void setA(String a) {
		this.formulary_a =a;
	}
	public String getB() {
		return this.formulary_b;
	}
	public void setB(String b) {
		this.formulary_b =b;
	}
	public String getC() {
		return this.formulary_c;
	}
	public void setC(String c) {
		this.formulary_c =c;
	}
	public float getEvaluation() {
		return this.evaluation;
	}
	public void setEvaluation(float ev) {
		this.evaluation = ev;
	}
	public Boolean getFormalized() {
		return this.formalized;
	}
	public void setFormalized(Boolean b) {
		this.formalized = b;
	}
	public Boolean getCategorized() {
		return this.categorized;
	}
	public void setCategorized(Boolean c) {
		this.categorized = c;
	}
	public String getChallenge() {
		return this.challengeRelated;
	}
	public void setChallenge(String nameChallenge) {
		this.challengeRelated = nameChallenge;
	}
	public int getChallengeId() {
		return this.challengeId;
	}
	public void setChallengeId(int id) {
		this.challengeId = id;
	}
	

}
