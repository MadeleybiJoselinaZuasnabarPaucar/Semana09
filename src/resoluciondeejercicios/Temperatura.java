
//Diseña un programa que almacene en una lista de listas de enteros (2 dimensiones) las temperaturas medias de
//un mes que introduzca un usuario. Para hacerlo más sencillo vamos a suponer que el mes 
//tiene 28 días y está formado por 4 semanas de 7 días. Mostrar un menú que nos permita:
//1. Rellenar las temperaturas.
//2. Mostrar las temperaturas.
//3. Visualizar la temperatura media del mes.
//4. Día o días más calurosos del mes.
//Ejemplo: El día o días más calurosos fueron:
//1. El Jueves de la Semana 3 con 40 grados.
//2. El Sábado de la Semana 4 con 40 grados
package resoluciondeejercicios;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @Zuasnabar Paucar Madeley
 */
public class Temperatura {
 Integer numeroDiaMes;
String diaSemana;
Integer temperaturaMedia;

public Temperatura() {

rellenarDia();
rellenarDiaSemana();
rellenarTemperaturaMedia();

}

private void rellenarDia(){

Scanner teclado = new Scanner(System.in);

System.out.println("Dia del mes: ");

numeroDiaMes = teclado.nextInt();
}

public Integer mostrarDia(){

return numeroDiaMes;
}

private void rellenarDiaSemana(){

Scanner teclado = new Scanner(System.in);

System.out.println("Dia de la semana: ");

diaSemana = teclado.nextLine();
}

public String mostrarDiaSemana(){

return diaSemana;
}

private void rellenarTemperaturaMedia(){

Scanner teclado = new Scanner(System.in);

System.out.println("Temperatura Media: ");

temperaturaMedia = teclado.nextInt();
}

public Integer mostrarTemperaturaMedia(){

return temperaturaMedia;
}

public static void mostrarTemperaturas(ArrayList <Temperatura> lista) {

System.out.println("---------------El Mes de Enero Hizo-----------");

for (int i = 0; i < lista.size(); i++) {

System.out.println("Para el " + lista.get(i).mostrarDiaSemana() + " dia " + lista.get(i).mostrarDia() + " Hizo una temperatura de " + lista.get(i).mostrarTemperaturaMedia());

}
}

public static void temperaturaMedia(ArrayList <Temperatura> lista) {

Integer media;
Integer suma = 0;
Integer contador = 0;
for (int i = 0; i < lista.size(); i++) {

suma = suma + lista.get(i).mostrarTemperaturaMedia();
contador++;


}

media = suma / contador;

System.out.println("La Temperatura media es de: " + media);

}

public static void diasMasCaluroso(ArrayList <Temperatura> lista) {

Integer caluroso = 0;

for (int i = 0; i < lista.size(); i++) {

if (lista.get(i).mostrarTemperaturaMedia() > caluroso) {

caluroso = lista.get(i).mostrarTemperaturaMedia();

}

}

System.out.println("---------Los dias mas calurosos son------------");

for (int i = 0; i < lista.size(); i++) {



if (Objects.equals(caluroso, lista.get(i).mostrarTemperaturaMedia())) {

System.out.println("Para el " + lista.get(i).mostrarDiaSemana() + " dia " + lista.get(i).mostrarDia() + " Hizo una temperatura de " + lista.get(i).mostrarTemperaturaMedia());


}

}

}

public static void main(String[] args) {

ArrayList <Temperatura> lista = new ArrayList<>(31);
ArrayList <Temperatura> mostrarCaluroso = new ArrayList<>();


Scanner teclado = new Scanner(System.in);

String respuesta;

do {

System.err.println("Datos del dia: ");
lista.add(new Temperatura());
System.out.println("Desea introducir otro dia [SI / NO]");
respuesta = teclado.nextLine();

} while (respuesta.equalsIgnoreCase("Si"));

mostrarTemperaturas(lista);
temperaturaMedia(lista);
diasMasCaluroso(lista);
}

}
