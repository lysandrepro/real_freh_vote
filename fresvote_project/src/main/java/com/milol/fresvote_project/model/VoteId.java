package com.milol.fresvote_project.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable{

	
	private static final long serialVersionUID = -3911374891743750063L;

	@ManyToOne
	private User user;
	
	@ManyToOne
	private Feature feature;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}
	
	
}
