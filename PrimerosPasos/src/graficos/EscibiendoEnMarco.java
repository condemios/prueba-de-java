package graficos;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;

public class EscibiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MarcoConTexto mimarco=new MarcoConTexto();
mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//MarcoConTexto mimarco2= new MarcoConTexto();
//mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

mimarco.setTitle("Ventana 1");
mimarco.setBounds(300, 300, 500, 350);

//mimarco2.setTitle("Ventana 2");
//mimarco2.setBounds(900, 300, 500, 350);
	}

}
class MarcoConTexto extends JFrame{
	public MarcoConTexto(){
		setVisible(true);
		setSize(1000, 750);

		add(new Lamina());
				
	
		
	}
}



class Lamina extends JPanel {
	

	public Lamina(){
			setLayout(new BorderLayout());
			JPanel lamina_superior=new JPanel();
			lamina_superior.setLayout(new GridLayout(2,2));
			add(lamina_superior, BorderLayout.NORTH);
			JLabel etiqueta1=new JLabel("Usuario");
			JLabel etiqueta2=new JLabel("Contraseña");
			JTextField c_usuario=new JTextField(15);
			Comprueba_pass mievento=new Comprueba_pass();
			c_contra.getDocument().addDocumentListener(mievento);
			lamina_superior.add(etiqueta1);
			lamina_superior.add(c_usuario);
			lamina_superior.add(etiqueta2);
			lamina_superior.add(c_contra);
			JButton enviar=new JButton("Enviar");
			add(enviar, BorderLayout.SOUTH);
			
	}
	
	private class Comprueba_pass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		
		}

		@Override
		public void insertUpdate(DocumentEvent e) {

			char[] contrasena;
			contrasena=c_contra.getPassword();
			if(contrasena.length<8 || contrasena.length>12){
				c_contra.setBackground(Color.RED);
			}else{
				c_contra.setBackground(Color.WHITE);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			char[] contrasena;
			contrasena=c_contra.getPassword();
			if(contrasena.length<8 || contrasena.length>12){
				c_contra.setBackground(Color.RED);
			}else{
				c_contra.setBackground(Color.WHITE);
			}
		}
		
	}
	JPasswordField c_contra=new JPasswordField(15);		
}

	
	


