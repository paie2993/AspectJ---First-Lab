package org.aop.core.repo;

import org.aop.core.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalRepo extends JpaRepository<Rental, Integer> {
}
