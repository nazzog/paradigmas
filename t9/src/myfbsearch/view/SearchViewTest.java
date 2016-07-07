package myfbsearch.view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import myfbsearch.controller.SearchController;

public class SearchViewTest extends JFrame {
	
	private SearchController controller;
   
	private JTextField tf_token;
	private JTextField tf_search;
	private JLabel lbl_token;
	private JLabel lbl_search;
	private JButton btn_search;
	private JButton btn_cancel;
	private JButton btn_save;
   
	/**
	 * Método construtor.
	 * Cria uma nova janela.
	 */
	public SearchViewTest() {
		tf_token = new JTextField();
		tf_search = new JTextField();
		lbl_token = new JLabel("Token");
		lbl_search = new JLabel("Search");
		btn_search = new JButton("Search");
		btn_cancel = new JButton("Cancel");
		btn_save = new JButton("Save");
		criaComponentes();
	}
   
   /**
    * Método que monta a interface.
    * Adiciona os componentes, define configurações de layout e 
    * vincula os eventos aos métodos que devem ser executados.
    */
   private void criaComponentes() {
      // Inicialização da JFrame.
      this.setMinimumSize(new Dimension(400, 600));
      this.setTitle("My Facebook Search");
      this.setResizable(false);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Adicionando um GridLayout
      setLayout(new GridLayout(2, 1));
      
      Container cp = getContentPane();
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(4, 4));
      panel.add(lbl_token);
      panel.add(tf_token);
      panel.add(lbl_search);
      panel.add(tf_search);
      panel.add(btn_search);
      panel.add(btn_cancel);
      cp.add(panel);
      
      lbl_token.setBounds(10, 20, 50, 15);
      tf_token.setBounds(10, 20, 50, 15);
      
      
      // Registra a ação a ser executada ao pressionar o botão.
      btn_search.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            btnSearchClicado(e);
         }
      });
      
      btn_cancel.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			btnCancelClicado(e);
			
		}
	});
      
      
      // Avisa ao gerenciador de layout que não há novos componentes a serem adicionados.
      this.pack();
   }
   
   private void btnSearchClicado(ActionEvent e) {
	   controller.search();
   }
   
   private void btnCancelClicado(ActionEvent e) {
	   controller.cancel();	   
   }
}