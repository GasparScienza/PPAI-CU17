
package com.ppai.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@AllArgsConstructor()
public class OpcionLlamada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter()
    private String audioMensajeSubOpciones;
    private String mensajeSubOpciones;
    private String nombre;
    private int nroOrden;
    @OneToMany(cascade = CascadeType.ALL)
    private List<SubOpcionLlamada> subOpcionLlamada;
}