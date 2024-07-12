package com.dio.challenge.Iphone.UseCases.Safari;

import com.dio.challenge.Iphone.Repositories.SafariRepository;

public class Safari {
  private SafariRepository safariRepository;

  public Safari(SafariRepository safariRepository) {
    this.safariRepository = safariRepository;
  }

  public String openPage(String url) {
    return this.safariRepository.exibirPagina(url);
  }

  public String openNewTab(){
    return this.safariRepository.adicionarNovaAba();
  }

  public String refreshPage() {
    return this.safariRepository.atualizarPagina();
  }
}
