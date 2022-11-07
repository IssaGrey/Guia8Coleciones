package ServicePerros;

import java.util.*;

public class ServicioPerros {
   private Scanner leer = new Scanner(System.in);
   private ArrayList <String> razaPerros ;
    public ServicioPerros() { //constructor vacio

        this.razaPerros = new ArrayList<>();
   }
    public String crearMascota() {

        String razaPerro = " ";
        System.out.println("**** EN EL MOMENTO QUE DESEE SALIR DEL PROGRAMA OPRIME S **** ");

        while(! razaPerro.equalsIgnoreCase("s")){
            System.out.println("Ingrese raza de la mascota");
            razaPerro = leer.next().toUpperCase();
             if (! razaPerro.equalsIgnoreCase("s")){
              agregarMascota(razaPerro);
            }
        }
        return razaPerro;
    }
    public void agregarMascota (String razaPerro){
        razaPerros.add(razaPerro);
    }
    public void mostrarDatos(){
        System.out.println("Las razas de mascotas ingresadas son: ");
        for (String aux: razaPerros){
            System.out.println(aux);
        }
        System.out.println("cantidad = "+razaPerros.size());
    }
    public void EliminaRaza (){
        boolean bandera = false;
        System.out.println("Ingrese la raza de perro a eliminar ");
        String eliminarRaza = leer.next().toUpperCase();
//ELIMINAR USANDO FOR
      for (int i = 0; i < razaPerros.size(); i++){
            String aux =razaPerros.get(i);
            if (aux.equals(eliminarRaza)) {
                razaPerros.remove(i);
                bandera = true;
                System.out.println("La raza ingresada ha sido eliminada ");
                mostrarOrdenado();
            }
        }
        if (bandera == false) {
            System.out.println(" La raza a eliminar no se encuentra en la lista ");
            mostrarOrdenado();
        }
   // ELIMINAR USANDO ITERATOR
     /*   Iterator it = razaPerros.iterator();
        System.out.println("Ingrese la raza de perro a eliminar ");
        String eliminar = leer.next().toUpperCase();
        while (it.hasNext()){
            if (it.next().equals(eliminar)) {
                it.remove();
                bandera = true;
                mostrarOrdenado();
            }
        }
        if (bandera == false){
            System.out.println(" La raza a eliminar no se encuentra en la lista ");
            mostrarOrdenado();
        }*/
    }
    public void mostrarOrdenado (){
        Collections.sort(razaPerros);
        System.out.println(razaPerros);
    }

}


