package com.dio.challenge.Iphone.Repositories;

import com.dio.challenge.Iphone.DTO.MusicDTO;

public class MusicRepository implements MusicDTO {
  public void tocar() {
    System.out.println("Tocando música");
  }

  public void pausar() {
    System.out.println("Música pausada");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Música selecionada: " + musica);
  }
}
