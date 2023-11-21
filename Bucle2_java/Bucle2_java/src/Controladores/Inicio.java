package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int N;
		 int control;
		 
		 System.out.println("1");
		 System.out.println("2");
		 
		 MenuInterfaz alpha = new MenuImplementacion();
		 N = alpha.pedirNumero(sc);
		 
		 for(int i = 3; i<=N; i++) 
		 {
			 control = 0;
			 
			 for(int j = 2; j < i; j++) 
			 { 
				 if (i % j <= 0) {
					 
					 control = 1;
					 break;
				 }
			 }
			 if(control == 0) {
				 
				 System.out.println("Es primo" + i);
			 }
		 }

	}

}
