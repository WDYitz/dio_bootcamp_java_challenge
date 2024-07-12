package com.dio.challenge.Iphone.UseCases.Music;

import com.dio.challenge.Iphone.Repositories.MusicRepository;

public class Music {
  private MusicRepository musicRepository;

  public Music(MusicRepository musicRepository) {
  }

  public void playSong() {
    this.musicRepository.tocar();
  }

  public void pauseSong() {
    this.musicRepository.pausar();
  }

  public void selectSong(String song) {
    this.musicRepository.selecionarMusica(song);
  }
}
