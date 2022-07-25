package com.erick.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Compra")
    private int idCompra;

    @Column(name = "estatus")
    private String estatus;

    @Column(name = "total")
    private float total;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idProducto",referencedColumnName = "idProducto")
//    private Producto producto;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_Usuario",referencedColumnName = "id_Usuario")
//    private Usuarios usuarios;
}
