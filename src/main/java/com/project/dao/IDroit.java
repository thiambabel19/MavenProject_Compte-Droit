package com.project.dao;


import java.util.List;

import com.project.dto.Droit;

public interface IDroit {

  public Droit saveDroit(Droit d);
  
  public Droit getDroitById(int id);
  
  public Droit updateDroit(Droit d);
  
  public void removeDroit(int id);
  
  public List<Droit> getAllDroit();
  
}