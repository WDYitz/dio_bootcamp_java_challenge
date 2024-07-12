package com.dio.challenge.Iphone.UseCases.PhoneCall;

import com.dio.challenge.Iphone.Repositories.PhoneCallRepository;

public class PhoneCall {
  private PhoneCallRepository phoneCallRepository;

   public PhoneCall(PhoneCallRepository phoneCallRepository) {
    this.phoneCallRepository = phoneCallRepository;
  }

  public String call(String number) {
    return this.phoneCallRepository.ligar(number);
  }

  public String aswer() {
    return this.phoneCallRepository.atender();
  }

  public String startVoiceMail() {
    return this.phoneCallRepository.iniciarCorreioVoz();
  }
}
