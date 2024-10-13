package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.UsuarioDao;
import com.voltz.patinhascompany.models.Usuario;

// Outras bibliotecas Java necessárias, como listas ou exceções
import java.util.List;
import java.util.Optional;


public class CriptoAtivoService {

    public CriptoAtivo criarCriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        return new CriptoAtivo(nome, codigo, preco, empresa);
    }
}
