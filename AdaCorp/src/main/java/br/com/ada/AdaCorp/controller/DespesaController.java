package br.com.ada.AdaCorp.controller;
import br.com.ada.AdaCorp.model.Despesa;
import br.com.ada.AdaCorp.service.DespesaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DespesaController {

    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @PostMapping("/despesas")
    public Despesa salvar(@RequestBody Despesa despesa) {
        return despesaService.salvar(despesa);
    }

    @GetMapping("/despesas")
    public List<Despesa> listar() {
        return despesaService.listar();
    }

    @GetMapping("/despesas/{id}")
    public Despesa buscarPorId(@PathVariable Long id) {
        return despesaService.buscarPorId(id);
    }

    @DeleteMapping("/despesas/deletar/{id}")
    public String deletarVeiculo(@PathVariable Long id) {
        return despesaService.deletar(id);
    }
}
