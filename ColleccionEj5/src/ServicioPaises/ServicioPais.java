/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir,***** se mostrará todos los países guardados en el conjunto.

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario */


package ServicioPaises;
import Comparadores.Comparador;
import Entidad.Pais;

import java.util.*;

public class ServicioPais {
    Scanner leer = new Scanner(System.in);

    public void ingresarPais(HashSet<Pais> paises ){
        Pais p = new Pais();
        System.out.println(" Ingresa un Pais ");
        p.setNombrePais(leer.next());

        paises.add(p);
    }
    public void agregarPais (HashSet<Pais> paises){
        boolean aux = false;
        String opcion = "s";

        ingresarPais(paises);
        do {
            System.out.println("Desea agregar otro pais?  marca (s para SI /n para NO) ");
            opcion = leer.next().substring(0);
            if (opcion.equalsIgnoreCase("s")){
                ingresarPais(paises);
            }
            else if (opcion.equalsIgnoreCase("n")){
                aux = true;
                mostrarDatos(paises);
            }
        }while (!aux);
    }
    public void mostrarDatos(HashSet<Pais> paises){
        for (Pais aux: paises ) {
            System.out.println(aux.toString());
        }
    }
   // Después deberemos mostrar el conjunto ordenado alfabéticamente
    public void OrdenarAlfa(HashSet<Pais> paises){
        ArrayList<Pais> listaPaises = new ArrayList<>(paises);
        listaPaises.sort(Comparador.ordenarNombreDescendente);
        System.out.println("<----  Los paises ordenados son  --->\n");
        mostrarDatos2(listaPaises);
    }
    public void mostrarDatos2 (ArrayList<Pais> listaPaises){
        for (Pais aux:listaPaises) {
            System.out.println(aux.toString());
        }
    }
/*al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario */
    public void eliminarPais(HashSet<Pais> paises){
        boolean aux = false;
        System.out.println("Ingrese un pais a eliminar ");
        String eliminarPais = leer.next();
        Iterator <Pais> it = paises.iterator();
      while (it.hasNext()){
        if (it.next().getNombrePais().equalsIgnoreCase(eliminarPais)){
            aux = true;
            it.remove();
        }
      }
      if (aux){
        System.out.println("se elimino el pais "+ eliminarPais);

      }
      else
       System.out.println("El pais ingresado NO se encontro ");
    }
}
