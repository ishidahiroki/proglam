
public class Janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("[じゃんけん]: 0:グー 1:チョキ 2:パー");
		
		int mynumber = new java.util.Scanner(System.in).nextInt();
		int enemy = new java.util.Random().nextInt(3);
		
		String result = "";
		if(myNumber == 0) {
			if(enemy == 1) {
				result = "Win!!";
			}else if(enemy == 2) {
				result = "lose...";
			}else if(enemy == 0) {
				result = "draw";
			}
		}else if(myNumber == 1) {
			if(enemy == 1) {
				result = "draw";
			}else if(enemy == 2) {
				result = "Win!!";
			}else if(enemy == 0) {
				result = "lose...";
			}
		}else if(myNumber == 2) {
			if(enemy == 1) {
				result = "lose...";
			}else if(enemy == 2) {
				result = "draw";
			}else if(enemy == 0) {
				result = "Win!!";
			}
		}else {
			result = "入力値が不正です。";
		}
		System.out.println("自分:" + myNumber);
		System.out.println("相手:" + enemy);
		System.out.println("結果:" + result);
	}

}

