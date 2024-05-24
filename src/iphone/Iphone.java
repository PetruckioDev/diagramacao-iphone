package iphone;

import iphone.browser.Browser;
import iphone.music.Music;
import iphone.music.player.MusicPlayer;
import iphone.telephone.Contact;
import iphone.telephone.device.TelephoneDevice;

import java.util.logging.Logger;

public class Iphone implements Browser, MusicPlayer, TelephoneDevice {

    private static final Logger logger = Logger.getLogger(Iphone.class.getName());

    @Override
    public void displayPage(String url) {
        var message = getLoggerMessage("Displaying webpage:", url);
        logger.info(message);
    }

    @Override
    public void createNewTab() {
        logger.info("Creating new tab...");
    }

    @Override
    public void refreshPage() {

        logger.info("Refreshing webpage...");
    }

    @Override
    public void play() {
        logger.info("Playing music...");
    }

    @Override
    public void pause() {
        logger.info("Pausing music...");
    }

    @Override
    public void selectMusic(Music music) {
        var message = getLoggerMessage("Selecting music:", "%s, %s".formatted(music.getTitle(), music.getDurationInMinutes()));
        logger.info(message);
    }

    @Override
    public void call(Contact contact) {
        var message = getLoggerMessage("Calling at:", "%s, %s".formatted(contact.getName(), contact.getNumber()));
        logger.info(message);
    }

    @Override
    public void answer() {
        logger.info("Answering the call...");
    }

    @Override
    public void startVoiceMail() {
        logger.info("Starting voicemail...");
    }

    private String getLoggerMessage(String message, String param) {
        return "%s {%s}".formatted(message, param);
    }
}
