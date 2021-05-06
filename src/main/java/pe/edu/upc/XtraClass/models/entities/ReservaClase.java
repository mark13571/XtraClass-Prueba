package pe.edu.upc.XtraClass.models.entities;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Reserva_Clase")
public class ReservaClase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservacion_id")
	private Integer id;
	
	@Column(name = "horaInicio", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date horaInicio; 
	
	@Column(name = "horaFin", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date horaFin;
	
	@Column(name = "fecha", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="Alumno_ID", nullable=false)
	private Alumno alumno;
	
	
	@ManyToOne
	@JoinColumn(name = "Calificacion_ID")
	private CalificacionDocente calificacion;
	
	@OneToMany(mappedBy = "reservacion", fetch = FetchType.LAZY)
	private List<Pago> pagos;
	
	@ManyToOne
	@JoinColumn(name= "Docente_ID")
	private Docente docente;
	
	// -- Constructor, Getter, Setter
	
}
