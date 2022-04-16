import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songsList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songsList = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongsList() {
        return songsList;
    }

    public boolean addSong(String title, double duration) {
        if (findSongTitle(title) >= 0) {
            System.out.println("Cannot add song " + title + ". Song already exists in album " + name);
            return false;
        } else {
            Song newSong = new Song(title, duration);
            songsList.add(newSong);
            System.out.println("Added song " + newSong.toString() + " to album " + this.name);
            return true;
        }
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < this.songsList.size())) {
            playList.add(songsList.get(index));
            System.out.println("Added song " + songsList.get(index).toString() + " to playlist.");
            return true;
        }
        System.out.println("Cannot add track number " + trackNumber + " from album " + this.name +
                " to playlist.");
        return false;
    }

    public boolean addSongToPlaylist(String songTitle, LinkedList<Song> playList) {
        int position = findSongTitle(songTitle);

        if(position >= 0){
            Song newSong = this.songsList.get(position);
            playList.add(newSong);
            System.out.println("Added song " + newSong.toString() + " to playlist.");
            return true;
        } else {
            System.out.println("Cannot add song " + songTitle + " to playlist.");
            return false;
        }
    }


    private int findSongTitle(String songTitle) {
        for (int i = 0; i < songsList.size(); i++) {
            if (songsList.get(i).getTitle().equals(songTitle)) {
                return i;
            }
        }
        return -1;
    }
}
