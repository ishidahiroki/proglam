/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;
import java .util.Scanner;
import java.math.BigDecimal;
/**
 *
 * @author ひろき
 */
public class GPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn=new Scanner (System.in);
        System.out.println("あなたのGPAを算出します。(半角で入力してください)");
        
        System.out.println("Sの数を入力してください。");
        double s =stdIn.nextInt();//Sの数を入力させる
        
        System.out.println("Aの数を入力してください。");
        double a =stdIn.nextInt();//Aの数を入力させる
        
        System.out.println("Bの数を入力してください。");
        double b =stdIn.nextInt();//Bの数を入力させる
        
        System.out.println("Cの数を入力してください。");
        double c =stdIn.nextInt();//Cの数を入力させる
        
        System.out.println("Dの数を入力してください。");
        double d =stdIn.nextInt();//Dの数を入力させる
        
        double num=s+a+b+c+d;//全体の科目数を合算
        double gpa=(s*4+a*3+b*2+c*1+d*0)/num;//GPAを算出
        
        BigDecimal bd = new BigDecimal(gpa);//元データ(gpa)をBigDecimal型にする
        BigDecimal bd1 = bd.setScale(2,BigDecimal.ROUND_HALF_UP);//小数第3位を四捨五入する
        
        System.out.println("あなたのGPAは"+ bd1.doubleValue() +"です。");//GPAを表示
    }
    
}
