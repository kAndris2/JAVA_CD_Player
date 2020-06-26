public class AudioCd extends Cd {

    public AudioCd(int Limit){
        super(Limit);
    }

    public void addTrack(Song song){
        songs.add(song);
    }
}
