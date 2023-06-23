package com.ppai.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor @Getter @Setter
public class Llamada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcionOperador;
    private String detalleAccionRequerida;
    private String duracion;
    private String encuestaEnviada;
    private String observacionAuditor;
    @OneToOne(optional = true)
    private OpcionLlamada opcionSeleccionada;
//    faltan
//  private SubOpcionLlamada subOpcionSeleccionada
//  estado

    public void calcularDuracion() {

    }

    public boolean esDePeriodo() {
        return true;
    }
}
