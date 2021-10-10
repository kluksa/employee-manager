package com.kluksa.repository;

import com.kluksa.domain.Projects;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Projects entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProjectsRepository extends JpaRepository<Projects, Long> {}