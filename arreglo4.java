import java.util.Locale;
import java.util.Scanner;

public class arreglo4 {
    public static void main(String[]args){
        int [] numeros= new int[5];
        leerNumeros(numeros);
        int mayor= buscarMayores(numeros);
        mostrarAlReves(numeros);
        System.out.println(",el mayor es:" +mayor);
    }
    public static void leerNumeros (int[]numeros){
        for(int i=0; i<numeros.length; i++){
            numeros[i]= ingresarEntero ("ingrese numero" +(i+1)+ ": ");
        }
    }
    public static int ingresarEntero (String mensaje){
        Scanner sc= new Scanner (System.in);
        System.out.println(mensaje);
        int valorEntero = sc.nextInt();
        return valorEntero;
    }
    public static int buscarMayores (int [] numeros){
        int mayor= numeros[0];
        for(int i=1;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor= numeros[i];
            }
        }
        return mayor;
    }
    public static void mostrarAlReves (int[]numeros){
        System.out.print("al reves:");
        for(int i= numeros.length-1;i>=0;i--){
            System.out.print(numeros[i]+" ");
        }
    }
}
