package com.kluksa.repository;

import com.kluksa.domain.Teams;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Teams entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TeamsRepository extends JpaRepository<Teams, Long> {}
