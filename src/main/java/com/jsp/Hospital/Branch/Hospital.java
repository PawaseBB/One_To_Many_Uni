package com.jsp.Hospital.Branch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Hospital {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gst_no;
	@OneToMany
	private java.util.List<Branch> branch;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGst_no() {
		return gst_no;
	}
	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}
	public java.util.List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(java.util.List<Branch> branch) {
		this.branch = branch;
	}
	

}
