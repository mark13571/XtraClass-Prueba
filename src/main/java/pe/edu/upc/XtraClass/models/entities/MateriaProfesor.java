package pe.edu.upc.XtraClass.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Materia_Profesor")
public class MateriaProfesor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Docente_ID",nullable = false)
	private Integer DocenteID;
	
	@Column(name = "materia_ID",nullable = false)
	private Integer materiaID;
	
	@OneToMany(mappedBy = "materiaProfesor", fetch = FetchType.LAZY)
	private List<Perfil> perfil;
	
	@ManyToOne
	@JoinColumn(name = "materia_Id")
	private Materia materia;
	
	@ManyToOne
	@JoinColumn(name = "Docente_ID", insertable = false, updatable = false)
	private Docente docente;
	
	//-- Constructor, Getter, Setter
	public MateriaProfesor() {
		perfil = new ArrayList<Perfil>();
	}

	public Integer getDocenteID() {
		return DocenteID;
	}

	public void setDocenteID(Integer docenteID) {
		DocenteID = docenteID;
	}

	public Integer getMateriaID() {
		return materiaID;
	}

	public void setMateriaID(Integer materiaID) {
		this.materiaID = materiaID;
	}

	public List<Perfil> getPerfil() {
		return perfil;
	}

	public void setPerfil(List<Perfil> perfil) {
		this.perfil = perfil;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
}
