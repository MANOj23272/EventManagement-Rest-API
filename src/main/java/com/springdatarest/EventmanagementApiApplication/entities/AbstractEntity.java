package com.springdatarest.EventmanagementApiApplication.entities;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	@Id
	@Column(nullable=false,updatable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long  id;
	
	@CreationTimestamp
	@Column(updatable=false)
	@JsonIgnore
	protected Instant created;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getCreated() {
		return created;
	}
	public void setCreated(Instant created) {
		this.created = created;
	}
}
