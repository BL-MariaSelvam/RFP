package Day11_12;

import java.util.Random;

public class DeckOfCardsTask1 {

	public static void main(String[] args) {
		String[] suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks= {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
		
		Card[] deck = new Card[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = new Card(rank, suit);
            }
        }

		
		Random random=new Random();
		for(int i=deck.length-1;i>0;i--) {
			int j=random.nextInt(i+1);
			Card temp=deck[i];
			deck[i]=deck[j];
			deck[j]=temp;
		}
		
		// Create players and enqueue them
        PlayerQueue playerQueue = new PlayerQueue();
        Player[] players = {
            new Player("Player 1"),
            new Player("Player 2"),
            new Player("Player 3"),
            new Player("Player 4")
        };

        for (Player p : players) {
            playerQueue.enqueue(p);
        }

        // Distribute 9 cards to each player
        index = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                players[j].addCard(deck[index++]);
            }
        }

        // Print players and their cards
        playerQueue.printAllPlayers();

	}

}
