package Practice;

class Pr_Card {
	private int kind;
	private int num;
	
	Pr_Card(int kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		String [] s1 = { "", "Clover", "Heart", "Diamond", "Spade"};
		String [] s2 = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String result = "[" + s1[this.kind] + " : " + s2[this.num] + "]";
		return result;
	}
	
}

class Pr_CardDeck{
	Pr_Card [] cd = new Pr_Card[52];  ///--- 여기가 지금 잘 이해가 안되는건가
													///---- Pr_Card 52개의 객체를 만들거다! 이정도?
													///---- cd[0] ,~cd[51] 까지
	Pr_CardDeck() {
		int k =0;
		for(int i = 1 ; i<=4 ; i++) {
			for(int j = 1 ; j<=13; j++) {
				cd[k++] = new Pr_Card(i,j);
			}
		}
	}
	void shuffle() {
		for (int i = 0 ; i<52 ; i++) {
			
		}
	}
	
}



public class practice03 {

	public static void main(String[] args) {
		Pr_CardDeck deck = new Pr_CardDeck();
		
		
	}
}
