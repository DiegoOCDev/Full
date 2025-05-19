package com.API.API.controller;

import com.API.API.model.Usuario;
import com.API.API.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuarios")

class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public List<Usuario> listar() {
        return  usuarioService.getUsuarios();
    }
    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable int id) {
        return usuarioService.getUsuario(id);
    }
    @PostMapping
    public Usuario addUsuario(@RequestBody Usuario usuario) {
        return usuarioService.addUsuario(usuario);
    }
    @PutMapping("/{id}")
    public String updateUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(usuario,id);
    }
    @DeleteMapping("/{id]")
    public String deleteUsuario(@PathVariable int id) {
        return usuarioService.deleteUsuario(id);
    }

}
