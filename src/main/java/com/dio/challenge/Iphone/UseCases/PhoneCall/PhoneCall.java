package com.dio.challenge.Iphone.UseCases.PhoneCall;

import com.dio.challenge.Iphone.Repositories.PhoneCallRepository;

public class PhoneCall {
  private PhoneCallRepository phoneCallRepository;

   public PhoneCall(PhoneCallRepository phoneCallRepository) {
  }

  public void call(String number) {
    this.phoneCallRepository.ligar(number);
  }

  public void aswer() {
    this.phoneCallRepository.atender();
  }

  public void startVoiceMail() {
    this.phoneCallRepository.iniciarCorreioVoz();
  }
}
