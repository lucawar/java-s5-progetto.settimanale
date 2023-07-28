package lucaguerra.dao;

import lucaguerra.entities.Postazione;

public interface IPostazioneDAO {

	public void save(Postazione postazione);

	public void findPostazioneByCitta(String citta);
}
