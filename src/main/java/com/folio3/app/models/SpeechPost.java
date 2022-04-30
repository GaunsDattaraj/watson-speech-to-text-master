package com.folio3.app.models;

/**
 * The speech post model. The audio will base-64 encoded string in the audio
 * member variable.
 * @author Fahad Zia<fzia@folio3.com>
 */
public class SpeechPost {
    private String audio;

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
