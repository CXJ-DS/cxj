package 实验一;//实现数据的正整数输出，随机生成数值，实现等式与数值的对齐，暂时未发现重复的等式；

import java.util.Random;

public class Iteration_1 {
	public static void main(String[] args) {
		printHeader();
		generationEquations();//调用运行生成算式函数
	}
	static void printHeader() {
		System.out.println("一、计算五十道加减题：");
	}
	static void generationEquations() {
		int m = 0, n = 0, p = 0;//除数与被除数初始化
		int[] arry= new int[50];//运算结果初始化
		int[] crry= new int[50];
		int[] drry= new int[50];
		char[] brry = new char[50];//运算等式初始化
		char s = '+';//运算符号初始化
		Random r = new Random();//随机函数
		for(int i = 0;i < 50; i++ ) {//类型强制转换
			do {//实现输出的数值为整数
				p = r.nextInt(2);
				m = r.nextInt(100) + 1;
				n = r.nextInt(100) + 1;
				if(p == 1) {
					s = '+';
					arry[i] = m + n;
				}
				else {
					s = '-';
					arry[i] = m - n;
				}
			}while(arry[i] < 0 || arry[i] > 100);
			brry[i] = s;
			crry[i] = m;
			drry[i] = n;
		}
		Iteration_1.printEquation(brry, crry ,drry);
		Iteration_1.printExercise(arry);//调用结果数组；
	}
	static void printEquation(char[] brry,int[] crry,int[] drry) {
		int j,k = 1;
		for(j = 0;j < 50;j++) {
			System.out.print("(" + (j+1) + "):" + crry[j] + brry[j] + drry[j] + "=__________\t");//输出生出的算式
			if(k % 5 == 0) {
				System.out.println();
			}
			k++;
		}
		System.out.println();
	}
	static void printExercise(int arry[]) {
		int i,p = 1;
		printBody();
		for(i = 0;i < 50; i++) {//结果数组输出；
			System.out.print("(" + (i+1) + "):" + arry[i] + "\t");
			if(p % 5 == 0) {
				System.out.println();
			}
			p++;
		}
	}
	static void printBody() {
		System.out.println("计算五十道加减题答案如下：");
	}
}
//创建时间2019年11月7日12:51:04

