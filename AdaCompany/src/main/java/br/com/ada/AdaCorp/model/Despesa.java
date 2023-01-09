package br.com.ada.AdaCorp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String fornecedor;
    private String categoria;
    @Column(unique = true)
    private String numeroNF;
    private Double valorNF;
    private LocalDate dataVencimento;
    private Boolean estaPago;
}
