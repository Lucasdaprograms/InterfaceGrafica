package aula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	JTextField txtVisor = new JTextField();
	JButton btnUm = new JButton("1");
	JButton btnSoma = new JButton("+");
	JButton btnIgual = new JButton("=");
	
	double valor1, valor2;
	
	public Calculadora(){
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.add(txtVisor);
		txtVisor.setBounds(20, 20, 245, 40);
		
		paine.add(btnUm);
		btnUm.setBounds(20, 80, 60, 60);
		btnUm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		
		paine.add(btnSoma);
		btnSoma.setBounds(100, 80, 60, 60);
		btnSoma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
			}
		});
		
		paine.add(btnIgual);
		btnIgual.setBounds(180, 80, 60, 60);
		btnIgual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor2 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				Calculos calculos = new Calculos();
				txtVisor.setText("" + calculos.soma(valor1, valor2));
			}
		});
		
		paine.setLayout(null);
		this.setVisible(true);
		this.setSize(300,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Calculadora calc = new Calculadora();
	}
}
