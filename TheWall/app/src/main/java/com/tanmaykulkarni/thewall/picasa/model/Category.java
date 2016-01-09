package com.tanmaykulkarni.thewall.picasa.model;

public class Category {
	public String id, title;

	public Category() {		
	}

	public Category(String id, String title) {		
		this.id = id;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
