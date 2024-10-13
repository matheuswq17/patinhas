package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.models.Usuario;
import com.voltz.patinhascompany.services.UsuarioService;

public class UsuarioController {
    private UsuarioService usuarioService = new UsuarioService();

    public Usuario criarUsuario(String nome, String email, String senha) {
        return usuarioService.criarUsuario(nome, email, senha);
    }
}
