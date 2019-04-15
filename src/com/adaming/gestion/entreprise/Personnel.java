package com.adaming.gestion.entreprise;

import java.util.Arrays;

class Personnel {
    private Employe[] staff;

    private int nbreEmploye;
    public int getNbreEmploye() {
		return nbreEmploye;
	}

	public void setNbreEmploye(int nbreEmploye) {
		this.nbreEmploye = nbreEmploye;
	}

	public static int getMaxemploye() {
		return MAXEMPLOYE;
	}

	private final static int MAXEMPLOYE = 200;

 
    public Personnel() {
        staff = new Employe[MAXEMPLOYE];
        nbreEmploye = 0;
    }
 
    public void ajouterEmploye(Employe e) {
        ++nbreEmploye;
        if (nbreEmploye <= MAXEMPLOYE) {
            staff[nbreEmploye - 1] = e;
        } else {
            System.out.println("Pas plus de " + MAXEMPLOYE + " employés");
        }
    }
 
    @Override
	public String toString() {
		return "Personnel [staff=" + Arrays.toString(staff) + ", nbreEmploye=" + nbreEmploye + "]";
	}

	public double salaireMoyen() {

        double somme = 0.0;
        for (int i = 0; i < nbreEmploye; i++) {
            somme += staff[i].calculerSalaire();
        }

        return somme / nbreEmploye;
    }
 
    public void afficherSalaires() {
        for (int i = 0; i < nbreEmploye; i++) {
            System.out.println(staff[i].getNom() + " gagne "
                    + staff[i].calculerSalaire() + " euros.");
        }
    }
}
 