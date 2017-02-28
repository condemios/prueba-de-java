package graficos;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;

public class EscibiendoEnMarco3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MarcoCheck mimarco=new MarcoCheck();
mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//MarcoConTexto mimarco2= new MarcoConTexto();
//mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

mimarco.setTitle("Ventana 1");
mimarco.setBounds(300, 300, 500, 350);

//mimarco2.setTitle("Ventana 2");
//mimarco2.setBounds(900, 300, 500, 350);
	}

}
class MarcoCheck extends JFrame{
	public MarcoCheck(){
		setVisible(true);
		setSize(1000, 750);

		add(new LaminaCheck());
				
	
		
	}
}



class LaminaCheck extends JPanel {
	

	public LaminaCheck(){
	setLayout(new BorderLayout());	
	texto=new JLabel("En un lugar de la mancha de cuyo nombre....");
	texto.setFont(new Font("Serif", Font.PLAIN, 18));
	add(texto,BorderLayout.CENTER);
	JPanel laminacombo=new JPanel();
	micombo=new JComboBox();
	micombo.setEditable(true);
	micombo.addItem("Serif");
	micombo.addItem("SansSerif");
	micombo.addItem("Monospaced");
	micombo.addItem("Dialog");
	Evento evento1=new Evento();
	micombo.addActionListener(evento1);
	laminacombo.add(micombo);
	add(laminacombo, BorderLayout.NORTH);

		
		
		
		
	}
	private class Evento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setFont(new Font(micombo.getSelectedItem()+"", Font.PLAIN, 18));
			
		}
		
		
	}
	
private JLabel texto;
private JComboBox micombo;

		
	}
	
	


	
	


