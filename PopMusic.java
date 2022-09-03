public class PopMusic extends MusicStyles {

	PopMusic(String musicianPerformer) {
		super(musicianPerformer);
	}

	@Override
	public void playMusic() {
		System.out
				.println("Play " + PopMusic.this.getMusicianPerformer() + "\nIt’s " + PopMusic.class.getName() + "\n");
	}
}
