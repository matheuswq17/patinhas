package com.voltz.patinhascompany;

import com.voltz.patinhascompany.models.Usuario;
import com.voltz.patinhascompany.dao.UsuarioDao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o email do usuário:");
        String email = scanner.nextLine();

        System.out.println("Digite a senha do usuário:");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email, senha);

        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.inserir(usuario);

        System.out.println("Usuário criado e inserido no banco de dados: " + usuario.getNome() + ", Email: " + usuario.getEmail());
    }
}
