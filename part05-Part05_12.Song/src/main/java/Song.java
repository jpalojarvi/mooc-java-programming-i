
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    @Override
    public boolean equals(Object comparedObject){
        // if the variables are located in the same position i.e. memory address, they are equal
        if (this == comparedObject){
            return true;
        }
        
        // if the type of the compared object is not the same, the objects are not equal
        if (!(comparedObject instanceof Song)){
            return false;
        }
        
        // convert the Object type comparedObject object into a Song type object called comparedSong, so that their parameters can be compared
        Song comparedSong = (Song) comparedObject;
        
        // if the values of the object variables are the same, the objects are equal enough for our method to return true
        return this.artist.equals(comparedSong.artist)
                && this.durationInSeconds == comparedSong.durationInSeconds
                && this.name.equals(comparedSong.name);
    }


}
