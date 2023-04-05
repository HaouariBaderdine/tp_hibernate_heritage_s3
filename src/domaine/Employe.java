package domaine;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYE")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID")),
		@AttributeOverride(name = "nom", column = @Column(name = "NOM")) })
public class Employe extends Personne {

	@Column(name = "SALAIRE")
	private int salaire;

	public Employe(int id, String nom, int salaire) {
		super(id, nom);
		this.salaire = salaire;
		// TODO Auto-generated constructor stub
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

}
