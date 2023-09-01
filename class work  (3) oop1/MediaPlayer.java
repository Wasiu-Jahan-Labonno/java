public class MediaPlayer {
     private String defaultFormat;
    private int defaultVolume;

    // Default constructor
    public MediaPlayer() {
        this.defaultFormat = "mp3";
        this.defaultVolume = 50;
    }

    // Constructor with format and volume
    public MediaPlayer(String defaultFormat, int defaultVolume) {
        this.defaultFormat = defaultFormat;
        this.defaultVolume = defaultVolume;
    }

    public void playAudio(String fileName) {
        playAudio(fileName, defaultFormat, defaultVolume);
    }

    public void playAudio(String fileName, int volume) {
        playAudio(fileName, defaultFormat, volume);
    }

    public void playAudio(String fileName, String format, int volume) {
        System.out.println("Playing audio file: " + fileName);
        System.out.println("Format: " + format);
        System.out.println("Volume: " + volume);
        // Additional implementation to actually play the audio file
    }

    public static void main(String[] args) {
        MediaPlayer player1 = new MediaPlayer();
        MediaPlayer player2 = new MediaPlayer("wav", 70);

        player1.playAudio("song1.mp3");
        player1.playAudio("song2.mp3", 60);
        player1.playAudio("song3.mp3", "mp3", 80);

        player2.playAudio("music.wav");
        player2.playAudio("audio.wav", 40);
        player2.playAudio("audio2.wav", "wav", 90);
    }
}
