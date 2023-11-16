package com.devsuperior.dslist1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist1.entity.Game;
import com.devsuperior.dslist1.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll(){
		var result = gameRepository.findAll();
		return result;
	}

}
