package com.dio.challenge.Iphone.UseCases.Safari;

import com.dio.challenge.Iphone.Repositories.SafariRepositor;

public class Safari {
  private SafariRepositor safariRepositor;

  public Safari(SafariRepositor safariRepositor) {
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
