package myfbsearch.controller;

import myfbsearch.model.SearchModel;
import myfbsearch.model.TableModelUser;
import myfbsearch.view.SearchView;

public class SearchController {
	
	private SearchView view;
	private SearchModel s_model;
	private TableModelUser u_model;
	
	public SearchController(SearchView view, SearchModel s_model, TableModelUser u_model) {
		this.view = view;
		this.s_model = s_model;
		this.u_model = u_model;
	}

	public void search() {
		// TODO Auto-generated method stub
		System.out.println("teste");
	}
	
	public void save(){
		
	}

	public void cancel() {
		// TODO Auto-generated method stub
		
	}

}
