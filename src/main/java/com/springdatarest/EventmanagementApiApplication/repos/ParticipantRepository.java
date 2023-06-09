package com.springdatarest.EventmanagementApiApplication.repos;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.springdatarest.EventmanagementApiApplication.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

//	Page<Participant> findByEmail(@Param("email")String email, Pageable pageable);
}
