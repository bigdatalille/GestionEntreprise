package com.adaming.collection;

public class Program {

	public static void main(String[] args) {

		Utilisateur toto = new Utilisateur();
		Utilisateur tata = new Utilisateur();
// affiche 1  
		System.out.println("Nombre d�utilisateurs= " + Utilisateur.nbUtilisateurs);
		Utilisateur.incremente();
		toto.incremente();
		System.out.println("Nombre d�utilisateurs= " + Utilisateur.nbUtilisateurs);
		tata.incremente();
		System.out.println("Nombre d�utilisateurs= " + Utilisateur.nbUtilisateurs);
// affiche 2
		System.out.println("Nombre d�utilisateurs= " + Utilisateur.nbUtilisateurs);

	}
}
