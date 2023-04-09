package com.springdatarest.EventmanagementApiApplication.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.springdatarest.EventmanagementApiApplication.entities.Event;

//public interface EventRepository extends CrudRepository<Event, Long> {
	
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

	List<Event> findByName(@Param(value = "name") String name);
//	Page<Event> findByNameAndZoneId(@Param(value = "name") String name, @Param(value = "zoneId") String zoneId,Pageable pageable);
	Optional<Event> findById(@Param(value = "name")Long id);

	void save(Event event);

}
