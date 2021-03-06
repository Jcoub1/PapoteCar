package com.epsi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "Trajet")
@Entity
public class TrajetModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idTrajet;

	@ManyToOne(fetch = FetchType.LAZY)
	private CityModel depart;

	@ManyToOne(fetch = FetchType.LAZY)
	private CityModel arrive;

	@ManyToMany
	@JoinTable(name = "CUST_PHONES")
	private List<CityModel> etapes = new ArrayList<>();

	@Column(name = "horaire", nullable = false, unique = false)
	private Date horaire;

	@Column(name = "nbPlace", nullable = false, unique = false)
	private int nbPlace;

	@Column(name = "prix", nullable = false, unique = false)
	private float prix;

	@Column(name = "description", nullable = false, unique = false)
	private String description;

	@OneToMany(mappedBy = "trajet")
	private List<MessageModel> message;

	@OneToMany(mappedBy = "idEvaluation")
	private List<EvaluationModel> eval;

	public long getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(long idTrajet) {
		this.idTrajet = idTrajet;
	}

	public CityModel getDepart() {
		return depart;
	}

	public void setDepart(CityModel depart) {
		this.depart = depart;
	}

	public CityModel getArrive() {
		return arrive;
	}

	public void setArrive(CityModel arrive) {
		this.arrive = arrive;
	}

	public List<CityModel> getEtapes() {
		return etapes;
	}

	public void setEtapes(List<CityModel> etapes) {
		this.etapes = etapes;
	}

	public Date getHoraire() {
		return horaire;
	}

	public void setHoraire(Date horaire) {
		this.horaire = horaire;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
