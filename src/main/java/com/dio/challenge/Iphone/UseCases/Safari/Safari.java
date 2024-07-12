package com.dio.challenge.Iphone.UseCases.Safari;

import com.dio.challenge.Iphone.Repositories.SafariRepository;

public class Safari {
  private SafariRepository safariRepositor;

  public Safari(SafariRepository safariRepositor) {
  }

  public void openPage(String url) {
    this.safariRepositor.exibirPagina(url);
  }

  public void openNewTab(){
    this.safariRepositor.adicionarNovaAba();
  }

  public void refreshPage() {
    this.safariRepositor.atualizarPagina();
  }
}
