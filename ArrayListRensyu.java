package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListRensyu {

	//入力した値をArrayListに追加するメソッド
	public List<Integer> ArrayList() {
		List<Integer> list=new ArrayList();
		int num=10;
		System.out.println("ArrayListを使ってみよう！");
		System.out.println("Listに数字をどんどん追加していってみよう。");
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("要素追加するよ数字を入れてね(0で終了):");
			num=sc.nextInt();
			if(num!=0) {
			list.add(num);
			}else {
				break;
			}
			System.out.println(num+"が追加したよ！");
			
		}
		System.out.println("--結果--");
		System.out.println("要素数:"+list.size());
		System.out.print("要素:");
		for(int number:list) {
			System.out.print(number+",");
		}
		return list;
	}
	
	//引数で貰った整数でArrayListを作成するメソッド
	public List<Integer> ArrayList2(int n1,int n2,int n3) {
		List<Integer> list=new ArrayList();
		
		int i=0;
		
		list.add(n1);
		list.add(n2);
		list.add(n3);
		
			
		System.out.println("--結果--");
		System.out.println("要素数:"+list.size());
		System.out.print("要素:");
		for(int number:list) {
			System.out.print(number+",");
		}
		System.out.print("\n");
		return list;
	}
	
	//ArrayListを作成して要素内の和を出すメソッド
	public int Plus(int n) {
		List<Integer> list=new ArrayList();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
			int num2=0;
		for(int num:list) {
			num2+=num;
		}
		
		return num2;
		
	}
	
	//ArrayListを乱数0~9で作り、それを昇順でソートするメソッド
	public ArrayList<Integer> Sort(int n){
		ArrayList<Integer> list=new ArrayList();
		for(int i=0;i<n;i++) {
			Random rand=new Random();
			int nu=rand.nextInt(10);
			list.add(nu);
		}
		
		Collections.sort(list);
		
		
		return list;
	}
}
