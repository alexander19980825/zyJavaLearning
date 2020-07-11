package ZY1;

public class ZZZZ {
	public static void main(String[] args) {
	/*	  for (int i = 7; ; i += 7) {//以七的倍数为基准，做自加运算的循环
		   //符合次走两阶，余一阶，每次走三阶，余两阶，每次走四阶，余三阶，每次走五阶，余四阶，每次走六阶，余五阶。
		   if (i % 2 == 1 && i % 3 == 2 && i % 4 == 3 && i % 5 == 4 && i % 6 == 5 ) {
		    System.out.println("台阶数是："+i);
		    break;//如果找到第一个符合数据就跳出循环，否则会进入死循环的
		   
		   }
		  }
		}*/
		for(int i = 0 ; i<5 ; i++){
			if(i == 3){
				//break;退出整个循环
				continue;//结束本次循环继续后续循环
}
			System.out.println(i+"hello world!");
		}
	}
}
	

