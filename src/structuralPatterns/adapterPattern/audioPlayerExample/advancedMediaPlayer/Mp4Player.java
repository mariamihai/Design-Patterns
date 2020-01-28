package structuralPatterns.adapterPattern.audioPlayerExample.advancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing '" + fileName + "' of mp4 format.");
	}

}
