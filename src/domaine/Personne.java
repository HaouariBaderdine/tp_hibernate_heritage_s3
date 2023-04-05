package domaine;

import javax.persistence.*;

@Entity
@Table(name = "PERSONNE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "nom")
	private String nom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

}
