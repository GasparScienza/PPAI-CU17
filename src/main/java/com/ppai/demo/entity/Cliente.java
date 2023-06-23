package com.ppai.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    @Id
    private int dni;
    private String  nombreCompleto;
    private int nroCelular;
    @OneToMany(cascade = CascadeType.ALL)
    private List<InformacionCliente> info;

    public boolean esCliente(Cliente cliente) {
        if (cliente.toString() == cliente.nombreCompleto) {
            return true;
        }
        return false;
    }
}
