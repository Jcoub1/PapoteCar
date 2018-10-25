package com.epsi.model;

public class VehiculeModel {

	private String immat;
	private String marque;
	private String model;
	private String couleur;
	private String nbrPlace;

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
