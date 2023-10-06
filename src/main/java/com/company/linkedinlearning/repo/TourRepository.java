package com.company.linkedinlearning.repo;

import com.company.linkedinlearning.domain.Tour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * Tour Repository Interface
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {

    List<Tour> findByTourPackageCode(@Param("code") String code);
}
