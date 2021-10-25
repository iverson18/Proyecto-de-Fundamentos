public class Vehiculo{
    public static int tamaño = 10;
    public static Vehiculo[] vehiculos = new Vehiculo[tamaño];    
    public static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public Vehiculo(){
        Vehiculo.posAnadir = Vehiculo.posAnadir+1;
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        Vehiculo.posAnadir = Vehiculo.posAnadir+1;
    }

    public int getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public String getColor(){
        return this.color;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public void setColor(String co){
        this.color = co;
    }
    
    public String toString(){
        String info = "modelo: " + this.modelo + " marca: " + this.marca + " Valor comercial: " + this.valorComercial + " color: " + this.color;
        return info;
    }

    public static String toStringVehiculos(){
        String texto ="";
        String informacion ="";
        for(int i =0; i<Vehiculo.posAnadir; i++) {
            texto ="informacion del vehiculo:"+(i+1)+" "+Vehiculo.vehiculos[i].toString();
            informacion = informacion+"\n" 
                          + texto;
        }
        return informacion;
    }

    public static int cantidadVehiculos(){
        return Vehiculo.posAnadir;
    }
}
