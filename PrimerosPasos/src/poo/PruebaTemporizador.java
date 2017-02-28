package poo;
import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente=new DameLaHora();
		
		
		javax.swing.Timer mitemporizador= new javax.swing.Timer(5000, oyente);
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		System.exit(0);
	}

}

class DameLaHora implements ActionListener{
	public void actionPerformed(ActionEvent e){
		Date ahora=new Date();
		System.out.println("Hora cada 5s: " + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
	
	

}