package com.dio.challenge.Iphone.Repositories;

import com.dio.challenge.Iphone.DTO.SafariDTO;

public class SafariRepositor implements SafariDTO {
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  public void adicionarNovaAba() {
    System.out.println("Nova aba adicionada");
  }

  public void atualizarPagina() {
    System.out.println("Página atualizada");
  }

}
