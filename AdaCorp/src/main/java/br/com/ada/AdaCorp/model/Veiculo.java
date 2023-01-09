package br.com.ada.AdaCorp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String descricao;
    private String tipo;
    @Column(unique = true)
    private String placa;
    private String marca;
    private String anoFabricacao;
    private String anoModelo;
    private LocalDate dataCompra;
    private Boolean ipvaVencido;

}

