package edu.tecnasa.entities;

import java.io.Serializable;


import javax.persistence.*;


@Entity
@Table(name="E_CLAIM_TYPE")
public class ClainType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CLAIM_TYPE")
	private String clainType;
	
	public String getClainType() {
		return clainType;
	}
	public void setClainType(String clainType) {
		this.clainType = clainType;
	}
	
}
