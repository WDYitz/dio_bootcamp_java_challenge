package com.dio.challenge.Iphone.Repositories;

import com.dio.challenge.Iphone.DTO.SafariDTO;

public class SafariRepository implements SafariDTO {
  public String exibirPagina(String url) {
    return "Exibindo página: " + url;
  }

  public String adicionarNovaAba() {
    return "Nova aba adicionada";
  }

  public String atualizarPagina() {
    return "Página atualizada";
  }

}
