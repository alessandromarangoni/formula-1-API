package it.betacom.scuderie;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import it.betacom.piloti.Piloti;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Scuderie {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY
	)
	private long id;
	
	private String nomeScuderia;
	private int vittorieStagionali;
	private String nomeVettura;
	private int punti;

	@OneToMany(mappedBy = "scuderia", fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<Piloti> piloti;
	/**
	 * 
	 */
	public Scuderie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nomeScuderie
	 * @param vittorieStagionali
	 * @param nomeVettura
	 * @param punti
	 */
	public Scuderie(String nomeScuderia, int vittorieStagionali, String nomeVettura, int punti) {
		super();
		this.nomeScuderia = nomeScuderia;
		this.vittorieStagionali = vittorieStagionali;
		this.nomeVettura = nomeVettura;
		this.punti = punti;
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeScuderie() {
		return nomeScuderia;
	}
	public void setNomeScuderie(String nomeScuderie) {
		this.nomeScuderia = nomeScuderie;
	}
	public int getVittorieStagionali() {
		return vittorieStagionali;
	}
	public void setVittorieStagionali(int vittorieStagionali) {
		this.vittorieStagionali = vittorieStagionali;
	}
	public String getNomeVettura() {
		return nomeVettura;
	}
	public void setNomeVettura(String nomeVettura) {
		this.nomeVettura = nomeVettura;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}

	public List<Piloti> getPiloti() {
		return piloti;
	}
	public void setPiloti(List<Piloti> piloti) {
		this.piloti = piloti;
	}

}
