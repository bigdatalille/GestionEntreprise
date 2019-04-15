package com.adaming.gestion.entreprise;

public class Salaires {
    public static void main(String[] args) {
    	  System.out.println("\nChez moi j'ai les meilleurs avec les meilleurs rémunération : \n ");
    	
        Personnel p = new Personnel();
        System.out.println("\nLe le nombre  "+ p.getNbreEmploye() ) ;
        p.ajouterEmploye(new Vendeur("Tao", "Business", 45, "1995", 30000));
        System.out.println("\nLe le nombre  "+ p.getNbreEmploye()) ;
        p.ajouterEmploye(new Representant("Léonard", "Vendtout", 25, "2001", 20000));
        System.out.println("\nLe le nombre  "+ p.getNbreEmploye() ) ;
        p.ajouterEmploye(new Technicien("Olivier", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Alice", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Alexis", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Moos", "Abordage", 30, "2001", 45));    
        p.afficherSalaires();
        System.out.println("\nLe salaire moyen dans l'entreprise est de " + 
        p.salaireMoyen() + " Euros.");
        
    }
}
