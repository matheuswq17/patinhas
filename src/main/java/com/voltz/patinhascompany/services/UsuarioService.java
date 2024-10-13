package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.UsuarioDao;
import com.voltz.patinhascompany.models.Usuario;

// Outras bibliotecas Java necessárias, como listas ou exceções
import java.util.List;
import java.util.Optional;


public class UsuarioService {

    public Usuario criarUsuario(String nome, String email, String senha) {
        return new Usuario(nome, email, senha);
    }
}
