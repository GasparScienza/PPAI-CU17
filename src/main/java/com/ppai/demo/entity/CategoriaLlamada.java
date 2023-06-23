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
import lombok.Setter;

@Entity
@AllArgsConstructor() @Getter @Setter
public class CategoriaLlamada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String audioMensajeOpciones;
    private String mensajeOpciones;
    private String nombre;
    private int nroOrden;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OpcionLlamada> opcion;
}
