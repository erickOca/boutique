package com.indexia.boutique.model.entity;

import com.indexia.boutique.security.entity.Rol;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "USUARIOS")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", nullable = false, unique = true)
    private int idUsuario;

    @Column(name = "nombre", length = 80)
    private String nombre;

    @Column(name = "nombreUsuario" ,unique = true)
    private String nombreUsuario;

    @Column(name = "email", nullable = false, unique = true, length = 80)
    private String email;

    @Column(name = "password", length = 80)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_rol",joinColumns = @JoinColumn(name = "user_idUsuario"),
    inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();


    public Users() {
    }

    public Users(String nombre, String nombreUsuario, String email, String password) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }
}
