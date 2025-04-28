package com.API.API.repository;
import java.util.List;

import com.API.API.model.Usuario;
import org.springframework.stereotype.Repository;
@Repository

public class UsuarioRepository {
    private List<Usuario> usuarios;
    public UsuarioRepository(){}
    public UsuarioRepository(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public List<Usuario> GetUsuarios() {
        return usuarios;
    }
    public void SetUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public String AddUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        return usuario.toString();
    }
    public String DeleteUsuario(int id) {
        int index = 0;
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                index = usuarios.indexOf(usuario);
                usuarios.remove(index);
                return "Usuario removed";

            }
        }
        return "Usuario not found";
    }
    public String UpdateUsuario(int id,Usuario usuario) {
        int index = 0;
        for (Usuario usuario1 : usuarios) {
            if (usuario1.getId() == id) {
                index = usuarios.indexOf(usuario1);
                usuarios.set(index, usuario);
                return "Usuario updated";
            }
        }
        return "Usuario not found";
    }
    public Usuario GetUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;

            }
        }
        return null;
    }

}
