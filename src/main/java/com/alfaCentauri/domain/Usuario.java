package com.alfaCentauri.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u ORDER BY u.id"),
        @NamedQuery(name="Usuario.findByIdUsuario", query="SELECT u FROM Usuario u WHERE u.id = id"),
        @NamedQuery(name = "Usuario.findByUsername", query = "SELECT u FROM Usuario u WHERE u.username = :username"),
        @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password")
})
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String usuario;

    @Size(max = 45)
    private String password;

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
                '}';
    }
}
