package fr.philippe.main;

import java.util.Scanner;

public class MainClass {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);// scanner lit qqch qui entre

		// ecran accueil
		
		String str = "* --- CONTACTOR --- *";		
		str += "\n\nBienvenue dans l'application.\n";
		str += "\n\t1 - Cr�er un r�pertoire";
		str += "\n\t2 - Cr�er un contact";
		str += "\n\t3 - Afficher les r�pertoires";
		str += "\n\nVotre choix ? ";
		
		System.out.print(str);
		
		String entree = sc.nextLine(); //r�cup�rer une info du scanner
		
		sc.close();
	}

}
