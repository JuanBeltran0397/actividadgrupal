import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Collections;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Personas> personas = new ArrayList<>();

            System.out.println("ingresa los datos de las 5 personas");
            for(int i=0;i<5;i++){
                System.out.println("ingresa el nombre de la persona" +" " +(i+1)+ " :");
                String nombre = sc.nextLine();


                System.out.println("Apellido: ");
                String apellido = sc.nextLine();

                System.out.println("Género en ¡Sólo una letra! (Masculino (M)/Femenino (F)): ");
                String genero = sc.nextLine();

                System.out.println("Edad: ");
                int edad = Integer.parseInt(sc.nextLine());

                personas.add(new Personas(nombre,apellido,genero,edad));

             }
            mostrarPersonas(personas);
            System.out.println("Promedio de las edades: "+ calcularPromedioEdad(personas));
            System.out.println("Cantidad de personas con género Masculino= " + contarGenero(personas, "M"));  //Línea para imprimir el número de géneros Masculinos
            System.out.println("Cantidad de personas con género Femenino= " + contarGenero(personas, "F"));

    }

    public static void mostrarPersonas(ArrayList<Personas> personas){
        for (int i=0;i<personas.size();i++){
           System.out.println("Nombre: " + personas.get(i).getNombre());
           //System.out.println("Apellido: " + personas.get(i).getApellido());
           System.out.println("Género: " + personas.get(i).getGenero());
          // System.out.println("Edad: " + personas.get(i).getEdad());
        }
    }
   ////Método para calcular el promedio de todas las edades
    public static double calcularPromedioEdad(ArrayList<Personas> personas){
        int suma = 0;
        for (int i=0;i<personas.size();i++){
            suma += personas.get(i).getEdad();
        }
        return (double) suma / personas.size();
    }


    //Método para calcular el promedio los generos
    public static int contarGenero(ArrayList<Personas> personas, String genero){

        int contador = 0;
        for (int i=0;i<personas.size();i++){
            if (personas.get(i).getGenero().equalsIgnoreCase(genero)){
                contador++;
            }
        }
        return contador;
    }
}

