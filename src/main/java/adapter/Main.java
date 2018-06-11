package adapter;

public class Main {

	public static void main(String[] args) {
		MediaAdapter ma = new MediaAdapter();

		ma.play("mp3", "beyond the horizon.mp3");
		ma.play("mp4", "alone.mp4");
		ma.play("vlc", "far far away.vlc");
		ma.play("avi", "mind me.avi");
	}

}
