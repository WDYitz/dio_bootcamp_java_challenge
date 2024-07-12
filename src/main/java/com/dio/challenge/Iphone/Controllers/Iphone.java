package com.dio.challenge.Iphone.Controllers;

import java.util.Scanner;

import com.dio.challenge.Iphone.Repositories.MusicRepository;
import com.dio.challenge.Iphone.Repositories.PhoneCallRepository;
import com.dio.challenge.Iphone.Repositories.SafariRepository;
import com.dio.challenge.Iphone.UseCases.Music.Music;
import com.dio.challenge.Iphone.UseCases.PhoneCall.PhoneCall;
import com.dio.challenge.Iphone.UseCases.Safari.Safari;

public class Iphone {
  public static void main(String[] args) {
    MusicRepository musicRepository = new MusicRepository();
    SafariRepository safariRepository = new SafariRepository();
    PhoneCallRepository phoneCallRepository = new PhoneCallRepository();

    System.out.println(
        "Welcome to your Iphone, what would you like to do? \n 1 - Listen to music \n 2 - Open Safari \n 3 - Make a phone call \n 0 - Exit");

    // CASE 1 - Music App
    // CASE 2 - Safari App
    // CASE 3 - Phone Call
    try (Scanner scanner = new Scanner(System.in)) {
      int option = scanner.nextInt();

      do {
        switch (option) {
          case 1:
            System.out.println(
                "What would you like to do? \n 1 - Play \n 2 - Pause  \n 3 - Select song \n 0 - Exit Music App");
            Music music = new Music(musicRepository);
            int musicOption = scanner.nextInt();
            while (musicOption != 0) {

              switch (musicOption) {
                case 1:
                  System.out.println(music.playSong());
                  break;
                case 2:
                  System.out.println(music.pauseSong());
                  break;
                case 3:
                  System.out.println("What song would you like to play?");
                  String song = scanner.next();
                  System.out.println(music.selectSong(song));
                  break;
                case 0:
                  System.out.println("Exiting Music App");
                  return;
                default:
                  break;
              }

              musicOption = scanner.nextInt();
            }
            break;
          case 2:
            System.out.println(
                "What would you like to do? \n 1 - Open url \n 2 - Open new tab  \n 3 - Refresh page \n 0 - Exit Safari");
            Safari safari = new Safari(safariRepository);
            int safariOption = scanner.nextInt();

            while (safariOption != 0) {

              switch (safariOption) {
                case 1:
                  System.out.println("What page would you like to open?");
                  String url = scanner.next();
                  System.out.println(safari.openPage(url));
                  break;
                case 2:
                  System.out.println(safari.openNewTab());
                  break;
                case 3:
                  System.out.println(safari.refreshPage());
                  break;
                case 0:
                  System.out.println("Exiting Safari");
                  return;
                default:
                  break;
              }
              safariOption = scanner.nextInt();
            }
            break;
          case 3:
            System.out.println(
                "What would you like to do? \n 1 - Call \n 2 - Answer  \n 3 - Voice Mail \n 0 - Exit Phone Call");
            PhoneCall phoneCall = new PhoneCall(phoneCallRepository);
            int phoneCallOption = scanner.nextInt();
            while (phoneCallOption != 0) {

              switch (phoneCallOption) {
                case 1:
                  System.out.println("What number would you like to call?");
                  String number = scanner.next();
                  System.out.println(phoneCall.call(number));
                  break;
                case 2:
                  System.out.println(phoneCall.aswer());
                  break;
                case 3:
                  System.out.println(phoneCall.startVoiceMail());
                  break;
                case 0:
                  System.out.println("Exiting Phone Call");
                  return;
                default:
                  break;
              }
              phoneCallOption = scanner.nextInt();
            }
            break;
          case 0:
            System.out.println("Exiting Iphone");
            return;

          default:
            break;
        }
        System.out.println(
            "Welcome to your Iphone, what would you like to do? \n 1 - Listen to music \n 2 - Open Safari \n 3 - Make a phone call \n 0 - Exit");
        option = scanner.nextInt();
      } while (option != 0);
    }

  }
}
