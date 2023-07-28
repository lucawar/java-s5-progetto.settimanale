package lucaguerra.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import lucaguerra.entities.Edificio;

@Service
@Slf4j
public class EdificioService implements IEdificioDAO {

	@Autowired
	private EdificioRepository edificioRepo;

	@Override
	public void save(Edificio edificio) {
		edificioRepo.save(edificio);
		log.info("L'edificio " + edificio.getName() + " salvato con successo!");
	}

}
