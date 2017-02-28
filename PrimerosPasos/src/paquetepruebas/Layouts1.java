package paquetepruebas;
		
		import javax.swing.*;
		import java.awt.*;
		import javax.imageio.*;
		import java.io.*;
		import java.awt.event.*;
public class Layouts1 {

	public static void main(String[] args) {
	
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
				Lamina milamina=new Lamina();
				//FlowLayout disposicion= new FlowLayout(FlowLayout.LEFT);
				
				
				add(milamina,BorderLayout.NORTH);
				add(new Lamina2(), BorderLayout.SOUTH);
						
			
				
			}
		}



		class Lamina extends JPanel {
			
			public Lamina(){
				setLayout(new FlowLayout(FlowLayout.LEFT));
				add(new JButton("amarillo"));
				add(new JButton("Rojo"));
				add(new JButton("Azul"));
				}
		}

			
			class Lamina2 extends JPanel {
				
				public Lamina2(){
					setLayout(new BorderLayout());
					add(new JButton("Negro"),BorderLayout.NORTH);
					add(new JButton("Verde"), BorderLayout.SOUTH);
					add(new JButton("Blanco"), BorderLayout.WEST);
					}
			
			

	}


