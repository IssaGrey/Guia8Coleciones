package Servicio;

import Entidad.Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class ServicioAlumno {
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    ArrayList<Alumno> alumnosT = new ArrayList<>();

    public void crearListaAlumnos() {
        String opcion = "s";

        do {
            Alumno x = crearAlumno();
            alumnosT.add(x);
           // alumnosT.add(crearAlumno());
            do {
                System.out.print("Desea ingresar otro alumno? marca s para Si, n para NO  (s/n): ");
                opcion = leer.next();
                System.out.println("");
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
        } while (opcion.equalsIgnoreCase("s"));
       // return alumnosT;
    }

    public Alumno crearAlumno() {

        ArrayList<Integer> notas = new ArrayList<>();

        Alumno newAlumno = new Alumno();

        System.out.println("Ingrese nombre del alumno ");
        String nombreAlum = leer.next();

        newAlumno.setNombreAlum(nombreAlum);
        System.out.println("nombre ingresado " + newAlumno.getNombreAlum()); // no me esta guardando el nombre

        System.out.println("Ingrese las 3 notas del alumno ");

        for (int i = 0; i < 3; i++) { //para ingresar notas
            System.out.print("Ingrese nota " + (i + 1) + "= ");

            notas.add(leer.nextInt());
        }
        newAlumno.setNotas(notas);// como podria ingresar datos sin necesitad de crear un arrayList notas???
        return newAlumno;
    }

    public void MostrarDatos() {
        System.out.println("los datos ingresados son: ");
//MOSTRAR CON FOREACH
        for (Alumno aux : alumnosT) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + alumnosT.size());
//MOSTRAR CON FOR
     /*   for ( int i = 0; i < alumnosT.size() ;i++){

            System.out.println(alumnosT.get(i).toString());
        }
        System.out.println("cantidad = "+alumnosT.size());*/
    }
/*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main*/

    public void notaFinal() {
        Iterator<Alumno> it = alumnosT.iterator();
        Integer notafinal = 0;
        System.out.println("Ingresa el alumno que quiere calcular su nota final");
        String paxCalcuNota = leer.next();

     while (it.hasNext()) {
      if (it.next().getNombreAlum().equalsIgnoreCase(paxCalcuNota)) {
          for (Integer aux : it.next().getNotas()) {
            notafinal = notafinal + aux;
            System.out.println(notafinal);
          }
      } else
         System.out.println("no esta ");
      }
     System.out.println(notafinal);
     System.out.println("El promedio de la nota del alumno es:" + notafinal / 3);

    }
}







