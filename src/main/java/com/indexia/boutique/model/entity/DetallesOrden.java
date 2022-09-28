package com.indexia.boutique.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "detalles_orden")
public class DetallesOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetalles_orden", nullable = false, unique = true)
    private int idDetallesOrden;

    @Column(name = "unidades")
    private int unidades;

    @Column(name = "importe")
    private float importe;

    @Column(name = "NDeCarro")
    private int nDeCarro;

    @JoinColumn(name = "id_Producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productos productos;

    @JoinColumn(name = "idOrden")
    @ManyToOne(fetch = FetchType.LAZY)
    private Orden orden;

    public DetallesOrden() {
    }

    public DetallesOrden(int idDetallesOrden, int unidades, float importe, int nDeCarro, Productos productos) {
        this.idDetallesOrden = idDetallesOrden;
        this.unidades = unidades;
        this.importe = importe;
        this.nDeCarro = nDeCarro;
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "DetallesOrden{" +
                "idDetallesOrden=" + idDetallesOrden +
                ", unidades=" + unidades +
                ", importe=" + importe +
                ", nDeCarro=" + nDeCarro +
                ", productos=" + productos +
                ", orden=" + orden +
                '}';
    }
}
