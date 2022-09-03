public class MusicStyles {
	private String musicianPerformer;

	MusicStyles(String musicianPerformer) {
		this.musicianPerformer = musicianPerformer;
	}

	public String getMusicianPerformer() {
		return musicianPerformer;
	}

	public void playMusic() {
		System.out.print("Play " + MusicStyles.this.getMusicianPerformer() + "\nGenre not found \n");
	}

}
