package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.Usuario;
import com.API.API.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public Usuario getUsuario(int id) {
        return usuarioRepository.GetUsuario(id);
    }
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepository.AddUsuario(usuario);
    }
    public String updateUsuario(Usuario usuario,int id) {
        return  usuarioRepository.UpdateUsuario(id, usuario);
    }
    public String deleteUsuario(int id) {
        return usuarioRepository.DeleteUsuario(id);
    }
    public List<Usuario> getUsuarios() {
        return usuarioRepository.GetUsuarios();
    }
}
