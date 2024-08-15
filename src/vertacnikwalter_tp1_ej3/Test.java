
package vertacnikwalter_tp1_ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        ArrayList<Pelicula> lista = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String titulo,director;
        int horas;
        System.out.println("///// TP 1 - EJ 3 , por Walter Alexander Vertacnik de la Comision 2 /////");
        do {
            System.out.print("\nIngrese el titulo de la pelicula\n > ");
            titulo = leer.nextLine();
            System.out.print("Ingrese el director de la pelicula\n > ");
            director = leer.nextLine();
            System.out.print("Ingrese la duracion en horas de la pelicula\n > ");
            horas = leer.nextInt();
            leer.nextLine();
            lista.add(new Pelicula(titulo,director,horas));
            System.out.print("//// La pelicula se aniadio a la lista, ¿Desea ingresar otra? (S/N) ////\n > ");
            titulo = leer.nextLine();
        } while (titulo.equalsIgnoreCase("S"));
        
        System.out.println("\n/// Lista de peliculas ingresadas ///");
        for (Pelicula p: lista) {
            System.out.println(" - "+p);
        }
        
        System.out.println("\n/// Lista de peliculas con una duracion mayor a una hora ///");
        for (Pelicula p: lista) {
            if (p.getDuracion()>1)
                System.out.println(" - "+p);
        }
        
        Collections.sort(lista, Pelicula.CompareHorasMayorMenor());
        
        System.out.println("\n/// Lista de peliculas de Mayor a Menor ///");
        for (Pelicula p: lista) {
            System.out.println(" - "+p);
        }
        
        Collections.sort(lista, Pelicula.CompareHorasMenorMayor());
        
        System.out.println("\n/// Lista de peliculas de Menor a Mayor ///");
        for (Pelicula p: lista) {
            System.out.println(" - "+p);
        }
        
        Collections.sort(lista, Pelicula.CompareTitulo());
        
        System.out.println("\n/// Lista de peliculas ordenadas alfabeticamente por titulo ///");
        for (Pelicula p: lista) {
            System.out.println(" - "+p);
        }
        
        Collections.sort(lista, Pelicula.CompareDirector());
        
        System.out.println("\n/// Lista de peliculas ordenadas alfabeticamente por director ///");
        for (Pelicula p: lista) {
            System.out.println(" - "+p);
        }
    }
    
}
