package lists.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

  private String name;
  private String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    songs = new ArrayList<>();
  }

  public boolean addSong(String title, double duration) {

    if (title.isEmpty()) {
      return false;
    }

    songs.add(new Song(title, duration));
    return true;
  }

  private Song findSong(String title) {
    return songs.stream().filter(song -> song.getTitle().equals(title)).findFirst().orElse(null);
  }

  public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
    if (trackNumber <= 0 || trackNumber > songs.size()) {
      return false;
    }

    Song newSong = songs.get(trackNumber-1);

    ListIterator<Song> playlistIterator = playlist.listIterator();

    while (playlistIterator.hasNext()) {
      if (playlistIterator.next().getTitle().compareToIgnoreCase(newSong.getTitle()) == 0) {
        System.out.println("Already added.");
        return false;
      }
    }

    playlist.add(newSong);
    return true;
  }

  public boolean addToPlayList(String title, LinkedList<Song> playlist) {

    if (title.isEmpty()) {
      return false;
    }

    Song newSong = findSong(title);
    ListIterator<Song> playlistIterator = playlist.listIterator();

    while (playlistIterator.hasNext()) {
      if (playlistIterator.next().getTitle().compareToIgnoreCase(newSong.getTitle()) == 0) {
        return false;
      }
    }

    playlist.add(newSong);
    return true;
  }
}
