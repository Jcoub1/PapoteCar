package com.epsi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "Message")
@Entity
public class MessageModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idMessage;

	@Column(name = "message", nullable = false, unique = false)
	private String message;

	@ManyToOne(cascade = CascadeType.ALL)
	private UserModel userId;

	@ManyToOne(cascade = CascadeType.ALL)
	private TrajetModel trajet;

	public long getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(long idMessage) {
		this.idMessage = idMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserModel getUserId() {
		return userId;
	}

	public void setUserId(UserModel userId) {
		this.userId = userId;
	}

	public TrajetModel getTrajet() {
		return trajet;
	}

	public void setTrajet(TrajetModel trajet) {
		this.trajet = trajet;
	}

	public MessageModel(long idMessage, String message, UserModel userId, TrajetModel trajetId) {
		super();
		this.setMessage(message);

	}
}
