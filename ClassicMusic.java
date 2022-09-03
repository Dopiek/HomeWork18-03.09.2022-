public class ClassicMusic extends MusicStyles {
	
	ClassicMusic(String musicianPerformer) {
		super(musicianPerformer);
	}

	@Override
	public void playMusic() {
		System.out.println(
				"Play " + ClassicMusic.this.getMusicianPerformer() + "\nIt’s " + PopMusic.class.getName() + "\n");
	}
}
