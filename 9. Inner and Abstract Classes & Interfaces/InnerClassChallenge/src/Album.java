import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongsList songsList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songsList = new SongsList();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public SongsList getSongsList() {
        return songsList;
    }

    public boolean addSong(String title, double duration) {
        if (songsList.findSongTitle(title) >= 0) {
            System.out.println("Cannot add song " + title + ". Song already exists in album " + name);
            return false;
        } else {
            Song newSong = new Song(title, duration);
            songsList.add(newSong);
            System.out.println("Added song " + newSong.toString() + " to album " + name);
            return true;
        }
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < songsList.songArrayList.size())) {
            playList.add(songsList.songArrayList.get(index));
            System.out.println("Added song " + songsList.songArrayList.get(index).toString() + " to playlist.");
            return true;
        }
        System.out.println("Cannot add track number " + trackNumber + " from album " + name +
                " to playlist.");
        return false;
    }

    public boolean addSongToPlaylist(String songTitle, LinkedList<Song> playList) {
        int position = songsList.findSongTitle(songTitle);

        if (position >= 0) {
            Song newSong = songsList.songArrayList.get(position);
            playList.add(newSong);
            System.out.println("Added song " + newSong.toString() + " to playlist.");
            return true;
        } else {
            System.out.println("Cannot add song " + songTitle + " to playlist.");
            return false;
        }
    }

    private class SongsList {
        private ArrayList<Song> songArrayList;

        public SongsList() {
            this.songArrayList = new ArrayList<>();
        }

        private int findSongTitle(String songTitle) {
            for (int i = 0; i < songArrayList.size(); i++) {
                if (songArrayList.get(i).getTitle().equals(songTitle)) {
                    return i;
                }
            }
            return -1;
        }

        public boolean add(Song song) {
            if (songArrayList.contains(song)){
                return false;
            }
         else {
            songArrayList.add(song);
            return true;
        }
    }

}
}
