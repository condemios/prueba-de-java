package paquetepruebas;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class textoarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Marco marco1=new Marco();
marco1.setVisible(true);
marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame{
	public Marco(){
		
		 setBounds(500, 300, 550, 250);
		 setTitle("Mi ventna");
		 	
		 setLayout(new BorderLayout());
		 
		 laminaBotones=new JPanel();
		 botonInsertar=new JButton("Insertar");
		 
		 botonInsertar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
				
			}
			 
		 });
		 laminaBotones.add(botonInsertar);
		 
		 botonSaltoLinea=new JButton("Salto Línea");
		 botonSaltoLinea.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			boolean saltar=!areaTexto.getLineWrap();
			areaTexto.setLineWrap(saltar);
			if (saltar==true){
				botonSaltoLinea.setText("Quitar Salto");
				
			}else{
				botonSaltoLinea.setText("Salto Línea");
			}
			}
			 
		 });
		 laminaBotones.add(botonSaltoLinea);
		 add(laminaBotones, BorderLayout.SOUTH);
		 areaTexto=new JTextArea(8,20);
		 laminaconbarras=new JScrollPane (areaTexto);
		 add(laminaconbarras, BorderLayout.CENTER);
		 
		 
		 
	}
	private JPanel laminaBotones;
	private JButton botonInsertar;
	private JButton botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaconbarras;
	
	
}
