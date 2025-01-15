package apartado4;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="Alumno")
public class Alumno {

    @Id
    @Column(name="idAlumno")
    private String idAlumno;

    @Column(name="NIF")
    private String nif;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido1")
    private String apellido1;

    @Column(name="apellido2")
    private String apellido2;

    @Column(name="email")
    private String email;

    @Column(name="direccion")
    private String direccion;

    @Column(name="codigoPostal")
    private int codigoPostal;

    @Column(name="municipio")
    private String municipio;

    @Column(name="provincia")
    private String provincia;

    @Column(name="beca")
    private String beca;

    // Constructores
    public Alumno() {
    }

    public Alumno(String idAlumno, String nif, String nombre, String apellido1, String apellido2,
                  String email, String direccion, int codigoPostal, String municipio,
                  String provincia, String beca) {
        this.idAlumno = idAlumno;
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.provincia = provincia;
        this.beca = beca;
    }

    // Getters y Setters
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }
    
    public String toString() {
        return "Alumno{idAlumno='" + idAlumno + "', nif='" + nif + "', nombre='" + nombre + "', apellido1='" + apellido1 + "', apellido2='" + apellido2 + "', email='" + email + "', direccion='" + direccion + "', codigoPostal=" + codigoPostal + ", municipio='" + municipio + "', provincia='" + provincia + "', beca='" + beca + "'}";
    }
}
