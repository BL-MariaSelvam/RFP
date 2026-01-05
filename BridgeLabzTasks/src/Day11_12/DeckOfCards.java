package Day11_12;

import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {
		String[] suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks= {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
		
		String[] deck=new String[52];
		int index=0;
		for(String suit:suits) {
			for(String rank:ranks) {
				deck[index++]=rank+" of "+suit;
			}
		}

		
		Random random=new Random();
		for(int i=deck.length-1;i>0;i--) {
			int j=random.nextInt(i+1);
			String temp=deck[i];
			deck[i]=deck[j];
			deck[j]=temp;
		}
		
		String[][] players=new String[4][9];
		index=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<4;j++) {
				players[j][i]=deck[index++];
				
			}
		}
		
		System.out.println("Cards for 4 players");
		for(int i=0;i<4;i++) {
			  System.out.println("Player " + (i + 1) + " cards:");
			for(int j=0;j<9;j++) {
				System.out.println(players[i][j]);
			}
			System.out.println();
		}
	}

}
