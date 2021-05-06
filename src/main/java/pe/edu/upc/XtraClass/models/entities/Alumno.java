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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name="Tarjeta_id")
	private Tarjeta tarjeta;
	
	
	@OneToMany(mappedBy="alumno", fetch= FetchType.LAZY)
	private List<Incidencia> incidencias;
	
	@OneToMany(mappedBy="alumno",fetch=FetchType.LAZY)
	private List<Foro> foros;
	
	@OneToMany(mappedBy="alumno", fetch=FetchType.LAZY)
	private List<ReservaClase> reservaClase;
	
	// -- Constructor, Getter, Setter
	public Alumno() {
		incidencias = new ArrayList<Incidencia>();
		foros = new ArrayList<Foro>();
		reservaClase = new ArrayList<ReservaClase>();
	}

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

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Incidencia> getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(List<Incidencia> incidencias) {
		this.incidencias = incidencias;
	}

	public List<Foro> getForos() {
		return foros;
	}

	public void setForos(List<Foro> foros) {
		this.foros = foros;
	}

	public List<ReservaClase> getReservaClase() {
		return reservaClase;
	}

	public void setReservaClase(List<ReservaClase> reservaClase) {
		this.reservaClase = reservaClase;
	}

	
}
