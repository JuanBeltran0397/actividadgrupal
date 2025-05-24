import java.security.PublicKey;

public class Personas {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;


// constructor
    public Personas (String nombre,String apellido, String genero, int edad){
       // Asignamos los valores a los atributos
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }



//Getters
public String getNombre(){

        return nombre;
}
public String getApellido(){

        return apellido;
}

public String getGenero(){

        return genero;
}

public int getEdad(){

        return edad;
}

}





