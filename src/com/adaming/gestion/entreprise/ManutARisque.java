package com.adaming.gestion.entreprise;

class ManutARisque extends Manutentionnaire implements ARisque {

	 
    public ManutARisque(String prenom, String nom, int age, String date, int heures) {

        super(prenom, nom, age, date, heures);
    }
 
    public double calculerSalaire() {
    	
        return super.calculerSalaire() + ARisque.PRIME ;
        
    }

	



}