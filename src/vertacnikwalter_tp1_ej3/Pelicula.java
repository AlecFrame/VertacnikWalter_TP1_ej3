
package vertacnikwalter_tp1_ej3;

import java.util.Comparator;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator CompareHorasMenorMayor() {
        return new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return Integer.compare(o1.getDuracion(), o2.getDuracion());
            }
        };
    }
    
    public static Comparator CompareHorasMayorMenor() {
        return new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return Integer.compare(o2.getDuracion(), o1.getDuracion());
            }
        };
    }
    
    public static Comparator CompareTitulo() {
        return new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        };
    }
    
    public static Comparator CompareDirector() {
        return new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o1.getDirector().compareTo(o2.getDirector());
            }
        };
    }
    
    @Override
    public String toString() {
        return titulo+" de "+duracion+"h del director "+director;
    }
    
    
}
