package br.com.ada.AdaCorp.controller;

import br.com.ada.AdaCorp.model.Veiculo;
import br.com.ada.AdaCorp.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping("/veiculos")
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    @GetMapping("/veiculos")
    public List<Veiculo> listar() {
        return veiculoService.listar();
    }

    @GetMapping("/veiculos/{id}")
    public Veiculo buscarPorId(@PathVariable Long id) {
        return veiculoService.buscarPorId(id);
    }

    @GetMapping("/veiculo/{ano}")
    public List<Veiculo> buscarPorAno(@PathVariable String ano) {
        return veiculoService.buscarPorAno(ano);
    }

    @DeleteMapping("/veiculos/deletar/{id}")
    public String deletarVeiculo(@PathVariable Long id) {
        return veiculoService.deletar(id);
    }
}
