
package resoluciondeejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zuasnabar Paucar Madeley
 */
public class Empleados {

  String nombre;
Integer nHoras;
Integer tarifaUsu;

public Empleados() {
establecerNombre();
establecerNumeroHoras();
establecerTarifaUsuario();
}


private void establecerNombre(){
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce el Nombre del Usuario: ");
nombre = teclado.nextLine();
}
public String devolverNombe() {
return nombre;
}
private void establecerNumeroHoras(){
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce el numero de horas trabajadas por " + nombre + ": ");
nHoras = teclado.nextInt();
}
public int devolverNHoras() {
return nHoras;
}
private void establecerTarifaUsuario(){
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce el precio que cobra la hora " + nombre + ": ");
tarifaUsu = teclado.nextInt();
}
public int devolverTarifaUsu() {
return tarifaUsu;
}

public static void rellenarUsuarios(ArrayList <Empleados> Usuarios) {
Scanner teclado = new Scanner(System.in);

String respuesta;

do {

System.out.println("Datos del Usuario");
Usuarios.add(new Empleados());
System.out.println("Â¿Desea añadir otro USuario? (Si / No)");
respuesta = teclado.nextLine();

} while (respuesta.equalsIgnoreCase("SI"));

//System.out.println(lista);
}
public static void calcularSueldo(ArrayList <Empleados> Usuarios) {
Scanner teclado = new Scanner(System.in);
double sueldo;
int horasExt;
double sueldoExtra;

for (int i = 0; i < Usuarios.size(); i++) {


if (Usuarios.get(i).devolverNHoras() > 40) {

sueldo = Usuarios.get(i).devolverNHoras() * Usuarios.get(i).devolverTarifaUsu();

horasExt = Usuarios.get(i).devolverNHoras() - 40;

sueldoExtra = horasExt * Usuarios.get(i).devolverTarifaUsu() * 0.5;
sueldo = sueldoExtra + sueldo;

}else{

sueldo = Usuarios.get(i).devolverNHoras() * Usuarios.get(i).devolverTarifaUsu();

}

System.out.println(Usuarios.get(i).devolverNombe() + " trabajÃ³ " + Usuarios.get(i).devolverNHoras()+ " horas, cobra " + Usuarios.get(i).devolverTarifaUsu() + " euros la hora por lo que le corresponde un sueldo de " + sueldo + " euros.");

}

}

public static void main(String[] args) {
ArrayList <Empleados> Usuarios = new ArrayList<>();
rellenarUsuarios(Usuarios);
calcularSueldo(Usuarios);
}

}