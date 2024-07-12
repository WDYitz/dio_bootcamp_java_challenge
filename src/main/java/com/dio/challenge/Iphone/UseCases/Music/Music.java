package com.dio.challenge.Iphone.UseCases.Music;

import com.dio.challenge.Iphone.Repositories.MusicRepository;

public class Music {
  private MusicRepository musicRepository;

  public Music(MusicRepository musicRepository) {
    this.musicRepository = musicRepository;
  }

  public String playSong() {
     return this.musicRepository.tocar();
  }

  public String pauseSong() {
    return this.musicRepository.pausar();
  }

  public String selectSong(String song) {
    return this.musicRepository.selecionarMusica(song);
  }
}
