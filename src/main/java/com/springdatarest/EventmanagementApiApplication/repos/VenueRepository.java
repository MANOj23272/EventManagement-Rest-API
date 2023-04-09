package com.springdatarest.EventmanagementApiApplication.repos;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.springdatarest.EventmanagementApiApplication.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

//	Page<Venue> findByPostalCode(@Param(value="postalcode")String postalcode,Pageable pageable);
}
