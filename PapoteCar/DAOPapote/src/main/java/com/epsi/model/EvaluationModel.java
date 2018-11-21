package com.epsi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "Evaluation")
@Entity
public class EvaluationModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEvaluation;

	@Column(name = "note", nullable = false, unique = false)
	private String note;

	@Column(name = "commentaire", nullable = false, unique = false)
	private String commentaire;

	@ManyToOne(cascade = CascadeType.ALL)
	private TrajetModel trajetId;

	@ManyToOne(cascade = CascadeType.ALL)
	private UserModel userId;

	public long getIdEvaluation() {
		return idEvaluation;
	}

	public void setIdEvaluation(long idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public TrajetModel getTrajetId() {
		return trajetId;
	}

	public void setTrajetId(TrajetModel trajetId) {
		this.trajetId = trajetId;
	}

	public UserModel getUserId() {
		return userId;
	}

	public void setUserId(UserModel userId) {
		this.userId = userId;
	}

	public EvaluationModel(String note, String commentaire) {
		super();
		this.setNote(note);
		this.setCommentaire(commentaire);
	}
}
