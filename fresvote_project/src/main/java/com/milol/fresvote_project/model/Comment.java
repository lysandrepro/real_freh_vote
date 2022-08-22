package com.milol.fresvote_project.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {

	@EmbeddedId
	private CommentId pk;
	private String text;
	public CommentId getPk() {
		return pk;
	}
	public void setPk(CommentId pk) {
		this.pk = pk;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
