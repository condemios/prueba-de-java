package poo;

public class Empleados {

 public static void main(String[] args) {
  
  Empleados trabajador1=new Empleados("Paco");
  Empleados trabajador2=new Empleados("Ana");
  Empleados trabajador3=new Empleados("Juan");
  Empleados trabajador4=new Empleados("Lucas");
  Empleados trabajador5=new Empleados("Fausto");
  
  trabajador1.cambiaSeccion("Programador");
  
  
  System.out.println(trabajador1.devuelveDatos());
  System.out.println(trabajador2.devuelveDatos()); 
  System.out.println(trabajador3.devuelveDatos());
  System.out.println(trabajador4.devuelveDatos());
  System.out.println(trabajador5.devuelveDatos());
  System.out.println(Empleados.dameIdSiguiente());
 }//main

}//clase

class Empleados{
 public Empleados(String nom){
  
  nombre=nom;
  seccion="Administracion";
  Id=IdSiguiente;
  IdSiguiente++;
 }
 
 public void cambiaSeccion(String seccion){//setter
  
  this.seccion=seccion;
  
 }//fin setter
 
 public String devuelveDatos(){//GETTER
  return "El nombre es " + nombre + " y la sección es "+
 seccion + " y el ID es igual " + Id;
 }//FIN GETTER
 public static String dameIdSiguiente(){//metodo static
  return "el id siguiente es: " + IdSiguiente;
 }//fin estatic
 
 private final String nombre;
 private String seccion;
 private int Id;
 private static int IdSiguiente=1;
 }