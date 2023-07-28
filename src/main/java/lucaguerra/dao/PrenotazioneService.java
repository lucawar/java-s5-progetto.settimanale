package lucaguerra.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import lucaguerra.entities.Prenotazione;

@Service
@Slf4j
public class PrenotazioneService implements IPrenotazioneDAO {

	@Autowired
	private PrenotazioneRepository prenotazioneRepo;

	@Override
	public void save(Prenotazione prenotazione) {
		prenotazioneRepo.save(prenotazione);
		log.info("La prenotazione di " + prenotazione.getUtente() + "è stata salvata con successo!");
	}

}
