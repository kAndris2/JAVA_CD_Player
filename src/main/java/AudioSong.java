public class AudioSong extends Song {
    public float samplingFrequency;

    public AudioSong(String title,int SamplingFrequency) {
        super(title);
        samplingFrequency = SamplingFrequency;
    }

    public int getLength() {
        return 0;
    }

    public float getSamplingFrequency() { return samplingFrequency; }
}
