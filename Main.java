import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		MusicStyles Maneskin = new PopMusic("Maneskin");
		MusicStyles RedHotChiliPapper = new RockMusic("RedHotChiliPapper");
		MusicStyles TwoCellos = new ClassicMusic("TwoCellos");
		MusicStyles FrankaSinatra = new MusicStyles("FrankaSinatra");

		ArrayList<MusicStyles> playList = new ArrayList<MusicStyles>();

		playList.add(Maneskin);
		playList.add(RedHotChiliPapper);
		playList.add(TwoCellos);
		playList.add(FrankaSinatra);

		for (MusicStyles music : playList) {
			music.playMusic();
		}
	}
}
