package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{
	
	public int pedirNumero (Scanner sc){
		
		int N;
		
		 System.out.println("Dame un numero:");
		 N = sc.nextInt();
		 
		 return N;

	}
}
