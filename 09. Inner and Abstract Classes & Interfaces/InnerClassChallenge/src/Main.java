import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Best Music", "Chopin");
        album.addSong("Monkey Beat", 3.2);
        album.addSong("Bibi Style", 1.56);
        album.addSong("Koko Jambo", 2.36);
        album.addSong("Bibi Style", 2.14);
        albums.add(album);


        album = new Album("RocknRoll", "Deep Purple");
        album.addSong("Cooperation", 1.23);
        album.addSong("Folky", 2.56);
        album.addSong("Mindset", 5.36);
        album.addSong("Super Granny", 1.14);
        album.addSong("Kapibara", 1.55);
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<>();
        System.out.println("\n");
        albums.get(0).addSongToPlaylist("Monkey Beat", playList);
        albums.get(0).addSongToPlaylist("Koko Jambo", playList);
        albums.get(0).addSongToPlaylist("Bibi Style", playList);
//        albums.get(0).addSongToPlaylist("Nasty Mommy", playList);
//        albums.get(0).addSongToPlaylist("Folky", playList);
        albums.get(1).addSongToPlaylist("Cooperation", playList);
        albums.get(1).addSongToPlaylist(3, playList);
        albums.get(1).addSongToPlaylist(4, playList);
        albums.get(1).addSongToPlaylist(5, playList);

        System.out.println("\n");
        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean isForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        showInstuctions();

        while (!quit) {

            if (playList.size() == 0) {
                System.out.println("No songs in playlist");
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0: // quit
                    quit = true;
                    break;

                case 1: // skip forward
                    if (!isForward) {
                        isForward = true;
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist.");
                    }
                    break;

                case 2: // skip backwards
                    if (isForward) {
                        isForward = false;
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist.");
                    }
                    break;

                case 3: //replay the current song
                    if (isForward) {
                        System.out.println("Now playing: " + listIterator.previous());
                        listIterator.next();
                    } else {
                        System.out.println("Now playing " + listIterator.next());
                        listIterator.previous();
                    }
                    break;

                case 4: // remove the current song
                    System.out.println("Removing the current song from playlist");
                    listIterator.remove();

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                        isForward = true;
                    } else if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        isForward = false;
                    }
                    break;

                case 5:
                    showPlaylist(playList);
                    break;
                case 6:
                    showInstuctions();
                    break;

            }
        }
    }

    private static void showPlaylist(LinkedList<Song> playList) {
        System.out.println("Full playlist: ");
        ListIterator<Song> listIterator = playList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next().toString());
        }
    }

    private static void showInstuctions() {
        System.out.println("Press the number: ");
        System.out.println("0. Quit the playlist");
        System.out.println("1. Skip forward to next song");
        System.out.println("2. Skip backwards to previous song");
        System.out.println("3. Replay the current song");
        System.out.println("4. Remove the current song");
        System.out.println("5. Show the playlist");
        System.out.println("6. Show instructions");
    }
}
