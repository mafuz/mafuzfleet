package com.mandeyya.mafuzfleet.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity

@Table(name = "FLEET_USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    public String getPassword;

	public String getUsername;

	
	

	
	}