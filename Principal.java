import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese un valor: ");
            System.out.println("- Ingrese 0 para finalizar la ejecucion del programa.");
            System.out.println("- Ingrese 1 para crear un nuevo vehiculo.");
            System.out.println("- Ingrese 2 para observar la informacion de todos los vehiculos.");
            System.out.println("- Ingrese 3 para observar cuantos vehiculos hay creados.");
            System.out.println("- Ingrese 4 para observar la informacion de los vehiculos de color verde.");
            System.out.println("- Ingrese 5 para observar los vehiculos de modelo entre 2000 y 2021.");
            System.out.println("- Ingrese 6 para crear un nuevo sensor.");
            System.out.println("- Ingrese 7 para observar la informacion de todos los sensores.");
            System.out.println("- Ingrese 8 para observar cuantos sensores hay creados.");
            System.out.println("- Ingrese 9 para observar la informacion de los sensores de tipo temperatura.");
            System.out.println("- Ingrese 666 para ordenar los sensores de tipo temperatura.");
            int num = entrada.nextInt();
            if(num == 0){
                break;
            }
            switch(num){

                case 1:
                    if(Vehiculo.posAnadir == Vehiculo.vehiculos.length){
                        System.out.println("Error base de datos llena");
                    }else{
                        System.out.println("- Ingrese el modelo del vehiculo");
                        int modelo = entrada.nextInt();
                        System.out.println("- Ingrese la marca del vehiculo");
                        String marca = entrada.next();
                        System.out.println("- Ingrese el valor comercial del vehiculo");
                        double valorComercial = entrada.nextDouble();
                        System.out.println("- Ingrese el color del vehiculo");
                        String color = entrada.next();
                        System.out.println("Vehiculo creado con exito");
                        Vehiculo.vehiculos[Vehiculo.posAnadir] = new Vehiculo(modelo,marca,valorComercial,color);
                    }                     
                    break;
                case 2:
                    System.out.println(Vehiculo.toStringVehiculos());
                    break;

                case 3:
                    if(Vehiculo.posAnadir == 0){
                        System.out.println("No se ha creado ningun vehiculo");
                    }else{
                        System.out.println("Hasta el momento se han creado "+Vehiculo.posAnadir+" vehiculos");
                    }
                    break;

                case 4:
                    for(int i = 0; i < Vehiculo.posAnadir; i++){
                        if(Vehiculo.vehiculos[i].getColor().equalsIgnoreCase("verde")){
                            System.out.println(Vehiculo.vehiculos[i].toString());
                        }
                    }
                    break;

                case 5:
                    for(int i = 0; i < Vehiculo.posAnadir; i++){
                        if(Vehiculo.vehiculos[i].getModelo() >= 2000 || Vehiculo.vehiculos[i].getModelo() <= 2021){
                            System.out.println(Vehiculo.vehiculos[i].toString());
                        }
                    }
                    break;

                case 6:
                    if (Sensor.posAnadir == Sensor.sensores.length){
                        System.out.println("Error base de datos llena");
                    }else{
                        System.out.println("- Ingrese el tipo de sensor");
                        String tipo = entrada.next();
                        System.out.println("- Ingrese el valor del sensor");
                        double valor = entrada.nextInt();
                        Sensor.sensores[Sensor.posAnadir] = new Sensor(tipo,valor);
                        System.out.println("Sensor creado con exito");
                    }
                    break;

                case 7:
                    System.out.println(Sensor.toStringSensores());
                    break;

                case 8:
                    if(Sensor.posAnadir == 0){
                        System.out.println("No se ha creado ningun sensor");
                    }else{
                        System.out.println("Hasta el momento se han creado "+Sensor.posAnadir+" sensores");
                    }
                    break;

                case 9:
                    for(int i = 0; i < Sensor.posAnadir; i++){
                        if(Sensor.sensores[i].getTipo().equalsIgnoreCase("temperatura")){
                            System.out.println(Sensor.sensores[i].toString());
                        }
                    }
                    break;

                case 666:
                    Sensor[] nuevoArr = Sensor.sensoresTemperatura(Sensor.sensores); 
                    for(int i = 0;i < nuevoArr.length;i++){
                        System.out.println(nuevoArr[i].toString());
                    }
                    break;

            } 
        }
    }
}
