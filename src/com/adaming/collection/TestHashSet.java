package com.adaming.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	
public static void main(String[] args) {
	Set monHashSet=new HashSet(); // on cr�e notre Set
	monHashSet.add(new String("1")); // on ajoute des string quelconques
	monHashSet.add(new String("2"));
	monHashSet.add(new String("3"));
	monHashSet.add(new String("1")); // oups, je l'ai d�ja ajout�, la fonction g�re l'exception lev�e, et l'objet n'est pas ajout�
	Iterator i=monHashSet.iterator(); // on cr�e un Iterator pour parcourir notre HashSet
	while(i.hasNext()) // tant qu'on a un suivant
	{
		System.out.println(i.next()); // on affiche le suivant
	}

}	
}
