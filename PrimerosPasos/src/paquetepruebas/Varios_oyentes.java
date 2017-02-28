package paquetepruebas;
import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
public class Varios_oyentes {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	miMarco marco1=new miMarco();
	marco1.setVisible(true);
	marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

	}

	class miMarco extends JFrame{
		public miMarco(){
			
			 setBounds(500, 300, 550, 250);
			 setTitle("Mi ventna");
			 PanelAccion lamina=new PanelAccion();
			 add(lamina);
			 		 
			 
		}
	}

	class PanelAccion extends JPanel{
		
				
		public PanelAccion(){
			
JButton nuevo=new JButton("Nuevo");
add(nuevo);

cerrar = new JButton("Cerrar Todo");
add(cerrar);
			
nuevo.addActionListener(new OyenteNuevo());


			
			
		}
		private class OyenteNuevo implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Marco_e marco=new Marco_e(cerrar);
				marco.setVisible(true);
				
			}
		}
		JButton cerrar;
		}
		
		class Marco_e extends JFrame{
			public Marco_e(JButton botondeprincipal){
				contador++;
				setTitle("Ventana " + contador);
				setBounds(40*contador, 40*contador, 300, 150);
				CierraTodo oyenteCerrar=new CierraTodo();
				botondeprincipal.addActionListener(oyenteCerrar);
				
			
			}
		private class CierraTodo implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				contador=0;
			}
			
		}
		private static int contador=0;
		}	
		


		
	
