package myfbsearch;

//import java.awt.EventQueue;

import javax.swing.SwingUtilities;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.json.JsonObject;
import com.restfb.types.User;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import myfbsearch.controller.SearchController;
import myfbsearch.model.UserModel;


public class Main extends Application{
	
	private Stage primaryStage; //-> Container principal
	private BorderPane rootLayout;

	//Método costrutor
	public Main(){
		//userData.add(new UserModel("1", "Tiago", "1", "uehah"));
		//userData.add(new UserModel("2", "Pedro", "2", "2ih4b"));
	}
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
		primaryStage.setTitle("MyFBSearch");
		
		initRootlayout();
		
		showSearchView();
	}
	

	/**
	 * Método que inicializa o root layout
	 */
	private void initRootlayout() {
		// TODO Auto-generated method stub
		try{
			//Carrega o rootLayout do arquivo fxml.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			//Mostra a scene contendo o rootLayout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/**
	 * Mostra o searchview dentro do rootLayout
	 */
	public void showSearchView(){
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/SearchView.fxml"));
			AnchorPane searchView = (AnchorPane) loader.load();
			
			//Define o searchView dentro do rootLayout.
			rootLayout.setCenter(searchView);
			
			SearchController controller = loader.getController();
			controller.initialize();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	/**
     * Retorna o palco principal.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
	
}




























/*
	
		JsonObject picture = fbClient.fetchObject("me/picture", JsonObject.class, Parameter.with("redirect", "false"));
		System.out.println(picture);
		
	}
}	
*/