package Entidad;

import java.util.ArrayList;

public class Alumno {
    private String nombreAlum;
    private ArrayList <Integer> notas = new ArrayList<>();

    public Alumno(String nombreAlum, ArrayList<Integer> notas) {
        this.nombreAlum = nombreAlum;
        this.notas = notas;
    }

    public Alumno() {
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {

        this.nombreAlum = nombreAlum;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return  "Nombre Alumno='" + nombreAlum + '\'' + ", notas=" + notas ;
    }
}
