

package Entidad;

public class Persona {
    
    // ATRIBUTOS (CARACTERISTICAS DEL OBJETO)
    
    // Escritura: Modificador, tipo de dato, nombre 
    
    private String nombre, apellido, sexo, nacionalidad; 
    private int edad, dni;
    
    
    // CONSTRUCTOR (INICIALIZA EL OBJETO)
    
    // Escritura: Modificador (public, para llamarlo desde el main), nombre de la clase (SIEMPRE), parametros (tipo de dato y nombre)

    public Persona() {  // Constructor por defecto
    }
    
    public Persona (String nombre, String apellido, int edad, String sexo, int dni, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
    }

    
    // SETTERS (MODIFICA LOS ATRIBUTOS DE LA CLASE)
    
    // Escritura: Modificador (public), void (no retorna ningun valor), setNombre (tipo de dato y nombre)
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
    
    // Se recomienda utilizar una logica (if) para asegurar una coherencia
        
        if (edad > 0) {           // Si se cumple, se modifica la edad
            this.edad = edad;   
        }
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    // GETTERS (RETORNA EL VALOR DE LAS VARIABLES DE ATRIBUTOS PRIVADOS)
    
    // Escritura: Modificador (public), tipo de dato, getNombre 
    // Luego, dentro se coloca return nombre;

    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDni() {
        return dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    
    // TO STRING
    
    @Override // "Sobreescrito"
    public String toString() {
        return "Persona {" + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", sexo: " + sexo + ", dni: " + dni + ", nacionalidad: " + nacionalidad + '}';
    }

    
    
}
