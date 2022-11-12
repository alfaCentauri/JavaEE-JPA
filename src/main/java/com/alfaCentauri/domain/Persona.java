package com.alfaCentauri.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p ORDER BY p.idPersona")
})
@Table(name="persona")
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="id_persona")
    private int idPersona;

    @Size(max = 50)
    private String nombre;

    @Size(max = 50)
    private String apellido;

    @Size(max = 100)
    private String email;

    @Size(max = 50)
    private String telefono;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Usuario> usuarioList;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return idPersona == persona.idPersona && nombre.equals(persona.nombre) && apellido.equals(persona.apellido) && Objects.equals(email, persona.email) && Objects.equals(telefono, persona.telefono) && Objects.equals(usuarioList, persona.usuarioList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nombre, apellido, email, telefono, usuarioList);
    }
}
