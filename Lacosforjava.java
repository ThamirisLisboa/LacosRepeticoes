//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5. (FOR)
package LAÇOSJAVAFOR;

public class Lacosforjava {
	public static void main(String[]args) {
		for(int X=1000; X<=1999; X++) {
			 if (X % 11 == 5) {
				 System.out.println(X);
			 
			 }
		}
    } 
} 		