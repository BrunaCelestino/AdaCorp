package br.com.ada.AdaCorp.repository;

import br.com.ada.AdaCorp.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
