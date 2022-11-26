package Comparadores;

import Entidad.Pais;

import java.util.Comparator;

public class Comparador {

        public static Comparator <Pais> ordenarNombreDescendente = new Comparator<Pais>() {
            @Override
            public int compare(Pais pais1, Pais pais2) {
                return pais1.getNombrePais().compareTo(pais2.getNombrePais());
            }
        };

}
