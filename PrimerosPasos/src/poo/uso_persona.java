package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2009,02,25);
		lasPersonas[1]=new alumno("Ana Lopez", "ingenieria");
		
		for (Persona e:lasPersonas){
			System.out.println(e.dameNombre() + ", " + e.dameDescripcion());
		}
	}

}

abstract class Persona{
	
	public Persona(String nom){
		nombre=nom;
		
	}
	
	public String dameNombre(){
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
}
class Empleado2 extends Persona{
	public Empleado2(String nom, double sue, int agno, int mes, int dia){
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
				
	} 
	
	public String dameDescripcion(){
		return "Este empleado tiene un ID= " + Id + " con un sueldo " + sueldo;
	}

	public double dameSueldo(){//getter
		return sueldo;
	}
	
	public Date dameFechaContrato(){//getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
				sueldo+=aumento;
	}
	
	
	private double sueldo;
	private Date altaContrato;
	private int IdSiguiente;
	private int Id;
	}

class alumno extends Persona{
	
	public alumno(String nom, String car){
		super(nom);
		carrera=car;
		
	}
	
	public String dameDescripcion(){
		return "Este Alumno esta estudiando la carrera de " + carrera;
	}
	
private String carrera;
}