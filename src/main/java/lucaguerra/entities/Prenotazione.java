package lucaguerra.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	@JoinColumn(name = "postazione_id")
	private Postazione postazione;
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;

	public Prenotazione(LocalDate dataPrenotazione, Postazione postazione, Utente utente) {

		this.dataPrenotazione = dataPrenotazione;
		this.postazione = postazione;
		this.utente = utente;
	}

	@Override
	public String toString() {
		return "Prenotazione [dataPrenotazione=" + dataPrenotazione + ", postazione=" + postazione + ", utente="
				+ utente + "]";
	}

}
