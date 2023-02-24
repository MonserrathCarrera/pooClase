

package PooClase; 
public class TelefonoMovil extends ProductoElectronico {
   int CapacidadAlmacenamiento;                                                          
   int DuracionBateria;

    public int getCapacidadAlmacenamiento() {
        return CapacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int CapacidadAlmacenamiento) {
        this.CapacidadAlmacenamiento = CapacidadAlmacenamiento;
    }

    public int getDuracionBateria() {
        return DuracionBateria;
    }

    public void setDuracionBateria(int DuracionBateria) {
        this.DuracionBateria = DuracionBateria;
    }

}
