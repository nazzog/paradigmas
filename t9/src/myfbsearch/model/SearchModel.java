package myfbsearch.model;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SearchModel {
	
	
	public SearchModel(){

	}
	
	public void search(String token, String name){
		FacebookClient fbClient = new DefaultFacebookClient(token);		
		Connection<User> publicSearch = fbClient.fetchConnection("search", User.class, Parameter.with("q", 
				name), Parameter.with("type", "user"));
		
		for(int i = 0; i < 50; i++){
			System.out.println(publicSearch.getData().get(i).getName());
		}
	}
	
}
