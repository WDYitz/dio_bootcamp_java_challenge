package com.dio.challenge.Iphone.Repositories;

import com.dio.challenge.Iphone.DTO.PhoneCallDTO;

public class PhoneCallRepository implements PhoneCallDTO {
  public void ligar(String numero) {
    System.out.println("Ligando para o numero " + numero);
  }

  public void atender() {
    System.out.println("Atendendo Chamada");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando Correio de Voz");
  }

}
