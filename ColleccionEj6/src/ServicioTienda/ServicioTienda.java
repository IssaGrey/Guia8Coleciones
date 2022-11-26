/*en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
package ServicioTienda;

import Entidad.Tienda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ServicioTienda {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Tienda crearProducto (){

        Tienda p = new Tienda();
        System.out.println("Ingrese nombre del producto");
        p.setProducto(leer.next());
        System.out.println("Ingrese precio del producto "+p.getProducto());
        p.setPrecio(leer.nextDouble());

        return p;
    }
    public void agregarProducto (HashMap <String,Double> mapa){

        Tienda p;
       // boolean aux = false;
        String opcion;
        do {
            p = crearProducto();
            mapa.put(p.getProducto(),p.getPrecio());
            System.out.println("Desea agregar otro producto marca (s para SI /n para NO) ");
            opcion = leer.next().substring(0);
           /* if (opcion.equalsIgnoreCase("s")){
                crearProducto();
                mapa.put(p.getProducto(),p.getPrecio());
            } else if (opcion.equalsIgnoreCase("n")) {
                aux = true;
            }

        } while (!aux);*/
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("LOS PRODUCTOS INGRESADOS SON--->");
        mostrarDatos(mapa);

    }
    public void modificarPrecio(HashMap<String, Double> mapa){
    String producto = "";

    boolean existe = false;
        System.out.println("A que producto desea actualizar el precio?");
        producto = leer.next();

        for (Map.Entry<String, Double> aux: mapa.entrySet()) {

          if (aux.getKey().equalsIgnoreCase(producto)){
                existe = true;
                System.out.println("Ingrese nuevo precio");
                aux.setValue(leer.nextDouble());
          }

        }
        if (existe){
            System.out.println("valor modificado ");
        } else
            System.out.println(" el producto" + producto + " No se encuentra en el sistema ");
    }
    public void eliminarProducto (HashMap<String, Double> mapa){

        boolean existe = false;
        String prodEliminar = "";
        System.out.println("INGRESE NOMBRE DEL PRODUCTO A ELIMINAR ?");
        prodEliminar = leer.next();

        for (Iterator<String> iterator = mapa.keySet().iterator(); iterator.hasNext();) {
            String llave = iterator.next();
            if (llave.equalsIgnoreCase(prodEliminar)){
                existe = true;
               iterator.remove();
            }
        }
        if (existe){
            System.out.println("producto = "+ prodEliminar +"---> Eliminado");
        } else
            System.out.println(" el producto " + prodEliminar + " No se encuentra en el sistema ");
    }
    public void mostrarXprecio (HashMap<String, Double> mapa){

    Double precio;
        System.out.println("Indique el precio de referencia para mostrar productos");
        precio = leer.nextDouble();

        for (Map.Entry<String,Double> aux: mapa.entrySet()){
            if (aux.getValue() == precio.doubleValue()){ //por que debo ponerle al precio .doubleValue()
                System.out.println("Producto "+aux.getKey()+ "Precio $ " +aux.getValue());
            }
        }
    }
    public void mostrarDatos (HashMap<String, Double> mapa){
        System.out.println(mapa.toString());
        for (Map.Entry<String,Double> aux: mapa.entrySet()){
            System.out.println("Producto = "+ aux.getKey()+ "Precio $ " +aux.getValue());
        }
    }
    public void menuTienda (HashMap<String, Double> mapa){
        int opcion = 0;

        do {
            System.out.println("<-------------------- MENU --------------------->");
            System.out.println("Indique la opcion con el numero que corresponda");
            System.out.println("1 - Ingresar producto ");
            System.out.println("2 - Modificar precio");
            System.out.println("3 - Eliminar producto");
            System.out.println("4 - Mostrar productos por precio");
            System.out.println("5 - Mostrar todos los productos");
            System.out.println("6 - Salir");
            System.out.println("------------------------------------------------");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    agregarProducto(mapa);
                    break;
                case 2:
                    modificarPrecio(mapa);
                    break;
                case 3:
                    eliminarProducto(mapa);
                    break;
                case 4:
                    mostrarXprecio(mapa);
                    break;
                case 5:
                    mostrarDatos(mapa);
                    break;
                case 6:
                    System.out.println("Hasta la proxima...");
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
        }while(opcion != 6);

    }
}

