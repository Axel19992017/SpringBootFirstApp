package edu.tecnasa.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="E_USER")

public class User implements Identifiable, Serializable {
	private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private Long id;
	
	@Column(length=255, nullable = false, unique=true)
	private String userName;
	
	
	@Column(length=150, nullable = false)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "E_USER_CLAIM", joinColumns = @JoinColumn(name="ID_USER"), inverseJoinColumns = @JoinColumn(name="CLAIM_TYPE"))
	private Set<ClainType> claim; 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<ClainType> getClaim() {
		return claim;
	}
	public void setClaim(Set<ClainType> claim) {
		this.claim = claim;
	}
	
}
