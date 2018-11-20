package com.epsi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "Ville")
@Entity
public class CityModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCity;

	@Column(name = "ville", nullable = false, unique = false)
	private String ville;

	@Column(name = "codePostal", nullable = false, unique = false)
	private int codePostal;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "city")
	private List<UserModel> user;

	@OneToMany
	@JoinColumn(name = "depart")
	private List<TrajetModel> depart;

	@OneToMany
	@JoinColumn(name = "arrive")
	private List<TrajetModel> arrive;

	@ManyToMany(mappedBy = "etapes")
	private List<TrajetModel> etapes;

	@OneToOne
	private TrajetModel etape;

	public List<UserModel> getUser() {
		return user;
	}

	public void setUser(List<UserModel> user) {
		this.user = user;
	}

	public long getIdCity() {
		return idCity;
	}

	public void setIdCity(long idCity) {
		this.idCity = idCity;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public List<TrajetModel> getDepart() {
		return depart;
	}

	public void setDepart(List<TrajetModel> depart) {
		this.depart = depart;
	}

	public List<TrajetModel> getArrive() {
		return arrive;
	}

	public void setArrive(List<TrajetModel> arrive) {
		this.arrive = arrive;
	}

}
