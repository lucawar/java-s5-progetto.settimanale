package lucaguerra.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import lucaguerra.entities.Postazione;

@Service
@Slf4j
public class PostazioneService implements IPostazioneDAO {

	@Autowired
	private PostazioneRepository postazioneRepo;

	@Override
	public void save(Postazione postazione) {
		postazioneRepo.save(postazione);
		log.info("postazione salvata con successo!");

	}

	

	@Override
	public void findPostazioneByCitta(String citta) {
		List<Postazione> postazioneCitta = postazioneRepo.findByEdificioCitta(citta);
		if (!postazioneCitta.isEmpty()) {
			for (Postazione postazione : postazioneCitta) {
				log.info("Postazione tramite citta trovata" + postazione.toString());
			}
		} else {
			log.info("postazione non trovata nella città : " + citta);
		}

	}
}
