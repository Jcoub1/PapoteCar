package com.epsi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "User")
@Entity
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idUser;

	@Column(name = "nom", nullable = false, unique = false)
	private String nom;

	@Column(name = "prenom", nullable = false, unique = false)
	private String prenom;

	@Column(name = "adresse", nullable = false, unique = false)
	private String addresse;

	@ManyToOne(cascade = CascadeType.ALL)
	private CityModel city;

	@Column(name = "rib", nullable = false, unique = false)
	private String rib;

	@Column(name = "mail", nullable = false, unique = false)
	private String mail;

	@Column(name = "mdp", nullable = false, unique = false)
	private String mdp;

	@Column(name = "permis", nullable = false, unique = false)
	private String numeroPermis;

	@Column(name = "tel", nullable = false, unique = false)
	private String numeroTel;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idMessage")
	private List<MessageModel> messageId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEvaluation")
	private List<EvaluationModel> evalId;

	@OneToOne
	private VehiculeModel vehicule;

	public List<MessageModel> getMessageId() {
		return messageId;
	}

	public void setMessageId(List<MessageModel> messageId) {
		this.messageId = messageId;
	}

	public List<EvaluationModel> getEvalId() {
		return evalId;
	}

	public void setEvalId(List<EvaluationModel> evalId) {
		this.evalId = evalId;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public CityModel getCity() {
		return city;
	}

	public void setCity(CityModel city) {
		this.city = city;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNumeroPermis() {
		return numeroPermis;
	}

	public void setNumeroPermis(String numeroPermis) {
		this.numeroPermis = numeroPermis;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public VehiculeModel getVehicule() {
		return vehicule;
	}

	public void setVehicule(VehiculeModel vehicule) {
		this.vehicule = vehicule;
	}

	public UserModel(String nom, String prenom, String addresse, String mail, String mdp, String rib) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAddresse(addresse);
		this.setMail(mail);
		this.setMdp(mdp);
		this.setRib(rib);
	}
}
