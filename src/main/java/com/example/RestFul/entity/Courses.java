package com.example.RestFul.entity;

import jakarta.persistence.*;

@Entity
public class Courses {
	@Id
	private int cid;
	private String name;
	private String duration;
	private int fees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getCid() {
		return cid;
	}

	public Courses(int cid, String name, String duration, int fees) {
		super();
		this.cid = cid;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", name=" + name + ", duration=" + duration + ", fees=" + fees + "]";
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

}
