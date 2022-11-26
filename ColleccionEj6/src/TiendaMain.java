import ServicioTienda.ServicioTienda;

import java.util.HashMap;

public class TiendaMain {
    public static void main(String[] args) {

        HashMap <String, Double>  mapa = new HashMap<>();
        ServicioTienda map = new ServicioTienda ();
        map.menuTienda(mapa);

    }
}