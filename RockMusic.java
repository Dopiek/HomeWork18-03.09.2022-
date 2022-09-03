public class RockMusic extends MusicStyles {

	RockMusic(String musicianPerformer) {
		super(musicianPerformer);
	}

	@Override
	public void playMusic() {
		System.out
				.println("Play " + RockMusic.this.getMusicianPerformer() + "\nIt’s " + PopMusic.class.getName() + "\n");
	}
}
