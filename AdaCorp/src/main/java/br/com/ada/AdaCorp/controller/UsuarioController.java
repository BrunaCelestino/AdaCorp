package br.com.ada.AdaCorp.controller;

import br.com.ada.AdaCorp.model.Usuario;
import br.com.ada.AdaCorp.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuarios")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        if(usuarioService.buscarPorId(id) == null) {
            return new ResponseEntity<>("Usuário não encontrado!", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(usuarioService.buscarPorId(id), HttpStatus.OK);
        }
    }

    @DeleteMapping("/usuarios/deletar/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        return usuarioService.deletar(id);
    }

    @PutMapping("/usuarios/update/{id}")
    public Usuario atualizarUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {
        return usuarioService.update(usuario, id);
    }
}
