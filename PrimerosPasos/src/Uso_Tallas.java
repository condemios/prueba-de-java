
import java.util.*;
public class Uso_Tallas {

//	enum Talla {		mini, mediano, grande, muy_grande	};
	
	enum Talla{
		MINI("S"), MEDIANO("M");
		
		private Talla(String abreviatura){
			this.abreviatura=abreviatura;
			
		}
		
		public String dameAbreviatura(){
			return abreviatura;
		}
		private String abreviatura;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
System.out.println("Escribe una talla: ");
String entrada_datos=entrada.next().toUpperCase();
Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
System.out.println("Talla= " + la_talla);
System.out.println("abreviatura = " + la_talla.dameAbreviatura());

		
	}

}
