package structuralPatterns.adapterPattern.audioPlayerExample.advancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing '" + fileName + "' of vlc format.");
	}

	@Override
	public void playMp4(String fileName) {}

}
