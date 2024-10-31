
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        
        Song comparedSong = (Song) compare;
        
        if(this.artist.equals(comparedSong.artist) &&
                this.name == comparedSong.name &&
                this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
