package pe.edu.upc.XtraClass.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "Materias")	
public class Materia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "materia_id")
	private Integer id;
	
	@Column(name = "country_name", length = 20)
	private String nombre;

	@OneToMany(mappedBy = "materia", fetch = FetchType.LAZY)
	private List<MateriaProfesor> MateriaProfesores;
	
	// -- Constructor, Getter, Setter
	public Materia() {
		MateriaProfesores = new ArrayList<MateriaProfesor>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<MateriaProfesor> getMateriaProfesores() {
		return MateriaProfesores;
	}

	public void setMateriaProfesores(List<MateriaProfesor> materiaProfesores) {
		MateriaProfesores = materiaProfesores;
	}
	
	
}
