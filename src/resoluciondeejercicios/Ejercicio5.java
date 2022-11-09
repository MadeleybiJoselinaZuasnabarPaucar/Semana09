
package resoluciondeejercicios;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Zuasnabar Paucar Madeley
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
   String nombreMes;
Integer numeroVentas;

public Ejercicio5() {
establecerNombreMes();
establecerNumVentas();
}

private void establecerNombreMes() {

Scanner teclado = new Scanner(System.in);

System.out.println("Nombre del Mes: ");
nombreMes = teclado.nextLine();

}

public String devolverNombreMes(){

return nombreMes;
}
public Integer devolverNumVentas(){

return numeroVentas;
}
private void establecerNumVentas() {

Scanner teclado = new Scanner(System.in);

System.out.println("Numero de ventas producidas en " + nombreMes + ": ");
numeroVentas = teclado.nextInt();

}

public static void mostrarMenu(ArrayList <Ejercicio5> lista) {

Integer opcion;
Scanner teclado = new Scanner(System.in);

System.out.println("-----------Ventas De Coches--------");

do {
System.out.println(" 1.- Introducir las ventas de coches de cada uno de los meses del aÃ±o .");
System.out.println(" 2.- Mostrar las ventas introducidas en el punto anterior.");
System.out.println(" 3.- Que muestre la suma total de ventas de coches del aÃ±o.");
System.out.println(" 4.- Que muestre las ventas totales de los meses que empiezan por la letra A. (Utiliza el mÃ©todo correspondiente de la clase String)");
System.out.println(" 5.- Que muestre el nombre del mes con mÃ¡s ventas.");
System.out.println(" 6.- Salir del programa.");

opcion = teclado.nextInt();

switch(opcion){

case 1 ->  {

rellenarVentas(lista);

}
case 2 ->  {

mostrarVentas(lista);
}
case 3 ->  {

mostrarSumaVentas(lista);
}
case 4 ->  {
mostrarSumaMesesStartA(lista);
}
case 5 ->  {
mesMaVentas(lista);
}
case 6 ->  {
System.out.println("Gracias!!!!! por usar este programa");
}

default -> {

System.out.println("Introduce un valor entre 1 y 6");

}
}

} while (opcion != 6);

}

public static void rellenarVentas(ArrayList <Ejercicio5> lista) {
Scanner teclado = new Scanner(System.in);

String respuesta;

do {

System.out.println("Datos del Mes");
lista.add(new Ejercicio5());
System.out.println("Â¿Desea aÃ±adir otro mes? (Si / No)");
respuesta = teclado.nextLine();

} while (respuesta.equalsIgnoreCase("SI"));

//System.out.println(lista);
}

public static void mostrarVentas(ArrayList <Ejercicio5> lista) {

for (int i = 0; i < lista.size(); i++) {

System.out.println("Para el mes de " + lista.get(i).devolverNombreMes() + " se vendieron: " + lista.get(i).devolverNumVentas());

}

}

public static void mostrarSumaVentas(ArrayList <Ejercicio5> lista) {

Integer suma=0;

for (int i = 0; i < lista.size(); i++) {

suma = suma + lista.get(i).devolverNumVentas();


}
System.out.println("-----------------------------");
System.out.println("Para el aÃ±o se vendieron un total de: " + suma + " coches");
System.out.println("-----------------------------");

}

public static void mostrarSumaMesesStartA(ArrayList <Ejercicio5> lista) {

Integer suma=0;


for (int i = 0; i < lista.size(); i++) {

if (lista.get(i).devolverNombreMes().charAt(0)== 'A' ) {

suma = suma + lista.get(i).devolverNumVentas();

}

}
System.out.println("-----------------------------");
System.out.println("Para los meses que empiezan por A vendieron un total de: " + suma + " coches");
System.out.println("-----------------------------");

}

public static void mesMaVentas(ArrayList <Ejercicio5> lista) {

Integer ventas = lista.get(0).numeroVentas;

for (int i = 0; i < lista.size(); i++) {

if (ventas < lista.get(i).devolverNumVentas()) {

ventas = lista.get(i).devolverNumVentas();

}

}

System.out.println("-----------------------------");
System.out.println("Mes o Meses con mas ventas de coches");
System.out.println("-----------------------------");

for (int i = 0; i < lista.size(); i++) {

if (Objects.equals(ventas, lista.get(i).devolverNumVentas())) {
System.out.println("El mes de " + lista.get(i).devolverNombreMes() + " Se vendieron un total de " + lista.get(i).devolverNumVentas() + " Coches");
}

}


}

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
ArrayList <Ejercicio5> lista = new ArrayList<>();
mostrarMenu(lista);



}

}
