package myfbsearch.model;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;

import myfbsearch.Main;
import myfbsearch.controller.SearchController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SearchModel {
	
	private ObservableList<UserModel> userData = FXCollections.observableArrayList();
	
	public SearchModel(){
		//userData.add(new UserModel("1", publicSearch.getData().get(i).getName(), Integer.toString(i), "IMG"));
	}
	
	public ObservableList<UserModel> getUserData(){
		return userData;
	}
	
	public ObservableList<UserModel> search(String token, String name){
		FacebookClient fbClient = new DefaultFacebookClient(token);		
		Connection<User> publicSearch = fbClient.fetchConnection("search", User.class, Parameter.with("q", 
				name), Parameter.with("type", "user"));
		
		for(int i = 0; i < 50; i++){
			userData.add(new UserModel(publicSearch.getData().get(i).getId(), publicSearch.getData().get(i).getName(), Integer.toString(i+1), "IMG"));

		}
		return userData;
	}
	
	public void atualizaTable(){
		
	}
	
	public void cancel(){
		
	}
	
}
