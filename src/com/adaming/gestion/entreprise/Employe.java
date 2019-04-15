package com.adaming.gestion.entreprise;

public abstract class Employe {
	private String nom;
    private String prenom;
    private int age;
    private String date;
 
    public Employe(String prenom, String nom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }
 
    public abstract double calculerSalaire();
 

    public String getTitre()
        {
            return "L'employé " ;
        }
 
    public String getNom() {
        return getTitre() + prenom + " " + nom;
    }

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", date=" + date + "]";
	}
    
    
}
