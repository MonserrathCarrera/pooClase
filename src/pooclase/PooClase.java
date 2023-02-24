package pooclase;

// POO  EJERCICIO 1 CUENTAS BANCARIAS
public class PooClase {                                                 //CLASE PRIVADA

    int marca;                                                                   // ATRIVUTOS 
    int precio = 0;
    int modelo;
    private int doble;

    
    public void ProductoElectronico() {// CLASE PRODUCTO ELECTRONICO
     
      }
    
    private int getPrecioElectronico() {  // MÉTODOS GET
        System.out.println("el precio del dispositivo es:" + precio);
        return precio;
    }

    private int getMarcaElectronico() {  // MÉTODOS GET
        System.out.println("La marca del dispositivo es:" + marca);
        return marca;
    }

    private int getModeloElectronico() {  // MÉTODOS GET
        System.out.println("El modelo del dispositivo es:" + modelo);
        return modelo;

    }

    public void setPrecioElectronico(double PrecioElectronico) {   // MÉTODOS SET
        this.precio = (int) precio;
    }

    public void setMarcaElectronico(String MarcaElectronico) {   // MÉTODOS SET
        this.marca = (int) precio;
    }

    public void setModeloElectronico(String ModeloElectronico) {   // MÉTODOS SET
        this.modelo = (int) precio;
    }

    public class TelefonoMovil {  // CLASE TELEFONO MOVIL 

        int CapacidadAlmacenamiento; // ATRIVUTOS 
        int DuracionBateria;

        private int getCapacidadAlmacenamiento() { // MÉTODOS GET
            System.out.println("Almacenmiento:" + CapacidadAlmacenamiento);
            return CapacidadAlmacenamiento;
        }

        private int getDuracionBateria() { // MÉTODOS GET
            System.out.println("Almacenmiento:" + DuracionBateria);
            return DuracionBateria;
        }

        public void setCapacidadAlmacenamiento(int CapacidadAlmacenamiento) { // MÉTODOS SET
            this.CapacidadAlmacenamiento = (int) CapacidadAlmacenamiento;
        }

        public void setDuracionBateria(int DuracionBateria) { // MÉTODOS SET
            this.DuracionBateria = (int) DuracionBateria;
        }
    }
    
    
  public class Tableta {  // CLASE TABLETA
    
    Double TamanoPantlla;
    String ResolucionPantalla;
    
    
    private Double getTamanoPantlla() { // MÉTODOS GET
            System.out.println("Almacenmiento:" + TamanoPantlla);
            return TamanoPantlla;
        }

        private String getResolucionPantalla() { // MÉTODOS GET
            System.out.println("Almacenmiento:" + ResolucionPantalla);
            return ResolucionPantalla;
        }

        public void setTamanoPantlla(int TamanoPantalla) { // MÉTODOS SET
            this.TamanoPantalla;
        }

        public void setResolucionPantalla(int ResolucionPantalla{ // MÉTODOS SET
            this.ResolucionPantalla;
        }
}
}
