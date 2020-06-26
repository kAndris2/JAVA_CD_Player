import java.util.ArrayList;

public abstract class Cd {
    int limit;
    ArrayList<Song> songs;

    public Cd(int Limit){
        limit = Limit;
    }

    public abstract void addTrack(Song song);

    public ArrayList<Song> getSongs(){ return songs; }

}
