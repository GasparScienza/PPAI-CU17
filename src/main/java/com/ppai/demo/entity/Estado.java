package com.ppai.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public boolean esFinalizada() {
        if (this.nombre == "Finalizada") {
            return true;
        }
        return false;
    }

    public boolean esIniciada() {
        if (this.nombre == "Iniciada") {
            return true;
        }
        return false;
    }
}
