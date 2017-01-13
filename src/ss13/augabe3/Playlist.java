package ss13.augabe3;

public class Playlist {

	public Musikstueck[] createPlaylist() {
		Musikstueck[] playlist = new Musikstueck[3];
		playlist[0] = new Musikstueck("JB", "Baby", 360);
		playlist[1] = new Musikstueck("MJ", "Bad", 700);
		playlist[2] = new Musikstueck("Helene Fischer", "Atemlos", 460);
		return playlist;
	}
}
