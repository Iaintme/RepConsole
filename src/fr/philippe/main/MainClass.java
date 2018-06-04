package fr.philippe.main;

import java.util.Scanner;

public class MainClass {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);// scanner lit qqch qui entre

		// ecran accueil
		
		String str = "* --- CONTACTOR --- *";		
		str += "\n\nBienvenue dans l'application.\n";
		str += "\n\t1 - Créer un répertoire";
		str += "\n\t2 - Créer un contact";
		str += "\n\t3 - Afficher les répertoires";
		str += "\n\nVotre choix ? ";
		
		System.out.print(str);
		
		String entree = sc.nextLine(); //récupérer une info du scanner
		
		sc.close();
	}

}
