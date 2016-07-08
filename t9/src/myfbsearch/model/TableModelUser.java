package myfbsearch.model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModelUser extends AbstractTableModel {
	
	private static final String[] columnNames = {"pos","picture","id","name"};
	private ArrayList<User> users;
	
	public TableModelUser(){
		
	}
	
	public void save(){
		
	}
	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return users.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}
	
	@Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch(columnIndex){
			case 0: users.get(rowIndex).getPos();
			case 1: users.get(rowIndex).getPicture();
			case 2: users.get(rowIndex).getId();
			case 3: users.get(rowIndex).getName();
		}
		return null;
	}

}
