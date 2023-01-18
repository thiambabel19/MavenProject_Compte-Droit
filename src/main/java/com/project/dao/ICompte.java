package com.project.dao;
import java.util.List;

import com.project.dto.Compte;


public interface ICompte {

  public Compte saveComptes(Compte c);
  
  public Compte getCompteById(int id);
  
  public Compte login(String username, String password) throws Exception;
  
  public Compte updateComptes(Compte compte);
  
  public void removeCompte(int id);
  
  public List<Compte> getAllComptes();
  
}
