package poo;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruuebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Reloj miReloj = new Reloj();
miReloj.enMarcha(4000, true);
JOptionPane.showMessageDialog(null, "Pulsa para terminar");
System.exit(0);

	}

}


class Reloj{
	
	
	public void enMarcha(final int intervalo, final boolean sonido){
		class DameLaHora2 implements ActionListener{
			public void actionPerformed(ActionEvent evento){
				Date ahora= new Date();
				System.out.println("Te pongo la hora " + ahora);
				if (sonido){
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente= new DameLaHora2();
		Timer mitemporizador= new Timer(intervalo, oyente);
				mitemporizador.start();
	}
	
	
}