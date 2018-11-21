package com.epsi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "Vehicule")
@Entity
public class VehiculeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idVehicule;

	@Column(name = "immat", nullable = false, unique = false)
	private String immat;

	@Column(name = "marque", nullable = false, unique = false)
	private String marque;

	@Column(name = "model", nullable = false, unique = false)
	private String model;

	@Column(name = "couleur", nullable = false, unique = false)
	private String couleur;

	@Column(name = "nbrPlace", nullable = false, unique = false)
	private String nbrPlace;

	@OneToOne(mappedBy = "vehicule")
	private UserModel user;

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public long getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(long idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getImmat() {
		return immat;
	}

	public void setImmat(String immat) {
		this.immat = immat;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getNbrPlace() {
		return nbrPlace;
	}

	public void setNbrPlace(String nbrPlace) {
		this.nbrPlace = nbrPlace;
	}

	public VehiculeModel(String immat, String marque, String model, String couleur, String nbrPlace) {
		super();
		this.setImmat(immat);
		this.setMarque(marque);
		this.setModel(model);
		this.setCouleur(couleur);
		this.setNbrPlace(nbrPlace);
	}

}
