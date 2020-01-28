package structuralPatterns.adapterPattern.audioPlayerExample;

import structuralPatterns.adapterPattern.audioPlayerExample.advancedMediaPlayer.AdvancedMediaPlayer;
import structuralPatterns.adapterPattern.audioPlayerExample.advancedMediaPlayer.Mp4Player;
import structuralPatterns.adapterPattern.audioPlayerExample.advancedMediaPlayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String type) {
		if("vlc".equals(type.toLowerCase())) advancedMediaPlayer = new VlcPlayer();
		else advancedMediaPlayer = new Mp4Player();
	}

	@Override
	public void play(String fileName, String fileFormat) {
		if("vlc".equals(fileFormat.toLowerCase())) {
			advancedMediaPlayer.playVlc(fileName);
		} else {
			advancedMediaPlayer.playMp4(fileName);
		}
	}
}
