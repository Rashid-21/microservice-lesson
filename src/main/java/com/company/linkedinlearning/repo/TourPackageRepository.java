package com.company.linkedinlearning.repo;

import com.company.linkedinlearning.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Tour Package Repository Interface
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    Optional<TourPackage> findByName(String name);
}

