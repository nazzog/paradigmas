package myfbsearch.controller;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.json.JsonObject;
import com.restfb.types.User;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import myfbsearch.Main;
import myfbsearch.model.UserModel;
import myfbsearch.model.SearchModel;

public class SearchController {
	
	@FXML
	private TableView<UserModel> userTable;

	@FXML
	private TableColumn<UserModel, Integer> idColumn;
	
	@FXML
	private TableColumn<UserModel, String> nameColumn;
	
	@FXML
	private TableColumn<UserModel, Integer> posColumn;
	
	@FXML
	private TableColumn<UserModel, String> pictureColumn;
	
	@FXML
	private TextField tokenField;
	
	@FXML
	private TextField nameField;
	
	//Referência para Main.
	private Main main;
	
	private SearchModel searchModel;
	
	/*
	 * Construtor padrão.
	 */
	public SearchController(){
		
	}
	
	@FXML
	public void initialize(){
		//posColumn.setCellValueFactory(cellData -> cellData.getValue().posProperty());
		pictureColumn.setCellValueFactory(cellData -> cellData.getValue().pictureProperty());
		//idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
		
		
	}
	
	@FXML
	public void handleSearch(){
		String acessToken = tokenField.getText(); //recebe a token digitada na tokenField.
		String name = nameField.getText(); //nome passado no campo nameField.
		SearchModel sm = new SearchModel();
		sm.search(acessToken, name);
	}
	
	@FXML
	public void handleCancel(){
		
		Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Testando Botão");
        alert.setHeaderText("Botão Cancel pressionado");
        alert.setContentText("Teste Bem Sucedido");

        alert.showAndWait();
	}
	
	public void setMain(Main main){
		this.main = main;
		
		userTable.setItems(main.getUserData());
	}
	
}
