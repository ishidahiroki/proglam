
public class arraySort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arrays1 = { 96 , 45 , 31 , 29 , 84 , 77 };
		display(arrays1,false);
		arraysSort(arrays1,true);
		display(arrays1,true);
		arraysSort(arrays1,false);
		display(arrays1,true);
	}
	
	public static void arraysSort(int[] array,boolean orderType){
		if(orderType == true) {//昇順の場合
			for(int i = 0;i < array.length-1; i++) {
				for(int j = 0;j < array.length-i-1; j++) {
					if(array[j] > array[j+1]) {
						change(array,j,j+1);
					}
				}
			}
		}
		else if(orderType == false) {//降順の場合
			for(int i = 0;i < array.length-1; i++) {
				for(int j = 0;j < array.length-i-1; j++) {
					if(array[j] < array[j+1]) {
						change(array,j,j+1);
					}
				}
			}
		}
	}
	
	public static void display(int[] array,boolean isSorted) {
		if(isSorted == false) {//並び替え前の場合
			System.out.println("****並び替え前****");
			for(int i = 0;i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		}
		else if(isSorted == true) {//並び替え後の場合
			System.out.println("****並び替え後****");
			for(int i = 0;i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();//空白分を表示
	}
	
	public static void change(int[] array,int i,int j) {
		int tmp;
		tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
