public class Mp3Song extends Song {
    public int size;
    public int length;

    public Mp3Song(String title, int Length, int Size) {
        super(title);
        length = Length;
        size = Size;
    }

    public int getLength() {
        return length;
    }

    public int getSize() { return size; }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\nLength: " + length + "\nSize: " + size;
    }
}
