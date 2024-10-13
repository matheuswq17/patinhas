package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.UsuarioService;
import com.voltz.patinhascompany.models.Usuario;

// Outras dependências necessárias para controlar a lógica de negócios
import java.util.List;
import java.util.Scanner; // Caso use entradas de usuário


public class UsuarioController {
    private UsuarioService usuarioService = new UsuarioService();

    public Usuario criarUsuario(String nome, String email, String senha) {
        return usuarioService.criarUsuario(nome, email, senha);
    }
}
