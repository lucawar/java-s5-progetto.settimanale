package lucaguerra.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lucaguerra.entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Integer> {

	List<Postazione> findByEdificioCitta(String citta);

}
