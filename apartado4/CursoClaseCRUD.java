package apartado4;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import apartado1.Alumno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CursoClaseCRUD {

	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Facultad");
	public static void main(String[] args) {
		
		Curso curso = new Curso(2,"Segundo bach",11);
		Clase clase = new Clase(2,"ClaseB5","Lengua");
		//crearCurso(curso);
		//crearClase(clase);
		//agregarClaseACurso(curso.getIdCurso(),clase.getCodigo());
		//eliminarClaseACurso(curso.getIdCurso(),clase.getCodigo());
		
		obtenerCursosDeClase("ClaseA2");
	}
	
	
	public static void crearCurso(Curso curso) {
		EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(curso);
        em.getTransaction().commit();
        System.out.println("Curso creado: " + curso);
    }
	
	 public static void crearClase(Clase clase) {
		 EntityManager em = emf.createEntityManager();
	        em.getTransaction().begin();
	        em.persist(clase);
	        em.getTransaction().commit();
	        System.out.println("Clase creada: " + clase);
	    }
	 
	 public static void agregarClaseACurso(int cursoId, String claseId) {
		 EntityManager em = emf.createEntityManager();
	        em.getTransaction().begin();
	        Curso curso = em.find(Curso.class, cursoId);
	        Clase clase = em.find(Clase.class, claseId);

	        if (curso != null && clase != null) {
	            curso.getClases().add(clase);
	            clase.getCursos().add(curso);
	            em.merge(curso);
	            em.merge(clase);
	            System.out.println("Clase añadida al curso.");
	        } else {
	            System.out.println("Curso o Clase no encontrados.");
	        }
	        em.getTransaction().commit();
	    }
	 
	 public static void eliminarClaseACurso(int cursoId, String claseId) {
		 EntityManager em = emf.createEntityManager();
	        em.getTransaction().begin();
	        Curso curso = em.find(Curso.class, cursoId);
	        Clase clase = em.find(Clase.class, claseId);

	        if (curso != null && clase != null) {
	            curso.getClases().remove(clase);
	            clase.getCursos().remove(curso);
	            em.merge(curso);
	            em.merge(clase);
	            System.out.println("Clase añadida al curso.");
	        } else {
	            System.out.println("Curso o Clase no encontrados.");
	        }
	        em.getTransaction().commit();
	    }
	 
	 public static void obtenerCursosDeClase(String idClase) {
		    EntityManager em = emf.createEntityManager();
		    Clase clase = em.find(Clase.class, idClase);
		    
		    if (clase != null) {
		    	System.out.println("La clase con id "+idClase+" tiene los cursos:");
		        Set<Curso> cursos = clase.getCursos();
		        for (Curso curso : cursos) {
		            System.out.println(curso);
		        }
		    }

		    em.close();
		}

	 
}
