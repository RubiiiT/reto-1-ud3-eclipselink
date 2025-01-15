package apartado4;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @Column(name = "idCurso", nullable = false)
    private int idCurso;

    @Column(name = "nombreDescriptivo", nullable = false, columnDefinition = "TEXT")
    private String nombreDescriptivo;

    @Column(name = "nAsignaturas", nullable = false)
    private int nAsignaturas;
    
    
    @ManyToMany(mappedBy ="cursos")
    private Set<Clase> clases = new HashSet<Clase>();

    // Constructor vacío
    public Curso() {
    }

    // Constructor con parámetros
    public Curso(int idCurso, String nombreDescriptivo, int nAsignaturas) {
        this.idCurso = idCurso;
        this.nombreDescriptivo = nombreDescriptivo;
        this.nAsignaturas = nAsignaturas;
    }

    // Getters y Setters
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreDescriptivo() {
        return nombreDescriptivo;
    }

    public void setNombreDescriptivo(String nombreDescriptivo) {
        this.nombreDescriptivo = nombreDescriptivo;
    }

    public int getNAsignaturas() {
        return nAsignaturas;
    }

    public void setNAsignaturas(int nAsignaturas) {
        this.nAsignaturas = nAsignaturas;
    }
    
    

    public Set<Clase> getClases() {
		return clases;
	}

	public void setClases(Set<Clase> clases) {
		this.clases = clases;
	}

	// Método toString()
    @Override
    public String toString() {
        return "Curso{idCurso=" + idCurso + ", nombreDescriptivo='" + nombreDescriptivo + "', nAsignaturas=" + nAsignaturas + "}";
    }
}
