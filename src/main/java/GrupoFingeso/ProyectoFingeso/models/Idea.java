package GrupoFingeso.ProyectoFingeso.models;


import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Ideas")
public class Idea {
	@Id
	String id;
	
	private String name;
	private String text;
	private String owner;
	private int positiveCount;
	private int negativeCount;
	private float evaluation;
	private String topic;
	
	private ArrayList<Commentary> commentaries;
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public int getPositiveCount() {
		return this.positiveCount;
	}
	public void setPositiveCount(int positiveCount) {
		this.positiveCount = positiveCount;
	}
	public int getNegativeCount() {
		return this.negativeCount;
	}
	public void setNegativeCount(int negativeCount) {
		this.positiveCount = negativeCount;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public ArrayList<Commentary> getcommentaries(){
		return this.commentaries;
	}
	public void addCommentary(Commentary com) {
		this.commentaries.add(com);
	}
	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.name=topic;
	}
	
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public float getEvaluation() {
		return this.evaluation;
	}
	public void setEvaluation(float ev) {
		this.evaluation = ev;
	}
}
