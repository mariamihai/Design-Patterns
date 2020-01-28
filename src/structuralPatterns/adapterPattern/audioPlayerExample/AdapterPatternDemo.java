package structuralPatterns.adapterPattern.audioPlayerExample;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("Song 1", "mp3");
		audioPlayer.play("Song 2", "mp4");
		audioPlayer.play("Song 3", "vlc");
		audioPlayer.play("Song 4", "mp4");
	}

}
