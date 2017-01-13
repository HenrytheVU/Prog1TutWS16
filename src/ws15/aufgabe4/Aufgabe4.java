package ws15.aufgabe4;

import ws15.aufgabe3.Schliessfachtuer;

public class Aufgabe4 {

	public static void main(String[] args) {
		Schliessfachtuer[] alleSchliessfachtueren = new Schliessfachtuer[100];

		for (int i = 0; i < alleSchliessfachtueren.length; i++) {
			alleSchliessfachtueren[i] = new Schliessfachtuer(i + 1, false);
		}

		for (int durchgang = 0; durchgang < 100; durchgang++) {
			if (durchgang == 0) {
				for (int i = 0; i < alleSchliessfachtueren.length; i++) {
					alleSchliessfachtueren[i].setOpen(true);
					System.out.print(alleSchliessfachtueren[i]);
				}
				System.out.println();
			} else {
				for (int i = 0; i < alleSchliessfachtueren.length; i++) {
					Schliessfachtuer tuer = alleSchliessfachtueren[i];
					if (i != 0 && durchgang != 1) {
						if (i % durchgang == 0) {
							tuer.setOpen(!tuer.isOpen());
						}
					}
					System.out.print(alleSchliessfachtueren[i]);
				}
				System.out.println();
			}

		}

	}

}
