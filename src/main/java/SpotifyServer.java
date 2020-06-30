import java.util.ArrayList;

public class SpotifyServer {

    public ArrayList<Song> getTrackList()
    {
        return new ReadXML().Read();
    }
}
