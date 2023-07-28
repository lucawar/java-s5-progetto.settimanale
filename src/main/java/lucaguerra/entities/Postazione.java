package lucaguerra.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucaguerra.Enum.TipoPostazione;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Postazione {

	@Id
	@GeneratedValue
	private int id;
	private String descrizione;
	private int numerMaxOccupanti;
	private boolean disponibilita;
	@ManyToOne
	private Edificio edificio;
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipoPostazione;
	@OneToOne(mappedBy = "postazione")
	private Prenotazione prenotazione;

	public Postazione(String descrizione, int numerMaxOccupanti, boolean disponibilita, Edificio edificio,
			TipoPostazione tipoPostazione) {

		this.descrizione = descrizione;
		this.numerMaxOccupanti = numerMaxOccupanti;
		this.disponibilita = disponibilita;
		this.edificio = edificio;
		this.tipoPostazione = tipoPostazione;
	}

	@Override
	public String toString() {
		return "Postazione [id=" + id + ", descrizione=" + descrizione + ", numerMaxOccupanti=" + numerMaxOccupanti
				+ ", disponibilita=" + disponibilita + ", edificio=" + edificio + ", tipoPostazione=" + tipoPostazione
				+ "]";
	}

}
