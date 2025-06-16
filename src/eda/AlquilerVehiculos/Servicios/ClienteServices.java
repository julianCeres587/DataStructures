package eda.AlquilerVehiculos.Servicios;

import eda.AlquilerVehiculos.Entities.Clientes;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class ClienteServices {
    //En el tree map la busqueda es como en arboles, pero en el hash map solo entra a la clave y listo
    private final Map<String, Clientes> clientes = new HashMap<>();   //final, osea que no le va a asignar otra estrutura a clientes, osea, clientes = OTRAeSTRUCTURA

    public void agregar(Clientes cliente){

         clientes.put(cliente.getId(),cliente);
    }

     public Clientes consultar(Clientes cliente){

         return clientes.get(cliente.getId());
    }

    public void eliminar(Clientes cliente){

         clientes.remove(cliente.getId());

    }

    public Collection<Clientes> consultar(){
        return clientes.values();
    } 
    
}
