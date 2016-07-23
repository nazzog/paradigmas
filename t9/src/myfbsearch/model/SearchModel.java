package myfbsearch.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SearchModel {
	
	private ObservableList<UserModel> userData = FXCollections.observableArrayList();
	
	private String token;
	private String name;
	
	public SearchModel(){
		userData.add(new UserModel(1, "Tiago", 1, "uehah"));
		userData.add(new UserModel(2, "Pedro", 2, "2ih4b"));
	}
	
	public SearchModel(String token, String name){
		this.token = token;
		this.name = name;
	}
	
	public ObservableList<UserModel> getUserData(){
		return userData;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
