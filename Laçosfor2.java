//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)//
package LAÇOSJAVAFOR;

import java.util.Scanner;

public class Laçosfor2 {
	
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in); 
		int W =0,Z=0; 
		for(int X=1,Y; X<=10; X++) {
			System.out.println(" Digite um numero :");
			Y= ler.nextInt();
			if(Y %2 == 0) {
				W = W+1;
							
			}
			else {
			 Z = Z+1;	
			}
		 }
		System.out.println("Quantidade de numeros pares : " + W);
		System.out.println("Quanidade de impares: " + Z);
		ler.close();
		
    }
}