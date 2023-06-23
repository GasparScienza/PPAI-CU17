package com.ppai.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class InformacionCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String datoAValidar;
    @OneToOne(optional = true)
    private OpcionValidacion opcionCorrecta;
    @OneToOne
    private TipoInformacion tipoInformacion;
    @OneToOne
    private Validacion validacion;
//    @ManyToOne
//    private Cliente cliente;


    public boolean esInformacionCorrecta(String validacion) {
        if (validacion == opcionCorrecta.toString()) {
            return true;
        }
        return false;
    }

    public boolean esValidacion(String validacion) {
        if (validacion == this.datoAValidar) {
            return true;
        }
        return false;
    }
}
