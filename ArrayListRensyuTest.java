package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArrayListRensyuTest {
	
	ArrayListRensyu arra;
	
	@BeforeEach
	//前処理
	public void setUp() {
		arra=new ArrayListRensyu();
	}

	@Test
	@DisplayName("ArrayList内の要素の全和を求めるメソッド")
	void test() {
		int num=arra.Plus(11);
		
		int ans=11+10+9+8+7+6+5+4+3+2+1;
		assertEquals(ans,num);
	}
	
	@Test
	@DisplayName("引数で渡した整数をArrayListに追加するメソッド")
	void test2() {
		int x=5;
		int y=3;
		int z=2;
		List<Integer> list=arra.ArrayList2(x, y, z);
		
		for(int num:list) {
			System.out.println(num);
		}
		
		List<Integer> list2=new ArrayList();
		list2.add(x);
		list2.add(y);
		list2.add(z);
		
		assertEquals(list,list2);
	}
	
	@Test
	@DisplayName("ArrayListを乱数で整数0~9を出して昇順にソートするメソッド")
	void test3() {
		List<Integer> list=arra.Sort(9);
		System.out.println(list);
		int number=0;
		for(int num:list) {
			assertTrue(number<=num);	//for文でリストを取り出してnumがnumber以上だったら異常なし。
			number=num;
		}
		
	}

}
