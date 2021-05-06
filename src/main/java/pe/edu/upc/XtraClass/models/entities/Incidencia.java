package pe.edu.upc.XtraClass.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "incidencias")
public class Incidencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "incidencia_id")
	private Integer id;
	
	@Column(name = "descripcion", length = 120, nullable = false)
	private String descripcion;
	
	@Column(name = "problema", length = 120, nullable = false)
	private String problema;
	
	@Column(name = "fecha", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="Alumno_id")
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn(name="Asunto_id")
	private Asunto asunto;

	
	// -- Getter, Setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asunto getAsunto() {
		return asunto;
	}

	public void setAsunto(Asunto asunto) {
		this.asunto = asunto;
	}
	
}
