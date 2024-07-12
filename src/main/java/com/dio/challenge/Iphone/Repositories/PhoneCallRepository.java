package com.dio.challenge.Iphone.Repositories;

import com.dio.challenge.Iphone.DTO.PhoneCallDTO;

public class PhoneCallRepository implements PhoneCallDTO {
  public String ligar(String numero) {
    return "Ligando para o numero " + numero;
  }

  public String atender() {
    return "Atendendo Chamada";
  }

  public String iniciarCorreioVoz() {
    return "Iniciando Correio de Voz";
  }

}
