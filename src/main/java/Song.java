public abstract class Song {
    public String Title;

    public Song(String title){
        Title = title;
    }

    public String getTitle() {return Title;}
    public abstract int getLength();
}
