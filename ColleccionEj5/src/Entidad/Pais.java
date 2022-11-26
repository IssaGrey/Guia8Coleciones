

package Entidad;

import java.util.Objects;

public class Pais {

    String nombrePais;

    public Pais() {
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Pais --->  "
                + nombrePais ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais)) return false;
        Pais pais = (Pais) o;
        return getNombrePais().equals(pais.getNombrePais());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombrePais());
    }
}
