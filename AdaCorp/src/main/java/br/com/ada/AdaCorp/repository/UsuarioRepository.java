package br.com.ada.AdaCorp.repository;

import br.com.ada.AdaCorp.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
