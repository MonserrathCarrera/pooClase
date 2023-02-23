
package pooclase;

// POO  EJERCICIO 1 CUENTAS BANCARIAS
public class PooClase {
int  marca;
  int precio=0;
  int modelo;
    private int doble;

  /*  public PooClase(int saldo) {
        this.saldo = saldo;
    }
    
public void CuentasAbonar (int saldo){
   this.saldo += saldo;
    }
public void CuentasDebito (int saldo){
    this.saldo -= saldo;
    }*/
public void ProductoElectronico (){
    getPrecioElectronico();
    getMarcaElectronico();
    getModeloElectronico();
   setPrecioElectronico(double PrecioElectronico);
    setPrecioElectronico(Srtring  MarcaElectronico);
    setPrecioElectronico(Srtring  ModeloElectronico);
}

    private int getPrecioElectronico (){
        System.out.println("el precio del dispositivo es:"+ precio);
            return precio;
    }
    
    
    private int getMarcaElectronico(){
      System.out.println("La marca del dispositivo es:"+marca);
        return marca;
    }

    
    private int getModeloElectronico(){
      System.out.println("El modelo del dispositivo es:"+modelo);
              return modelo;

    }

    public void setPrecioElectronico(double precio) {
      this.precio=(int) precio;
    }
     public void setMarcaElectronico(double marca) {
      this.precio=(int) precio;
    }
      public void setModeloElectronico(double modelo) {
      this.precio=(int) precio;
    }

    
    }

    
    
    
    
}
