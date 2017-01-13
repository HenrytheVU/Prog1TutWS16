package ss13.augabe3;

public class Player {

	public static void showPlaylist(Playlist playlist) {
		Musikstueck[] lieder = playlist.createPlaylist();
		for (int i = 0; i < lieder.length; i++) {
			System.out.println("Liedname: " + lieder[i].getLiedname() + ", Laenge: " + lieder[i].getLaenge());
		}
	}

	public static void main(String[] args) {
		showPlaylist(new Playlist());
	}
}
