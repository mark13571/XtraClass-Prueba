package pe.edu.upc.XtraClass.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "foros")
public class Foro { 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Foro_ID", columnDefinition="NUMERIC(6)")
	 private Integer id;

	 @Column(name="Asunto", length = 25)
	 private String asunto;
		 
	 @Column(name="Comentario", length = 255)
	 private String comentario;
	 
	 @ManyToOne
	 @JoinColumn(name = "Alumno_ID", nullable = false)
	 private Alumno alumno;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	 
	 // -- Constructor, Getter, Setter
	 
}
