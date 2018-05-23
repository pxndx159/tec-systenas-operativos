
package main1;

import java.util.Scanner;


public class Main1 {

    
    public static void main(String[] args) {
        
        int n=numero("ingrese numero");
		  Hilo i = new Hilo();
		Hilo y= new Hilo();
		Hilo p= new Hilo();
		Hilo f=new Hilo();
		Hilo fi = new Hilo();
		Hilo.impar impar= new Hilo.impar(n, Hilo.impar.OPERACION_IMPAR);
		Hilo.Suma suma = new Hilo.Suma(n,Hilo.Suma.OPERACION_SUMA);
		Hilo.Primo Primo = new Hilo.Primo(n,Hilo.Primo.OPERACION_PRIMO);
        Hilo.Factorial Factorial = new Hilo.Factorial(n,Hilo.Factorial.OPERACION_FACTORIAL);
        Hilo.Fibonnaci Fibonnaci = new Hilo.Fibonnaci(n,Hilo.Fibonnaci.OPERACION_FIBONNACI);
        
        impar.start();
        suma.start();
        Primo.start();
        Factorial.start();
        Fibonnaci.start();
    }
    
    private static int numero(String mensaje) {
		System.out.println(mensaje);
		Scanner entradaEscanner= new Scanner(System.in);
		String entradaTeclado= entradaEscanner.nextLine();
		entradaEscanner.close();
		return Integer.parseInt(entradaTeclado);
		
	}
}
