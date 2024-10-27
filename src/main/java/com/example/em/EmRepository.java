package com.example.em;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmRepository extends JpaRepository<EmEntity, Long> {
    
}
