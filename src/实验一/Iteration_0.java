package 实验一;//输出的数值不进行储存，每一次运行都会有新的数生成；

import java.util.Random;//导入随机函数进行随机选取数字;

public class Iteration_0 {
	public static void main(String[] args) {
		short m = 0,n = 0,p = 0;//除数与被除数的初始化，以及判断值得初始化；
		char s = '+';
		Random r = new Random();
		for(int i = 0;i < 50;i++) {
			p = (short) r.nextInt(2);
			m = (short) r.nextInt(101);
			n = (short) r.nextInt(101);
			if(p == 1) {
				s = '+';
			}
			else {
				s = '-';
			}
			System.out.println((i+1) + ":" + m + s + n + "=");
		}
	}
}
//初始模型建立时间：2019年11月6日20:45:50；
