package graficos;
import java.awt.*;
import java.swing.*;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fuente=JOptionPane.showInputDialog("introduce Fuente ");
		boolean existefuente=false;
		String [] fuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	for (String f:fuentes){
		if(f.equals(fuente)){
			existefuente=true;
		}
	}
		if(existefuente){
		System.out.println("fuente instalada");
		
	}else {System.out.println("fuente no instalada");}
		
		
	}

}
