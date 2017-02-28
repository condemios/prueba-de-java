package paquetepruebas;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.text.*;



public class EscibiendoEnMarco5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Marco13 mimarco13=new Marco13();
mimarco13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//MarcoConTexto mimarco2= new MarcoConTexto();
//mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

mimarco13.setTitle("Ventana 1");
mimarco13.setBounds(300, 300, 500, 350);

//mimarco2.setTitle("Ventana 2");
//mimarco2.setBounds(900, 300, 500, 350);
	}

}
class Marco13 extends JFrame{
	public Marco13(){
		setVisible(true);
		setSize(1000, 750);

		add(new Lamina0());
				
		
	}
}



class Lamina0 extends JPanel{
	
	public Lamina0(){
	setLayout(new BorderLayout());
	add(new Lamina13(), BorderLayout.NORTH);
	area=new JTextPane();
	add(area, BorderLayout.CENTER);
	JPopupMenu emergente= new JPopupMenu();
	JMenuItem negritaE=new JMenuItem("Negrita");
	JMenuItem cursivaE=new JMenuItem("Cursiva");
	
	negritaE.addActionListener(new StyledEditorKit.BoldAction());
	cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
	
	emergente.add(negritaE);
	emergente.add(cursivaE);
	area.setComponentPopupMenu(emergente);
	
	/*JToolBar barra=new JToolBar();
	JButton negritaBarra=new JButton();
	JButton cursivaBarra=new JButton();
	JButton subBarra=new JButton();
	JButton azulBarra=new JButton();
	JButton amarilloBarra=new JButton();
	JButton rojoBarra=new JButton();
	
	negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
	cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
	subBarra.addActionListener(new StyledEditorKit.UnderlineAction());
	azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("", Color.BLUE));
	amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("", Color.YELLOW));
	rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("", Color.RED));
	
	barra.add(negritaBarra);
	barra.add(cursivaBarra);
	barra.add(subBarra);
barra.addSeparator();	
	
	barra.add(azulBarra);
	barra.add(amarilloBarra);
	barra.add(rojoBarra);
	*/
	barra = new JToolBar();
	configura_barra("").addActionListener(new StyledEditorKit.BoldAction());
	configura_barra("").addActionListener(new StyledEditorKit.ItalicAction());
	

	
	barra.setOrientation(1);
	add(barra, BorderLayout.WEST);
	
	}
	public JButton configura_barra(String ruta){
		
		JButton boton =new JButton(new ImageIcon(ruta));
		barra.add(boton);
		return boton;
		
	}
	
	
	class Lamina13 extends JPanel {
		

		public Lamina13(){
			setLayout(new FlowLayout());
			
			
			JMenuBar mibarra=new JMenuBar();
						
			fuente=new JMenu("Fuente"); 
			estilo=new JMenu("Estilo"); 
			tamano=new JMenu("Tamaño"); 
			
		//JMenuItem arial = new JMenuItem("Arial", new ImageIcon("src/graficos/bola.gif") );
		//	fuente.add(arial);
			
		configura("Arial", "fuente", "Arial", 9, 12);
		configura("Courier", "fuente", "Courier", 9, 24);
		configura("Verdana", "fuente", "Verdana", 9, 38);	
			
		configura("Negrita", "estilo", "", Font.BOLD, 1);
		configura("Cursiva", "estilo", "", Font.ITALIC, 1);
		
		//JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/graficos/bola.gi") );
		
				
		//JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/bola.gi") );
		
		//negrita.addActionListener(new StyledEditorKit.BoldAction());
		//cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		//estilo.add(negrita);
		//estilo.add(cursiva);
		
		
		
		
		
		configura("6", "tamaño", "", 9, 6);
		configura("12", "tamaño", "", 9, 12);
		configura("24", "tamaño", "", 9, 24);
		configura("38", "tamaño", "", 9, 38);
		
			mibarra.add(fuente);
			mibarra.add(estilo);
			mibarra.add(tamano);
			add(mibarra);
				
		}
		
		public void configura(String rotulo, String menu, String tipo_letra, int estilos, int tam){
			JMenuItem elem_menu=new JMenuItem(rotulo);
			if (menu=="fuente"){
				fuente.add(elem_menu);
				if(tipo_letra=="Arial"){
					elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Arial"));
					
				}else if (tipo_letra=="Courier"){
					elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Courier"));
				}else if (tipo_letra=="Verdana"){
					elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Verdana"));
				}
			}else if (menu=="estilo"){
				
				estilo.add(elem_menu);
				if(estilos==Font.BOLD){
					elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
					elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				}else if (estilos==Font.ITALIC){
					elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
				}
			}else if (menu=="tamaño"){
				tamano.add(elem_menu);
				elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("", tam));
			}
			
		}
		
	
	}	
			
		JTextPane area;
		JMenu fuente, estilo, tamano;
		Font letras;
		JButton negritaBarra, cursivaBarra, subBarra, azulBarra, amarilloBarra, rojoBarra;
		JToolBar barra;
	}
	
	


	

	
	
	
	


