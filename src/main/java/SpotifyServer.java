import java.util.ArrayList;

public class SpotifyServer {
    ReadXML reader;
    ArrayList<Mp3Song> songs;

    public SpotifyServer() {
        reader =  new ReadXML();
        songs = reader.Read();
    }

    public ArrayList<Mp3Song> getTrackList() { return songs; }
}
