package days14;

import java.util.Random;

class CardDeck{
	private Card [] cards = new Card[52]; // 여길 private 하신건가
	public CardDeck() {
		int i = 0; // cards 의 첨자로 사용될 변수
		for (int k = 1 ; k<=4; k++) {  // 카드의 종류 1~4 반복
			for ( int n = 1 ; n<=13 ; n++) {  // 카드 번호 1~13 반복
				cards[i++] = new Card(k,n);  // 카드 장수 i 는 0~51
			}
		}
	}
	public void shuffle() {
		for (int i = 0 ; i<52; i++) {
			int r = (int)(Math.random()*52);
			Card temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
			// 중복 발생하자나 그럼  //  왜 중복이 안되는거야 이해 안되서 그래 정말 아 ? 그런가? 애초에 카드 자체가 그러네
		}
	}
	public Card pick(int i) {
		return cards[i];
	}
	
}


public class PlayCard {

	public static void main(String[] args) {
		CardDeck d = new CardDeck();
		d.shuffle();
		/*
		System.out.printf("%s\n",d.pick(0));  // 
		System.out.printf("%s\n",d.pick(1));
		System.out.printf("%s\n",d.pick(5));
		System.out.printf("%s\n",d.pick(17));
		System.out.printf("%s\n",d.pick(7));
		*/
		Card [] player1 = new Card[5];
		Card [] player2 = new Card[5];
		Card [] player3 = new Card[5];
		Card [] player4 = new Card[5];
		// 카드를 1명당 5장식 분배하고 한명단 1줄에 보유카드를 출력해서
		// 세줄을 출력해주세요
		int cnt = 0;
		for ( int i = 0 ; i<5 ; i++) {
				player1[i] = d.pick(cnt++);
				player2[i] = d.pick(cnt++);
				player3[i] = d.pick(cnt++);
				player4[i] = d.pick(cnt++);
		}
		for ( int i = 0 ; i<5 ; i++) System.out.printf("%s  ",player1[i]);
		System.out.println();
		for ( int i = 0 ; i<5 ; i++) System.out.printf("%s  ",player2[i]);
		System.out.println();
		for ( int i = 0 ; i<5 ; i++) System.out.printf("%s  ",player3[i]);
		System.out.println();
		for ( int i = 0 ; i<5 ; i++) System.out.printf("%s  ",player4[i]);
		System.out.println();
		
		
		

	}

}
