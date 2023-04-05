package domaine;

import javax.persistence.*;

@Entity
@Table(name = "ETUDIANT")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
		@AttributeOverride(name = "nom", column = @Column(name = "nom")) })
public class Etudiant extends Personne {

	@Column(name = "filiere")
	private String filiere;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String filiere) {
		super();
		this.filiere = filiere;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

}
