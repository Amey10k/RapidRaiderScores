package com.rapidraiderscores.rapidraiderscores.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rapidraiderscores.rapidraiderscores.entities.*;

@Repository
public interface TournamentRepo extends CrudRepository<TournamentRegisteration, Integer>
{
	
}
