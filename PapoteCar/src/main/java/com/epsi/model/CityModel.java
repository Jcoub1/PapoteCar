package com.epsi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	private UserModel user;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "depart")
	private TrajetModel depart;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "arrive")
	private TrajetModel arrive;

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

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public TrajetModel getDepart() {
		return depart;
	}

	public void setDepart(TrajetModel depart) {
		this.depart = depart;
	}

	public TrajetModel getArrive() {
		return arrive;
	}

	public void setArrive(TrajetModel arrive) {
		this.arrive = arrive;
	}

}
