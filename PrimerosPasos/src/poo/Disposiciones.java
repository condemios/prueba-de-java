package poo;
import java.awt.*;
import javax.swing.*;

public class Disposiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
miMarco1 marco2=new miMarco1();

marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
marco2.setVisible(true);
	}

}

class miMarco1 extends JFrame{
	public miMarco1(){
		
		 setBounds(100, 100, 500, 350);
		 setTitle("Mi ventna");
		
		/* JLabel rotulo1=new JLabel("Nombre");
		 JTextField texto1=new JTextField(10);
		 texto1.setMaximumSize(texto1.getPreferredSize());
		 Box cajah1=Box.createHorizontalBox();
		 cajah1.add(rotulo1);
		 cajah1.add(Box.createHorizontalStrut(10));
		 cajah1.add(texto1);
		 
		 JLabel rotulo2=new JLabel("Contraseña");
		 JTextField texto2=new JTextField(10);
		 texto2.setMaximumSize(texto2.getPreferredSize());
		 Box cajah2=Box.createHorizontalBox();
		 cajah2.add(rotulo2);
		 cajah2.add(Box.createHorizontalStrut(1));
		 cajah2.add(texto2);
		 
		 JButton boton1=new JButton("OK");
		 JButton boton2=new JButton("Cancelar");
		 Box cajah3=Box.createHorizontalBox();
		 cajah3.add(boton1);
		 cajah3.add(Box.createGlue());
		 cajah3.add(boton2);
		 
		 Box cajaV=Box.createVerticalBox();
		 cajaV.add(cajah1);
		 cajaV.add(cajah2);
		 cajaV.add(cajah3);
		 
		 add(cajaV,BorderLayout.CENTER);
		 */
		 Lamina6 milamina6= new Lamina6();
		 add(milamina6);
		 
				 		 
		 
	}
}

class Lamina6 extends JPanel{
	public Lamina6(){
		
		JButton boton1=new JButton("OK");
		JButton boton2=new JButton("Cancelar");
		 JButton boton3=new JButton("boton 3");
		 boton1.setBounds(50, 50, 150, 50);
		 boton2.setBounds(50, 150, 150, 50);
		 boton3.setBounds(50, 250, 150, 50);
		 setLayout(new EnColumnas());
		 add(boton1);
		add(boton2);
		add(boton3);
		 
		/* 
		 Spring mimuelle=Spring.constant(0,10,100);
		 milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
		 milayout.putConstraint(SpringLayout.WEST, boton2, mimuelle, SpringLayout.EAST, boton1);
		 milayout.putConstraint(SpringLayout.WEST, boton3, mimuelle, SpringLayout.EAST, boton2);
		 milayout.putConstraint(SpringLayout.WEST, this, mimuelle, SpringLayout.EAST, boton3);
		
		*/
		
	}
class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
		int contador=0;
		int d=micontenedor.getWidth();
		x=d/2;
		y=20;
		int n=micontenedor.getComponentCount();
		for (int i=0;i<n;i++){
			contador++;
			Component c=micontenedor.getComponent(i);
			c.setBounds(x-100, y, 100, 20);
			x+=100;
			if (contador%2==0){
				x=d/2;
				y=40;
			}
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	private int x;
	private int y;
	
	
}

}

