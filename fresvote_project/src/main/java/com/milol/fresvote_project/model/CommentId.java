package com.milol.fresvote_project.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CommentId implements Serializable{
	
	private static final long serialVersionUID = 8007437106467210076L;


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
