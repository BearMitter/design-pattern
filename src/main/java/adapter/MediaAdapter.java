package adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer amp;

	// public MediaAdapter(String audioType) {
	//
	// if (audioType.equalsIgnoreCase("vlc")) {
	// amp = new VlcPlayer();
	// } else if (audioType.equalsIgnoreCase("mp4")) {
	// amp = new Mp4Player();
	// }
	//
	// }

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file.name: " + fileName);
		} else

		if (audioType.equalsIgnoreCase("vlc")) {
			amp = new VlcPlayer();
			amp.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			amp = new Mp4Player();
			amp.playMp4(fileName);
		} else {
			System.out.println(audioType + "not supported.");
		}
	}

}
