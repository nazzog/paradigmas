package myfbsearch;

import java.awt.EventQueue;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.json.JsonObject;
import com.restfb.types.User;

import myfbsearch.view.SearchView;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchView frame = new SearchView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
		
		
		/*String acessToken = "EAACEdEose0cBAFCQZCZCef42nXx0VctOI3FebQCTqjWicjijPdwsqVkyIZCHBV3G8cxmfB4K9302sGF92Mi9AsWsBp4KZCwwKf62pLByYmaVjYpUExsZByNRVdGDIvoZCSp5pAcdL2DHvxeugcWNTd2plf9EOZAxiIZCGorsalvdhQZDZD";
		FacebookClient fbClient = new DefaultFacebookClient(acessToken);
		
		User me = fbClient.fetchObject("me", User.class);
		
		Connection<User> publicSearch = fbClient.fetchConnection("search", User.class, Parameter.with("q", 
				"Mohnschmidt"), Parameter.with("type", "user"));
		for(int i = 0; i < 3; i++){
			System.out.println(publicSearch.getData().get(i).getName());
			
			JsonObject picture = fbClient.fetchObject("me/picture", JsonObject.class, Parameter.with("redirect", "false"));
			System.out.println(picture);
			*/		
