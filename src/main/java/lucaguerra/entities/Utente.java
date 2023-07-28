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
public class Utente {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String surname;
	private String email;
	@OneToMany(mappedBy = "utente")
	private List<Prenotazione> prenotazione;

	public Utente(String name, String surname, String email) {

		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", prenotazione="
				+ prenotazione + "]";
	}

}
