package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.UsuarioService;
import com.voltz.patinhascompany.models.Usuario;

public class UsuarioController {
    private UsuarioService usuarioService = new UsuarioService();

    public Usuario criarUsuario(String nome, String email, String senha) {
        if (nome == null || email == null || senha == null) {
            throw new IllegalArgumentException("Parâmetros inválidos para criar usuário.");
        }
        return usuarioService.criarUsuario(nome, email, senha);
    }
}
