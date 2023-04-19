

package Main;

import Entidad.Persona;
import Servicios.ServicioPersona;

public class Principal {

    public static void main (String[] args) {
        
        // INSTANCIAR UNA CLASE (CREAR UN OBJETO)
        
        // Escritura: NombreClase nombreObjeto = new NombreClase();
      
        Persona p1 = new Persona ("Martina", "Molina", 21, "femenino", 43544013, "Argentina");
        
//        p1.nombre = "Marti";
//        System.out.println(p1.nombre);
          // Esto SOLO se puede realizar cuando el MODIFICADOR del ATRIBUTO es PUBLIC
        
        p1.setNombre("Marti"); // Cambie el atributo nombre "Martina" por "Marti" 
        p1.setEdad(22); // Cambie el atributo edad "21" por "22" 
        
        System.out.println(p1.getNombre() + " " +  p1.getEdad() + " " +  p1.getDni()); 
        // Ahora solo muestra por pantalla el nombre, la edad y el DNI
        
        System.out.println("----------------------------------------");
        
        System.out.println(p1); // Muestra todos los atributos 
        
        /* Tambien puede ser System.out.println(p1.toString()); 
            Esto se puede realizar SOLAMENTE si tenemos creado el metodo toString */ 
        
        System.out.println("----------------------------------------");
        
        // ------------------------------------------------------- //
        
        ServicioPersona pServicio = new ServicioPersona ();
        
        Persona personaCreada = pServicio.crearPersona();
        
        System.out.println(personaCreada);

    }
    
}
