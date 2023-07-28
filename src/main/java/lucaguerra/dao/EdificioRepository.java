package lucaguerra.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lucaguerra.entities.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer> {

}
