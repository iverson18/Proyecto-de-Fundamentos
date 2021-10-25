public class Sensor {
    public static int tamaño = 8;
    public static Sensor[] sensores = new Sensor[tamaño];
    public static int posAnadir = 0;
    public static int sensoresTemp = 0;
    private String tipo;
    private double valor;

    public Sensor() {
        Sensor.posAnadir = Sensor.posAnadir+1;
    }

    public Sensor(String t,double v) {
        this.tipo = t;
        this.valor = v;
        Sensor.posAnadir = Sensor.posAnadir+1;
        if(t.equalsIgnoreCase("temperatura")){
            Sensor.sensoresTemp++;
        }
    }

    public static Sensor[] getSensores() {
        return sensores;
    }

    public static void setSensores(Sensor[] sensores) {
        Sensor.sensores = sensores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        String info = "tipo: "+this.tipo+" valor: "+this.valor;
        return info;
    }

    public static String toStringSensores() {
        String texto ="";
        String informacion ="";
        for(int i =0; i<Sensor.posAnadir; i++) {
            texto ="informacion del sensor:"+(i+1)+" "+Sensor.sensores[i].toString();
            informacion = informacion+"\n" 
                          + texto;
        }
        return informacion;
    }

    public static int cantidadSensores() {
        return Sensor.posAnadir;
    }
    
    public static Sensor[] sensoresTemperatura(Sensor[] sen){
        Sensor[] senTemp = new Sensor[Sensor.sensoresTemp];
        int x = 0;
        for(int i = 0; i<Sensor.posAnadir; i++){
            if(sensores[i].getTipo().equalsIgnoreCase("temperatura")){
                senTemp[x] = Sensor.sensores[i];
                x++;
            }
        }
        for(int j = 0; j < senTemp.length-1; j++){
            int posMenor = j;
            for(int y = j+1; y<senTemp.length;y++){
                if(senTemp[y].getValor() < senTemp[posMenor].getValor()){
                    posMenor = y;
                }
            }
            Sensor temp = senTemp[j];
            senTemp[j] = senTemp[posMenor];
            senTemp[posMenor] = temp;
        }
        return senTemp;
    }
}
