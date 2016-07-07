package myfbsearch.model;

public class User {
	private int id;
	private String name;
	private String picture;
	private int pos;
	
	public User(){
	}
	
	public User(int id, String name, String picture, int pos){
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.pos = pos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}
	
	

}
