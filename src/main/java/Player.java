import java.util.ArrayList;

public class Player {
    ArrayList<Song> songs = new ArrayList<Song>();
    Cd cd = null;
    Writer writer = null;
    PlayerMode pMode = null;
    SpotifyServer spotify = null;
    Song currentSong = null;

    public void next() {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).equals(currentSong)) {
                currentSong = songs.get(i + 1);
                break;
            }
        }
    }

    public void prev() {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i + 1).equals(currentSong)) {
                currentSong = songs.get(i);
                break;
            }
        }
    }

    public void show() {
        currentSong.toString();
    }

    public void stop() {
        currentSong = null;
    }

    public void start() {
        currentSong = songs.get(0);
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void setCd(Cd cd) {
        this.cd = cd;
    }

    public void setMode(PlayerMode mode) {
        pMode = mode;
        if (mode.equals("Spotify")) {
            spotify = new SpotifyServer();
            songs = spotify.getTrackList();
        }
    }
}
