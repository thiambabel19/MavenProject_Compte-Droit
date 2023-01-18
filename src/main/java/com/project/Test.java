package com.project;

/*import java.util.ArrayList;
import java.util.List;

import com.project.dao.CompteImpl;
import com.project.dao.DroitImpl;
import com.project.dao.ICompte;
import com.project.dao.IDroit;
import com.project.dto.Compte;
import com.project.dto.Droit;*/

public class Test {

	public static void main(String[] args) {
		
		/*IDroit droitdao = new DroitImpl();
	    
	    Droit droit = new Droit();
	    droit.setName("ROLE_USER");
	    
	    Droit d = droitdao.saveDroit(droit);
	    System.out.println(d.toString());*/
		
		/*IDroit droitdao = new DroitImpl();
		Compte compte = new Compte();
		compte.setUsername("babel");
		compte.setPassword("Passer@123");
		
		List<Droit> droits = new ArrayList<Droit>();
		droits.add(droitdao.getDroitById(1));
		droits.add(droitdao.getDroitById(2));
		compte.setDroits(droits);
		
		ICompte comptedao = new CompteImpl();
		comptedao.saveComptes(compte);
		System.out.println(compte.toString());*/
		
		/*IDroit droitdao = new DroitImpl();
		List<Droit> droits = droitdao.getAllDroit();
		
		for (Droit droit : droits) {
			System.out.println(droit.toString());
		}*/
		
		
	}

}
