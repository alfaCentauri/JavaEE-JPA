package com.alfaCentauri.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u ORDER BY u.id"),
        @NamedQuery(name="Usuario.findByIdUsuario", query="SELECT u FROM Usuario u WHERE u.id = id"),
        @NamedQuery(name = "Usuario.findByUsername", query = "SELECT u FROM Usuario u WHERE u.username = :username"),
        @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password")
})
@Table(name="usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Basic(optional = false)
    private int id;

    @Size(max = 100)
    private String usuario;

    @Size(max = 45)
    private String password;

    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(cascade = CascadeType.ALL)
    private Persona persona;

    public Usuario() {
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", persona=" + persona + '\'' +
                '}';
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario1)) return false;
        return id == usuario1.id && usuario.equals(usuario1.usuario) && password.equals(usuario1.password) && Objects.equals(persona, usuario1.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, password, persona);
    }
}
