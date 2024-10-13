package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.UsuarioService;
import com.voltz.patinhascompany.models.Usuario;

// Outras dependências necessárias para controlar a lógica de negócios
import java.util.List;
import java.util.Scanner; // Caso use entradas de usuário


public class CriptoAtivoController {
    private CriptoAtivoService criptoAtivoService = new CriptoAtivoService();

    public CriptoAtivo criarCriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        return criptoAtivoService.criarCriptoAtivo(nome, codigo, preco, empresa);
    }
}
