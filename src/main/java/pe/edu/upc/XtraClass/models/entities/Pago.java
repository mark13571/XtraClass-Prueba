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
@Table(name = "Pagos")
public class Pago {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "pago_id", columnDefinition = "NUMERIC(6)")
	private Integer id;
	
	@Column(name = "fechaPago", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaPago;
	
	@ManyToOne
	@JoinColumn(name = "reservacion_id")
	private ReservaClase reservacion;
	
	// -- Getter, Setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public ReservaClase getReservacion() {
		return reservacion;
	}

	public void setReservacion(ReservaClase reservacion) {
		this.reservacion = reservacion;
	}

	
	
}
