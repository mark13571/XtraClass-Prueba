package pe.edu.upc.XtraClass.models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "personas")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "persona_id")
	private Integer id;
	
	@Column(name = "nombre", length = 20, nullable = false)
	private String nombre;
	
	@Column(name = "apellido", length = 20, nullable = false)
	private String apellido;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "contraseña", length = 12, nullable = false)
	private String contraseña;
	 
	@Column(name = "nacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date nacimiento;
	
	@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Alumno> alumnos;

	@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Docente> docentes;
	
	@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Perfil> perfiles;
	
	// -- Constructor, Getter, Setter
	public Persona() {
		alumnos = new ArrayList<Alumno>();
		docentes = new ArrayList<Docente>();
		perfiles = new ArrayList<Perfil>();
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public List<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}

	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}
	
	
}
