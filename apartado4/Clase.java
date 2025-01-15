package apartado4;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clase")
public class Clase {

	
	@Id
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="planta")
	private int planta;
	
	@Column(name="materia")
	private String materia;
	
	@ManyToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE	
	})
	@JoinTable(name = "Clases_Cursos",
			joinColumns = @JoinColumn(name = "id_clase"),
			inverseJoinColumns = @JoinColumn(name = "id_curso"))
	private Set<Curso> cursos = new HashSet<Curso>();
	
	public Clase() {
		super();
	}

	public Clase(int planta, String codigo, String materia) {
		super();
		this.planta = planta;
		this.codigo = codigo;
		this.materia = materia;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public Set<Curso> getCursos() {
		return cursos;
		}
		public void setModulos(Set<Curso> cursos) {
		this.cursos = cursos;
		}
		
	
	
	
}
