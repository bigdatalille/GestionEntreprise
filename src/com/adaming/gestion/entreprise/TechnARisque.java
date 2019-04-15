package com.adaming.gestion.entreprise;

class TechnARisque extends Technicien implements ARisque {
	 
    public TechnARisque(String prenom, String nom, int age, String date, int unites) {

        super(prenom, nom, age, date, unites);
    }
 
    public double calculerSalaire() {

        return super.calculerSalaire() + PRIME;
    }


}
