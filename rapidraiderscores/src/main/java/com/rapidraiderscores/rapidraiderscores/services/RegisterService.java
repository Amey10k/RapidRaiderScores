package com.rapidraiderscores.rapidraiderscores.services;


import java.util.List;

import com.rapidraiderscores.rapidraiderscores.entities.TournamentRegisteration;

public interface RegisterService {
	
	public	TournamentRegisteration addRegisterTour(TournamentRegisteration registerTour);
	public List<TournamentRegisteration> getAllRegisterTour();
}
