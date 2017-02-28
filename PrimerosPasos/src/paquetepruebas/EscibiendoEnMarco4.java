package paquetepruebas;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;



public class EscibiendoEnMarco4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Marco11 mimarco11=new Marco11();
mimarco11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//MarcoConTexto mimarco2= new MarcoConTexto();
//mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

mimarco11.setTitle("Ventana 1");
mimarco11.setBounds(300, 300, 500, 350);

//mimarco2.setTitle("Ventana 2");
//mimarco2.setBounds(900, 300, 500, 350);
	}

}
class Marco11 extends JFrame{
	public Marco11(){
		setVisible(true);
		setSize(1000, 750);

		add(new Lamina11());
				
	
		
	}
}



class Lamina11 extends JPanel {
	

	public Lamina11(){
		setLayout(new BorderLayout());
		rotulo = new JLabel("En un lugar de la mancha en cuyo nombre....");
		add(rotulo, BorderLayout.CENTER);
		control=new JSlider(6,50,20);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif",Font.ITALIC,10));
		JPanel laminas=new JPanel();
		control.addChangeListener(new eventos());
		laminas.add(control);
		add(laminas,BorderLayout.NORTH);
		System.out.println(""+control.getValue());
	}
		
	private class eventos implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			
			rotulo.setFont(new Font("Serif",Font.PLAIN,(int)control.getValue()));
			
			
		}
		
	}
	
	private JLabel rotulo;
	private  JSlider control;
	
	}
	
	


