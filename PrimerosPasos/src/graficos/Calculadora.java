package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora mimarco=new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}
class MarcoCalculadora extends JFrame{
	public MarcoCalculadora(){
		setTitle("Claculadora");
		setBounds(500,300,450,300);
		LaminaCalculadora milamina=new LaminaCalculadora();
		add(milamina);
		//pack();
	}
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora(){
		principio=true;
		setLayout(new BorderLayout());
		pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		
	
	milamina2.setLayout(new GridLayout(4,4));
	ActionListener inserta=new InsertaNumero();
	ActionListener orden=new AccionOrden();
	ponerBoton("7",inserta);
	ponerBoton("8",inserta);
	ponerBoton("9",inserta);
	ponerBoton("/",orden);
	ponerBoton("4",inserta);
	ponerBoton("5",inserta);
	ponerBoton("6",inserta);
	ponerBoton("*",orden);
	ponerBoton("1",inserta);
	ponerBoton("2",inserta);
	ponerBoton("3",inserta);
	ponerBoton("-",orden);
	ponerBoton("0",inserta);
	ponerBoton(".",orden);
	ponerBoton("=",orden);
	ponerBoton("+",orden);
	
	
	
	add(milamina2, BorderLayout.CENTER);
	ultima="=";
		
	}
	private void ponerBoton(String rotulo, ActionListener oyente){
		JButton boton=new JButton (rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton);
	}
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		String entrada=e.getActionCommand();
		if(principio){
			pantalla.setText("");
			principio=false;
		}
		pantalla.setText(pantalla.getText()+entrada);
			
		}
		
	}
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion=e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultima=operacion;
			principio=true;
			
		}
		public void calcular(Double x){
			if(ultima.equals("+")){
				resultado+=x;
			}
			else if(ultima.equals("-")){
				resultado-=x;}
			
			else if(ultima.equals("*")){
				resultado*=x;}
			else if(ultima.equals("/")){
				resultado/=x;}
			else if(ultima.equals("=")){
				resultado=x;
			}
		pantalla.setText(""+resultado);	
		}
	}
	private JPanel milamina2=new JPanel();
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultima;
}

