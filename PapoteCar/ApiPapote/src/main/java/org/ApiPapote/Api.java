package org.ApiPapote;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.epsi.model.TrajetModel;
import com.epsi.repository.TrajetRepository;
import com.epsi.repository.UserRepository;

public class Api {

	@Autowired
	private TrajetRepository trajetRepo;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private ModelMapper modelMapper;

	/* Methode de conversion d'un DTO en Entity */
	/*
	 * private UserModel convertToEntity(UserDTO user) { return
	 * modelMapper.map(user, UserModel.class); }
	 */

	/**
	 * Service renvoyant la liste des trajets disponible
	 * 
	 * @return
	 */
	public List<TrajetModel> getListTrajet() {
		Date date = new Date();
		return trajetRepo.findAvailableJourney(date);
	};

	/*
	 * public void saveNewUser(UserDTO user) { userRepo.save(user);
	 * 
	 * }
	 */

}
