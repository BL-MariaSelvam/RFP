package Day11_12;

public class Player {
	String name;
    CardQueue cards;
    
	public Player(String name) {
		super();
		this.name = name;
		this.cards = new CardQueue();
	}
	
	public void addCard(Card card) {
        cards.enqueue(card);
    }
	
	public void sortCards() {
        cards.sortByRank();
    }

	public void printPlayerCards() {
        System.out.println(name + " cards:");
        cards.printCards();
        System.out.println();
    }
}


