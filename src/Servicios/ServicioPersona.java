
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {
    
    public Persona crearPersona () {
    
        Persona personaCreada = new Persona ();
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");  // useDelimiter("\n") se usa para poder agregar espaciados 
                                                                                         // por ej: ingrese nombre y apellido: Martina (espacio) Molina
        
        System.out.println("Bienvenido/a, por favor ingrese su nombre ");
        personaCreada.setNombre(leer.next());
        
        System.out.println("Ahora, ingrese su apellido ");
        personaCreada.setApellido(leer.next());
        
        System.out.println("A continuacion, ingrese su edad ");
        personaCreada.setEdad(leer.nextInt());
        
        System.out.println("Indique su sexo (F para femenino / M para masculino)");
        personaCreada.setSexo(leer.next());
        
        System.out.println("Ingrese su DNI (sin puntos)");
        personaCreada.setDni(leer.nextInt());
        
        System.out.println("Por ultimo, ingrese su nacionalidad");
        personaCreada.setNacionalidad(leer.next());
        
        return personaCreada;
}
}
