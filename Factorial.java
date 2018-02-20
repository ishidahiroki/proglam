/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

class Factorial{
    //非負の整数値nの階乗値を返却//
    static int factorial(int n){
        if(n>0)//正の値の場合
            return n*factorial(n-1);
        else if(n<0)//負の値の場合
            System.out.println("非負の値の入力してください");
        else//それ以外(=0)の場合
            return 1;
        return 0;
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
                System.out.print("整数値を入力せよ:");
        int x = stdIn.nextInt();//数値を入力させる
        if(factorial(x)==0){
            System.out.println("非負の階乗は定義されていません。");
        }
        System.out.println(x+"の階乗は"+factorial(x)+"です。");
    }
}
