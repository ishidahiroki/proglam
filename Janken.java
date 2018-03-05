
public class Janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("[じゃんけん]: 0:グー 1:チョキ 2:パー");
		
		int mynumber = new java.util.Scanner(System.in).nextInt();
		int enemy = new java.util.Random().nextInt(3);
		
		if(mynumber == enemy) {
			System.out.println("自分:" + mynumber);
			System.out.println("相手:" + enemy);
			System.out.println("結果: draw");
		}
		if(mynumber == enemy-1 || mynumber == enemy+2){
			System.out.println("自分:" + mynumber);
			System.out.println("相手:" + enemy);
			System.out.println("結果: Win!!");
		}
		if(mynumber == enemy+1 || mynumber == enemy-2) {
			System.out.println("自分:" + mynumber);
			System.out.println("相手:" + enemy);
			System.out.println("結果: lose...");
		}
	}

}

