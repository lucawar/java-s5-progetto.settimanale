package lucaguerra.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import lucaguerra.entities.Utente;

@Service
@Slf4j
public class UtenteService implements IUserDAO {

	@Autowired
	private UtenteRepository utenteRepo;

	@Override
	public void save(Utente utente) {
		utenteRepo.save(utente);
		log.info(utente.getName() + " salvato con successo!");
	}

}
