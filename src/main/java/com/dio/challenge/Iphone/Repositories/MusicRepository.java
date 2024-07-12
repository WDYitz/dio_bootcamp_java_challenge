package com.dio.challenge.Iphone.Repositories;

import com.dio.challenge.Iphone.DTO.MusicDTO;

public class MusicRepository implements MusicDTO {
  public String tocar() {
    return "Tocando música";
  }

  public String pausar() {
    return "Música pausada";
  }

  public String selecionarMusica(String musica) {
    return "Música selecionada: " + musica;
  }
}
