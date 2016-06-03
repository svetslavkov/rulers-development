package com.bgrulers.repository;

import com.bgrulers.entity.Ruler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulerRepository extends JpaRepository<Ruler, Long> {
	
}
