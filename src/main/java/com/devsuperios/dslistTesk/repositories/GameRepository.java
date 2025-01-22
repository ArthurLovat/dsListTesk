package com.devsuperios.dslistTesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperios.dslistTesk.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
