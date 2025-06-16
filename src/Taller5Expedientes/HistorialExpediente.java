package Taller5Expedientes;

import java.util.Hashtable;

public class HistorialExpediente {

   private Hashtable<String, ExpedienteMedico> expedientes;

    public HistorialExpediente(Hashtable<String, ExpedienteMedico> expedientes) {
    this.expedientes = expedientes;
}
    public HistorialExpediente() {
    }

    

    public Hashtable<String, ExpedienteMedico> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(Hashtable<String, ExpedienteMedico> expedientes) {
        this.expedientes = expedientes;
    }

    public void agregarExpediente(ExpedienteMedico expediente) {
           
          expedientes.put(expediente.getId(), expediente);
          


    }

    public ExpedienteMedico buscarExpediente(ExpedienteMedico expediente) {
        if(expedientes.containsKey(expediente.getId())){
            return expedientes.get(expediente.getId());
        }
        return null;
       
    }

    public void eliminarExpediente(ExpedienteMedico expediente) {
         expedientes.remove(expediente.getId());
    }

    public void actualizarExpediente(ExpedienteMedico expediente, ExpedienteMedico expedienteNuevo){
        if(expedientes.containsKey(expediente.getId())){
            expedientes.replace(expediente.getId(), expedienteNuevo);
        }
       

    }    

}
