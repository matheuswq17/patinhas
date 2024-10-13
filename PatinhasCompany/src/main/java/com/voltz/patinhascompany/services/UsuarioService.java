package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.models.Usuario;

public class UsuarioService {

    public Usuario criarUsuario(String nome, String email, String senha) {
        return new Usuario(nome, email, senha);
    }
}
