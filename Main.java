
public class Main {
	public static void main(String[] args) {
		
		int number = new java.util.Random().nextInt(12) + 1;//1以上12以下の乱数を生成する。
		
		System.out.println("今日の運勢の高い誕生月の人は..." + number + "月の人です！");
		
		int itemnumber = new java.util.Random().nextInt(5);//0以上4以下の乱数を生成する
		
		String item1 = "赤色のハンカチ";
		String item2 = "くまのぬいぐるみ";
		String item3 = "白色のタオル";
		String item4 = "腕時計";
		String item5 = "スマートフォン";
		
		String luckyitem = "";
		switch (itemnumber){
		case 0://itemnumber == 0の場合
			luckyitem = item1;
			break;
		case 1://itemnumber == 1の場合
			luckyitem = item2;
			break;
		case 2://itemnumber == 2の場合
			luckyitem = item3;
			break;
		case 3://itemnumber == 3の場合
			luckyitem = item4;
			break;
		case 4://itemnumber == 4の場合
			luckyitem = item5;
			break;
		}
		System.out.println(number + "月のあなたのラッキーアイテムは「"+ luckyitem +"」です！");
	}

}
