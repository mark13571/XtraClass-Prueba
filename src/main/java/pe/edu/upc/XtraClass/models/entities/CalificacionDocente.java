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
@Table (name = "Calificacion_Docente")
public class CalificacionDocente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Calificacion_ID")
	private Integer id;

	@Column(name = "last_name", length = 10)
	private String nombreCalificacion;
	
	@OneToMany(mappedBy = "calificacion", fetch = FetchType.LAZY)
	private List<ReservaClase> reservacion;
	
	// -- Constructor, Getter, Setter
	public CalificacionDocente() {
		reservacion = new ArrayList<ReservaClase>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCalificacion() {
		return nombreCalificacion;
	}

	public void setNombreCalificacion(String nombreCalificacion) {
		this.nombreCalificacion = nombreCalificacion;
	}

	public List<ReservaClase> getReservacion() {
		return reservacion;
	}

	public void setReservacion(List<ReservaClase> reservacion) {
		this.reservacion = reservacion;
	}
	
	
}
