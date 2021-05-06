package pe.edu.upc.XtraClass.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Perfil")
public class Perfil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Perfil_ID")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name= "materia_id")
	private MateriaProfesor materiaProfesor;
	
	@ManyToOne
	@JoinColumn(name= "docente_id")
	private MateriaProfesor docentes;
	
	// -- Getter, Setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public MateriaProfesor getMateriaProfesor() {
		return materiaProfesor;
	}

	public void setMateriaProfesor(MateriaProfesor materiaProfesor) {
		this.materiaProfesor = materiaProfesor;
	}

	public MateriaProfesor getDocentes() {
		return docentes;
	}

	public void setDocentes(MateriaProfesor docentes) {
		this.docentes = docentes;
	}
	
	
}
