package br.com.ada.AdaCorp.service;

import br.com.ada.AdaCorp.model.Funcionario;
import br.com.ada.AdaCorp.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listar() {
        return (List<Funcionario>) funcionarioRepository.findAll();
    }

    public Funcionario buscarPorId(Long id) {
        return funcionarioRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public String deletar(Long id) {
        Funcionario funcionario = funcionarioRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        if(funcionario != null) {
            funcionarioRepository.delete(funcionario);
        }

        return "Usuário: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf() + ", deletado com sucesso!";
    }


}
