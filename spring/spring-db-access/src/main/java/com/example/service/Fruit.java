package com.example.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String opinion;
    private String sexo;
    private String circuns;

    public Fruit() {
    }

    public Fruit(String type) {
        this.name = type;
        this.opinion = "";
        this.sexo = "";
        this.setCircuns("");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getOpinion() {
        return opinion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

	public String getCircuns() {
		return circuns;
	}

	public void setCircuns(String circuns) {
		this.circuns = circuns;
	}
}
