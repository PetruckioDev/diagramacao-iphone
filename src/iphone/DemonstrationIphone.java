package iphone;

import iphone.music.Music;
import iphone.telephone.Contact;

import java.util.Locale;

public class DemonstrationIphone {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.displayPage("https://www.example.com");
        iphone.createNewTab();
        iphone.refreshPage();
        iphone.play();
        iphone.pause();
        iphone.selectMusic(new Music("Marimba", 60));
        iphone.call(new Contact("John Doe", "123-456-7890"));
        iphone.answer();
        iphone.startVoiceMail();
    }
}