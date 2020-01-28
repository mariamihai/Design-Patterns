package structuralPatterns.adapterPattern.audioPlayerExample;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String fileName, String fileFormat) {
		if("mp3".equals(fileFormat.toLowerCase())) {
			System.out.println("Playing '" + fileName + "' of mp3 format.");
		} else { // vlc or mp4
			mediaAdapter = new MediaAdapter(fileFormat);
			mediaAdapter.play(fileName, fileFormat);
		}
	}

}
