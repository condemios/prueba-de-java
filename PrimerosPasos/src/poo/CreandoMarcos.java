package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CreandoMarcos {

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
		
		AccionColor acciona=new AccionColor(
				"Amarillo", new ImageIcon("src/graficos/3.jpg"), Color.YELLOW);
		AccionColor accionv=new AccionColor(
				"Verde", new ImageIcon("src/graficos/3.jpg"), Color.GREEN);		
		AccionColor accionr=new AccionColor(
				"Rojo", new ImageIcon("src/graficos/3.jpg"), Color.RED); 
		
		add(new JButton(acciona));
		add(new JButton(accionv));
		add(new JButton(accionr));
		
		InputMap mapaE=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke ta=KeyStroke.getKeyStroke("ctrl A");
		mapaE.put(ta, "fondo_amarillo");
		
		ActionMap mapaAccion=getActionMap();
		
		getActionMap().put("fondo_amarillo", acciona);
		
		KeyStroke tv=KeyStroke.getKeyStroke("ctrl V");
		mapaE.put(tv, "fondo_verde");
		mapaAccion.put("fondo_verde", accionv);
		
		KeyStroke tr=KeyStroke.getKeyStroke("ctrl R");
		mapaE.put(tr, "fondo_rojo");
		mapaAccion.put("fondo_rojo", accionr);
		
		
		
		
	}
	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Icon icono, Color colorb){
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono); 
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre); 
			putValue("color_de_fondo", colorb);
			
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
		Color c=(Color)getValue("color_de_fondo");
		setBackground(c);
		System.out.println(getValue(Action.NAME) + " " + getValue(Action.SHORT_DESCRIPTION));
		
		}
}

	
}