package iphone.music;

import java.util.ArrayList;
import java.util.List;

public class Music {
    private String title;
    private final List<String> information = new ArrayList<>();
    private final int durationInSeconds;

    public Music(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public List<String> getInformation() {
        return information;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDurationInMinutes() {
        double duration = durationInSeconds / 60.0;
        String model = "%2.2f".formatted(duration).replace(",", ":");
        return model;
    }
}
