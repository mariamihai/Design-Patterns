package behavioralPatterns.templateMethodPattern.gameExample;

public abstract class Game {

	public abstract void initialize();
	public abstract void startPlay();
	public abstract void endPlay();
	
	/**
	 * Template method.
	 */
	public final void play() {
		// initialize the game
		initialize();
		
		// start game
		startPlay();
		
		// end game
		endPlay();
	}
}
