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

	@Column(name = "addresse", nullable = false, unique = false)
	private String addresse;

	@Column(name = "rib", nullable = false, unique = false)
	private String rib;

	@Column(name = "mail", nullable = false, unique = false)
	private String mail;

	@Column(name = "mdp", nullable = false, unique = false)
	private String mdp;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idMessage")
	private MessageModel messageId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEvaluation")
	private EvaluationModel evalId;

	public MessageModel getMessageId() {
		return messageId;
	}

	public void setMessageId(MessageModel messageId) {
		this.messageId = messageId;
	}

	public EvaluationModel getEvalId() {
		return evalId;
	}

	public void setEvalId(EvaluationModel evalId) {
		this.evalId = evalId;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
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

	public UserModel(String nom, String prenom, String addresse, String mail, String mdp, String rib) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAddresse(addresse);
		this.setMail(mail);
		this.setMdp(mdp);
		this.setRib(rib);
	}
}
