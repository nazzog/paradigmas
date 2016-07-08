package myfbsearch;

//import java.awt.EventQueue;

import javax.swing.SwingUtilities;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.json.JsonObject;
import com.restfb.types.User;

import myfbsearch.view.SearchView;

public class Main {
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
		    public void run() {
				SearchView tela = new SearchView();
		        tela.setVisible(true);
		    }
		});
		
		
		/*
		String acessToken = "EAACEdEose0cBAHATuWgUyNVZAd04ErpMjaH1B7C9K1WvqZB1VsVnVHgwZCc00EVijbA8J26hmZBqgY8nBS3h2U2EkaZCjv5Wf8d8XW2iKZBDvUWZCrqbRVZBNZBZAiD55ctDCB6qNwYjZCjukkMFsLcGsajDwdREZAXx8QH2oq9GAiWbeS97P2pOYZBgU4t1iT9fYoKRhgZAZBqvHWzozqu9xgDALzV";
		FacebookClient fbClient = new DefaultFacebookClient(acessToken);
		
		//User me = fbClient.fetchObject("me", User.class);
		
		Connection<User> publicSearch = fbClient.fetchConnection("search", User.class, Parameter.with("q", 
				"Mohnschmidt"), Parameter.with("type", "user"));
		for(int i = 0; i < 50; i++){
			System.out.println(publicSearch.getData().get(i).getName());
		}
		
		JsonObject picture = fbClient.fetchObject("me/picture", JsonObject.class, Parameter.with("redirect", "false"));
		System.out.println(picture);*/
	}
}	
