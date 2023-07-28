package lucaguerra.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione {

	@Id
	@GeneratedValue
	private int id;
	private LocalDate dataPrenotazione;
	@OneToOne
	private Postazione postazione;
	@ManyToOne
	private Utente utente;

	public Prenotazione(LocalDate dataPrenotazione, Postazione postazione) {

		this.dataPrenotazione = dataPrenotazione;
		this.postazione = postazione;
	}

	@Override
	public String toString() {
		return "Prenotazione [dataPrenotazione=" + dataPrenotazione + ", postazione=" + postazione + ", utente="
				+ utente + "]";
	}

}
