package poo;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Tipos_Cuadros_Dialogos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadros_Dialogos mimarco=new Cuadros_Dialogos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Cuadros_Dialogos extends JFrame{
	
	public Cuadros_Dialogos(){
		
		setBounds (100,100,800,650);	
		
		add(new Lamina1());
		
	}
	
}

class Lamina1 extends JPanel{
	
	public Lamina1(){
		
		setLayout(new BorderLayout());
		add(new Lamina2(), BorderLayout.SOUTH);
		add(new Lamina3(), BorderLayout.CENTER);
	
	
	}
	class Lamina2 extends JPanel{
		
		public Lamina2(){
				
			boton1=new JButton("Mostrar");
					
			boton1.addActionListener(new Accion_botones());
					
			add(boton1);
		}
	}
	class Lamina3 extends JPanel{
		public Lamina3(){
		setLayout(new GridLayout(2,3));
		
		add(new Lamina4());
		add(new Lamina4());
		add(new Lamina4());
		add(new Lamina4());
		add(new Lamina4());
		add(new Lamina4());
		
		setBorder(BorderFactory.createLineBorder(Color.black));
		
		}
	
	
	class Lamina4 extends JPanel{
		public Lamina4(){
			setLayout(new BorderLayout().EAST);
	
			JRadioButton mensaje=new JRadioButton("Mensaje");
			JRadioButton confirmar=new JRadioButton("Confirmar");
			JRadioButton opciones=new JRadioButton("Opciones");
			JRadioButton entrada=new JRadioButton("Entrada");
			ButtonGroup tipo=new ButtonGroup();
			tipo.add(mensaje);
			tipo.add(confirmar);
			tipo.add(opciones);
			tipo.add(entrada);
			add(mensaje);
			add(confirmar);
			add(opciones);
			add(entrada);
			setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1), "Prueba"));
		}
		
	}
	}
	private class Accion_botones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==boton1){
				
				//System.out.println("Has pulsado el botón 1");
				JOptionPane.showMessageDialog(Lamina2.this, "Hola mundo", "Prueba con Juan", 0 );
				
				
				
				
				
				
			}else if(e.getSource()==boton2){
				
				//System.out.println("Has pulsado el botón 2");
				JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this, "Eres un fenomeno", "Nueva prueba", 0);
				
				
				
				
			}else if(e.getSource()==boton3){
				
				JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Eres un fenomeno", "Nueva prueba", 2);
				
				
				
				
				
			}else{
				
				JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this, "Eres un fenomeno", "Nueva prueba", 2, 0, null,null,null);
				
				
				
				
				
			}
			
		}		
		
	}
	
	public JButton boton1, boton2, boton3, boton4;
}
