package poo;

import java.util.*;

public class uso_empleado {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006,9,25);
		jefe_RRHH.establece_incentivo(2570);
			Empleado[] misEmpleados=new Empleado[6];
			misEmpleados[0]=new Empleado("Ana", 30000, 2000, 07, 07);
			misEmpleados[1]=new Empleado("Carlos", 50000, 1995, 06, 15);
			misEmpleados[2]=new Empleado("Paco", 25000, 2005, 9, 25);
			misEmpleados[3]=new Empleado("Antonio", 47500, 2009,11,9);
			misEmpleados[4]=jefe_RRHH; 
			misEmpleados[5]=new Jefatura ("Maria", 95000,1999,5,26);
			
			Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
			jefa_Finanzas.establece_incentivo(55000);
			
			System.out.println(jefa_Finanzas.tomar_decisiones("Dar vacaciones"));
			
			System.out.println("El Jefe "+ jefa_Finanzas.dameNombre() + " tiene un bonus de "
					+ jefa_Finanzas.establece_bonus(500));
			System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de : " 
					+misEmpleados[3].establece_bonus(200));
			
			for(Empleado e:misEmpleados){
				e.subeSueldo(5);
			}
		Arrays.sort(misEmpleados);
			for(Empleado e:misEmpleados){
				System.out.println("Nombre: " + e.dameNombre()
				+ " Sueldo: " + e.dameSueldo() + 
				" Fecha de Alta: " + e.dameFechaContrato());
	
		}
	
	}
}

class Empleado implements Comparable, Trabajadores{
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
				
	}
	public double establece_bonus(double gratificacion){
		return Trabajadores.bonus_base+gratificacion;
		
	}
	public Empleado(String nom){
		this(nom, 3000, 2000, 01,01);
		
	}
	
	
	public String dameNombre(){//getter
		return nombre + " Id: " + Id;
		
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
	
	public int compareTo(Object miObjeto){
		Empleado otroEmpleado= (Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo){
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo){
			return 1;
		}
		return 0;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int IdSiguiente;
	private int Id;
	}

	class Jefatura extends Empleado implements Jefes{
		
		public Jefatura(String nom, double sue, int agno, int mes, int dia){
			
			super(nom, sue, agno, mes, dia);
		}
		
		public String tomar_decisiones(String decision){
			return "Un miembro ha decidido: " + decision;
			
		}
		public double establece_bonus (double gratificacion){
			double prima=2000;
			return Trabajadores.bonus_base+gratificacion+prima;
		}
		
		public void establece_incentivo(double b){
			incentivo=b;
		}
		public double dameSueldo(){
			double sueldoJefe=super.dameSueldo ();
			return sueldoJefe + incentivo;
			
		}
		
		private double incentivo;
		
	}


