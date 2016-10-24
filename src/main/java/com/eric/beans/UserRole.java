package com.eric.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_ROLES")
public class UserRole {
	
	@Id
	@Column(name="ROLE_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="roleId")
	@SequenceGenerator(name="roleId", sequenceName="ROLE_ID_SEQUENCE", initialValue=1, allocationSize=1)
	private long id;
	
	@Column(name="ROLE_TYPE")
	private String roleType;
	
	
}
