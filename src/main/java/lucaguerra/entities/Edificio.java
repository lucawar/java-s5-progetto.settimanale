package lucaguerra.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Edificio {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String indizizzo;
	private String citta;
	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postazione;

	public Edificio(String name, String indizizzo, String citta) {

		this.name = name;
		this.indizizzo = indizizzo;
		this.citta = citta;
	}

	@Override
	public String toString() {
		return "Edificio [id=" + id + ", name=" + name + ", indizizzo=" + indizizzo + ", citta=" + citta
				+ ", postazione=" + postazione + "]";
	}

}
