package io.github.joaomgsa.cadastro.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/* Classe de Modelo */

public class User {
	
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;
	
	private String nickname;
	private String password;
	private boolean according;
	
	public User() {
		}
	
	public User (String name, Date birthDate, String nickname, String password, boolean according) {
		this.name = name;
		this.birthDate = birthDate;
		this.nickname = nickname;
		this.password = password;
		this.according = according;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAccording() {
		return according;
	}

	public void setAccording(boolean according) {
		this.according = according;
	}
	
	
}
