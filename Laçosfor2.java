//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)//
package LA�OSJAVAFOR;

import java.util.Scanner;

public class La�osfor2 {
	
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