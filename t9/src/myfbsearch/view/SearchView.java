package myfbsearch.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import myfbsearch.controller.SearchController;
import myfbsearch.model.SearchModel;
import myfbsearch.model.TableModelUser;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class SearchView extends JFrame {

	private JPanel contentPane;
	private JTable tableUser;
	private JTextField textFieldToken;
	private JTextField textFieldSearch;
	
	private SearchController controller;
	private SearchModel searchModel;
	private TableModelUser tableModelUser;

	/**
	 * Create the frame.
	 */
	public SearchView() {
		tableModelUser = new TableModelUser();
		searchModel = new SearchModel();
		tableUser.setModel(tableModelUser);
		controller = new SearchController(this, searchModel, tableModelUser);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelSearch = new JPanel();
		panelSearch.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelSearch.setLayout(null);
		
		textFieldSearch = new JTextField();
		
		textFieldSearch.setBounds(111, 49, 148, 19);
		panelSearch.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JLabel labelToken = new JLabel("Token");
		labelToken.setBounds(12, 16, 81, 20);
		panelSearch.add(labelToken);
		
		textFieldToken = new JTextField();
		
		textFieldToken.setBounds(111, 16, 148, 21);
		panelSearch.add(textFieldToken);
		textFieldToken.setColumns(10);
		
		JLabel labelSearch = new JLabel("Search User");
		labelSearch.setBounds(12, 49, 100, 19);
		panelSearch.add(labelSearch);
		
		JScrollPane scrollPaneUser = new JScrollPane();
		scrollPaneUser.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		tableUser = new JTable();
		tableUser.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
		
		tableUser.setShowVerticalLines(false);
		tableUser.setShowHorizontalLines(false);
		tableUser.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPaneUser.setRowHeaderView(tableUser);
		//scrollPaneUser.setViewportView(tableUser);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonSaveActionPerformed(evt);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelSearch, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
								.addComponent(scrollPaneUser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panelSearch, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(scrollPaneUser, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(62, 80, 90, 19);
		panelSearch.add(btnSearch);
		
		btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(178, 80, 81, 19);
		panelSearch.add(btnCancel);
		
		btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
		
		
		contentPane.setLayout(gl_contentPane);
		
	}
	
	public JTable getTableUser() {
        return tableUser;
    }

	protected void tableUserMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void buttonSaveActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		controller.save();
	}

	protected void buttonCancelActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		controller.search();
	}

	protected void buttonSearchActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		controller.cancel();
	}
}
