package myfbsearch.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserModel {
	
	private final StringProperty id;
	private final StringProperty name;
	private final StringProperty pos;
	private final StringProperty picture;
	
	public UserModel(String id, String name, String pos, String picture){
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.pos = new SimpleStringProperty(pos);
		this.picture = new SimpleStringProperty(picture);
	}

	public final StringProperty idProperty() {
		return this.id;
	}
	

	public final String getId() {
		return this.idProperty().get();
	}
	

	public final void setId(final String id) {
		this.idProperty().set(id);
	}
	

	public final StringProperty nameProperty() {
		return this.name;
	}
	

	public final String getName() {
		return this.nameProperty().get();
	}
	

	public final void setName(final String name) {
		this.nameProperty().set(name);
	}
	

	public final StringProperty posProperty() {
		return this.pos;
	}
	

	public final String getPos() {
		return this.posProperty().get();
	}
	

	public final void setPos(final String pos) {
		this.posProperty().set(pos);
	}
	

	public final StringProperty pictureProperty() {
		return this.picture;
	}
	

	public final String getPicture() {
		return this.pictureProperty().get();
	}
	

	public final void setPicture(final String picture) {
		this.pictureProperty().set(picture);
	}
}
