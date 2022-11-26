package Utilidades;

import Entidad.Peliculas;

import java.util.Comparator;

public class Comparador {
    public static Comparator<Peliculas> ordenMayorMenorDuracion = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {

            return p1.getDuracionPeli().compareTo(p2.getDuracionPeli());
        }
    };
    public static Comparator <Peliculas> ordenarMenorMayor = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {

            return p2.getDuracionPeli().compareTo(p1.getDuracionPeli());
        }
    };
    public static Comparator <Peliculas> ordenarXtitulos = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    public static  Comparator <Peliculas> ordenarXdirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}


