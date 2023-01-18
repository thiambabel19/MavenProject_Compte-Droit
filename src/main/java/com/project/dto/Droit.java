package com.project.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="droit")
public class Droit implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  
    @Column(name= "name", length = 30, unique = true)
    private String name;
  
    @ManyToMany(mappedBy = "droits")
    List<Compte> comptes = new ArrayList<Compte>();

    public Droit() {
      super();
    }

    public int getId() {
    	return id;
    }

    public void setId(int id) {
    	this.id = id;
    }

    public String getName() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public List<Compte> getComptes() {
    	return comptes;
    }

    public void setComptes(List<Compte> comptes) {
    	this.comptes = comptes;
    }
  
    public String toString() {
    	return "" + this.id + " " + this.name;
    }
	
}
