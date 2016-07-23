package myfbsearch.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserModel {
	
	private final IntegerProperty id;
	private final StringProperty name;
	private final IntegerProperty pos;
	private final StringProperty picture;
	
	public UserModel(int id, String name, int pos, String picture){
		this.id = new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.pos = new SimpleIntegerProperty(pos);
		this.picture = new SimpleStringProperty(picture);
	}

	public final IntegerProperty idProperty() {
		return this.id;
	}
	

	public final int getId() {
		return this.idProperty().get();
	}
	

	public final void setId(final int id) {
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
	

	public final IntegerProperty posProperty() {
		return this.pos;
	}
	

	public final int getPos() {
		return this.posProperty().get();
	}
	

	public final void setPos(final int pos) {
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
