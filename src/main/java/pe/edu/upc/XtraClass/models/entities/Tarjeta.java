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
@Table(name = "tarjetas")
public class Tarjeta { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tarjeta_id")
	private Integer id;
	
	@Column(name = "nro_Tarjeta", length = 16, nullable = false)
	private String nroTarjeta;
	
	@Column(name = "propietario", length = 40, nullable = false)
	private String propietario;
	
	@Column(name = "ccv", columnDefinition = "NUMERIC(3)")
	private Integer ccv;
	
	@OneToMany(mappedBy="tarjeta",fetch= FetchType.LAZY)
	private List<Alumno> alumnos;
	
	// -- Constructor, Getter, Setter
	public Tarjeta() {
		alumnos = new ArrayList<Alumno>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public Integer getCcv() {
		return ccv;
	}

	public void setCcv(Integer ccv) {
		this.ccv = ccv;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
