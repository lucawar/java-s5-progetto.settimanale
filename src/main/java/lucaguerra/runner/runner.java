package lucaguerra.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lucaguerra.Enum.TipoPostazione;
import lucaguerra.dao.IEdificioDAO;
import lucaguerra.dao.IPostazioneDAO;
import lucaguerra.dao.IPrenotazioneDAO;
import lucaguerra.dao.IUserDAO;
import lucaguerra.dao.PostazioneService;
import lucaguerra.entities.Edificio;
import lucaguerra.entities.Postazione;
import lucaguerra.entities.Prenotazione;
import lucaguerra.entities.Utente;

@Component
public class runner implements CommandLineRunner {

	@Autowired
	private IUserDAO uDAO;

	@Autowired
	private IEdificioDAO eDAO;

	@Autowired
	private IPostazioneDAO pDAO;
	@Autowired
	private PostazioneService pService;

	@Autowired
	private IPrenotazioneDAO prDAO;

	@Override
	public void run(String... args) throws Exception {

		Utente utente1 = new Utente("Luca", "Guerra", "luca@gmail.com");
		Utente utente2 = new Utente("Aldo", "Baglio", "aldo@gmail.com");
		Utente utente3 = new Utente("Ajeje", "Brazorf", "ajeje@gmail.com");
		Utente utente4 = new Utente("Ivano", "Magnifico", "ivano@gmail.com");

		Edificio edificio1 = new Edificio("Grand Hotel", "Via del Corso", "Roma");
		Edificio edificio2 = new Edificio("Palazzo Fendi", "Via del Corso", "Roma");
		Edificio edificio3 = new Edificio("Sunset Paradise", "Main Street", "Los Angeles");
		Edificio edificio4 = new Edificio("Ocean Breeze", "Seaside Avenue", "Miami");

		Postazione postazione1 = new Postazione("Postazione Executive", 4, true, edificio1, TipoPostazione.PRIVATO);
		Postazione postazione2 = new Postazione("Postazione Deluxe", 2, true, edificio2, TipoPostazione.PRIVATO);
		Postazione postazione3 = new Postazione("Postazione Standard", 4, true, edificio3, TipoPostazione.OPEN_SPACE);
		Postazione postazione4 = new Postazione("Postazione Premium", 5, true, edificio4, TipoPostazione.SALA_RIUNIONI);

		Prenotazione prenotazione1 = new Prenotazione(LocalDate.of(2022, 10, 5), postazione1, utente1);
		Prenotazione prenotazione2 = new Prenotazione(LocalDate.of(2022, 8, 15), postazione2, utente2);
		Prenotazione prenotazione3 = new Prenotazione(LocalDate.of(2022, 7, 25), postazione3, utente3);
		Prenotazione prenotazione4 = new Prenotazione(LocalDate.of(2022, 5, 19), postazione4, utente4);

//		uDAO.save(utente1);
//		uDAO.save(utente2);
//		uDAO.save(utente3);
//		uDAO.save(utente4);
//
//		eDAO.save(edificio1);
//		eDAO.save(edificio2);
//		eDAO.save(edificio3);
//		eDAO.save(edificio4);
//
//		pDAO.save(postazione1);
//		pDAO.save(postazione2);
//		pDAO.save(postazione3);
//		pDAO.save(postazione4);
//
//		prDAO.save(prenotazione1);
//		prDAO.save(prenotazione2);
//		prDAO.save(prenotazione3);
//		prDAO.save(prenotazione4);

		pDAO.findPostazioneByCitta("Roma");
	}

}
