package com.project.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="compte")
public class Compte implements Serializable{

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	    
	  @Column(name= "username", length = 30, unique = true)
	  private String username;
	   
	  @Column(name = "password", length = 30)
	  private String password;
	    
	  @ManyToMany(fetch = FetchType.EAGER)
	  List<Droit> droits = new ArrayList<Droit>();

	  public Compte() {
	    super();
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }

	  public List<Droit> getDroits() {
	    return droits;
	  }

	  public void setDroits(List<Droit> droits) {
	    this.droits = droits;
	  }
	    
	  public String toString() {
	    return "Compte : " + this.username + " " + this.password + this.getDroits();
	  }
	
}
