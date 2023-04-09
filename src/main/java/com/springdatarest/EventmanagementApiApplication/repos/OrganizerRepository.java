package com.springdatarest.EventmanagementApiApplication.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springdatarest.EventmanagementApiApplication.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
