package org.VideoEntronos.VideoEntornos;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner scan=new Scanner (System.in);

	        String decisión = null;
	        String numero1Str;
	        String numero2Str;
	        Integer numero1;
	        Integer numero2;

	            System.out.print("Introduce el primer numero: ");
	            numero1Str=scan.nextLine();
	            numero1=Integer.parseInt(numero1Str);

	            System.out.print("Introduce el segundo numero: ");
	            numero2Str=scan.nextLine();
	            numero2=Integer.parseInt(numero2Str);

	            System.out.println("1. Suma ");
	            System.out.println("2. Resta ");
	            System.out.println("3. Multiplicacion ");
	            System.out.println("4. Division ");
	            System.out.println("Introduce un tipo de operación: ");
	            decisión=scan.nextLine();
	            decisión=decisión.toLowerCase();

	            
	            suma(decisión, numero1, numero2);
	            if (decisión.equals("resta")){
	            	System.out.println("El resultado de la resta es el siguiente: "+(numero1)+" - "+(numero2)+" = "+(numero1-numero2));
		        }
	            if (decisión.equals("multiplicacion")){
	            	System.out.println("El resultado de la multiplición es el siguiente: "+(numero1)+" * "+(numero2)+" = "+(numero1*numero2));
		        }
	            if (decisión.equals("division")){
	            	System.out.println("El resultado de la división es el siguiente: "+(numero1)+" / "+(numero2)+" = "+(numero1/numero2));
		        }
	            	
	        }

		private static void suma(String decisión, Integer numero1, Integer numero2) {
			if (decisión.equals("suma")){
				System.out.println("El resultado de la suma es el siguiente: "+numero1+" + "+numero2+" = "+(numero1+numero2));
			}
		}
	}
