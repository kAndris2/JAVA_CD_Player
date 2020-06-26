public class Mp3Cd extends Cd{

    public Mp3Cd(int Limit){
        super(Limit);
    }

    public void addTrack(Song song){
        songs.add(song);
    }
}
