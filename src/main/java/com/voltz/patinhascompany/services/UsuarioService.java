package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.UsuarioDao;
import com.voltz.patinhascompany.models.Usuario;

public class UsuarioService {
    private UsuarioDao usuarioDao = new UsuarioDao();

    public Usuario criarUsuario(String nome, String email, String senha) {
        Usuario usuario = new Usuario(nome, email, senha);
        usuarioDao.inserir(usuario);
        return usuario;
    }
}
