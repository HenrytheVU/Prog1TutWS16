package uebung12.aufgabe3;

public class LottoZiehung {

	public static void main(String[] args) {

		Knoten trommel = createList();

		Knoten[] gezogen = new Knoten[6];

		for (int i = 0; i < gezogen.length; i++) {
			gezogen[i] = lottoZiehen(trommel, i);
			System.out.println(gezogen[i].getZahl());
		}

	}

	public static Knoten createList() {
		Knoten pre = new Knoten(1, null, null);
		for (int i = 2; i < 50; i++) {
			Knoten k = new Knoten(i, null, null);
			pre.setNext(k);
			k.setPre(pre);
			pre = k;
		}
		return getFirst(pre);
	}

	public static Knoten getFirst(Knoten k) {
		while (k.getPre() != null) {
			k = k.getPre();
		}
		return k;
	}

	public static void printList(Knoten k) {
		while (k.getNext() != null) {
			System.out.println(k.getZahl());
			k = k.getNext();
		}
		System.out.println(k.getZahl());

	}

	public static Knoten lottoZiehen(Knoten k, int anzahlGezogen) {
		int random = (int) (Math.random() * (49 - anzahlGezogen)) + 1;
		return knotenEntfernen(k, random);
	}

	public static Knoten knotenEntfernen(Knoten k, int nummer) {
		k = getFirst(k);
		for (int i = 1; i < nummer; i++) {
			k = k.getNext();
		}
		Knoten pre = k.getPre();
		Knoten next = k.getNext();
		if (pre != null) {
			pre.setNext(next);
		}

		if (next != null) {
			next.setPre(pre);
		}

		return k;

	}
}
