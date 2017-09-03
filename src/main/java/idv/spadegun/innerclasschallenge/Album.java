package idv.spadegun.innerclasschallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new idv.spadegun.innerclasschallenge.Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<idv.spadegun.innerclasschallenge.Song> playList) {
        idv.spadegun.innerclasschallenge.Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<idv.spadegun.innerclasschallenge.Song> playList) {
        idv.spadegun.innerclasschallenge.Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {

        private List<idv.spadegun.innerclasschallenge.Song> songs;
        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(idv.spadegun.innerclasschallenge.Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private idv.spadegun.innerclasschallenge.Song findSong(String title) {
            for (idv.spadegun.innerclasschallenge.Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public idv.spadegun.innerclasschallenge.Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index < this.songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
