package ch05_class2;

import java.util.ArrayList;

public interface MP3 {
	abstract void play();
	abstract void stop();
	abstract ArrayList<String> getSongList();
}
