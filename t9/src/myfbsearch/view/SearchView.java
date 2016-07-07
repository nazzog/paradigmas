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

public class SearchView extends JFrame {

	private JPanel contentPane;
	private JTable tableUser;
	private JTextField textFieldToken;
	private JTextField textFieldSearch;

	/**
	 * Create the frame.
	 */
	public SearchView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel labelAppName = new JLabel("MyFacebookSearch");
		GridBagConstraints gbc_labelAppName = new GridBagConstraints();
		gbc_labelAppName.insets = new Insets(0, 0, 5, 0);
		gbc_labelAppName.gridx = 0;
		gbc_labelAppName.gridy = 0;
		contentPane.add(labelAppName, gbc_labelAppName);
		
		JPanel panelSearch = new JPanel();
		panelSearch.setLayout(null);
		GridBagConstraints gbc_panelSearch = new GridBagConstraints();
		gbc_panelSearch.insets = new Insets(0, 0, 5, 0);
		gbc_panelSearch.fill = GridBagConstraints.BOTH;
		gbc_panelSearch.gridx = 0;
		gbc_panelSearch.gridy = 2;
		contentPane.add(panelSearch, gbc_panelSearch);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(111, 5, 197, 19);
		panelSearch.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JLabel labelToken = new JLabel("Token");
		labelToken.setBounds(12, 4, 81, 20);
		panelSearch.add(labelToken);
		
		textFieldToken = new JTextField();
		textFieldToken.setBounds(111, 36, 197, 21);
		panelSearch.add(textFieldToken);
		textFieldToken.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(118, 81, 95, 21);
		panelSearch.add(btnSearch);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(227, 82, 81, 19);
		panelSearch.add(btnCancel);
		
		JLabel labelSearch = new JLabel("Search User");
		labelSearch.setBounds(12, 36, 100, 19);
		panelSearch.add(labelSearch);
		
		JScrollPane scrollPaneUser = new JScrollPane();
		GridBagConstraints gbc_scrollPaneUser = new GridBagConstraints();
		gbc_scrollPaneUser.gridheight = 2;
		gbc_scrollPaneUser.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneUser.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneUser.gridx = 0;
		gbc_scrollPaneUser.gridy = 3;
		contentPane.add(scrollPaneUser, gbc_scrollPaneUser);
		
		tableUser = new JTable();
		scrollPaneUser.setViewportView(tableUser);
		
		JButton btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnSave.gridx = 0;
		gbc_btnSave.gridy = 7;
		contentPane.add(btnSave, gbc_btnSave);
	}
}
