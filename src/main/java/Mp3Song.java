public class Mp3Song extends Song {
    public int size;

    public Mp3Song(String title,int Size) {
        super(title);
        size = Size;
    }

    public int getLength() {
        return 0;
    }

    public int getSize() { return size; }
}
