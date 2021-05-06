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
@Table (name = "Docente")
public class Docente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NumeroCuenta", length = 20, nullable = false)
    private String numeroCuenta;
    
    @ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
    
    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY)
    private List<ReservaClase> reservaciones;

    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY)
    private List<MateriaProfesor> materiaProfesor;
    
    // -- Constructor, Getter, Setter
    public Docente() {
    	reservaciones = new ArrayList<ReservaClase>();
    	materiaProfesor = new ArrayList<MateriaProfesor>();
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<ReservaClase> getReservaciones() {
		return reservaciones;
	}

	public void setReservaciones(List<ReservaClase> reservaciones) {
		this.reservaciones = reservaciones;
	}

	public List<MateriaProfesor> getMateriaProfesor() {
		return materiaProfesor;
	}

	public void setMateriaProfesor(List<MateriaProfesor> materiaProfesor) {
		this.materiaProfesor = materiaProfesor;
	}

	
}
