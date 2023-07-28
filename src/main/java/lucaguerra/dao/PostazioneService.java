package lucaguerra.dao;

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

}
