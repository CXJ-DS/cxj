package ʵ��һ;//ʵ�����ݵ���������������������ֵ��ʵ�ֵ�ʽ����ֵ�Ķ��룬��ʱδ�����ظ��ĵ�ʽ��

import java.util.Random;

public class Iteration_1 {
	public static void main(String[] args) {
		printHeader();
		generationEquations();//��������������ʽ����
	}
	static void printHeader() {
		System.out.println("һ��������ʮ���Ӽ��⣺");
	}
	static void generationEquations() {
		int m = 0, n = 0, p = 0;//�����뱻������ʼ��
		int[] arry= new int[50];//��������ʼ��
		int[] crry= new int[50];
		int[] drry= new int[50];
		char[] brry = new char[50];//�����ʽ��ʼ��
		char s = '+';//������ų�ʼ��
		Random r = new Random();//�������
		for(int i = 0;i < 50; i++ ) {//����ǿ��ת��
			do {//ʵ���������ֵΪ����
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
		Iteration_1.printExercise(arry);//���ý�����飻
	}
	static void printEquation(char[] brry,int[] crry,int[] drry) {
		int j,k = 1;
		for(j = 0;j < 50;j++) {
			System.out.print("(" + (j+1) + "):" + crry[j] + brry[j] + drry[j] + "=__________\t");//�����������ʽ
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
		for(i = 0;i < 50; i++) {//������������
			System.out.print("(" + (i+1) + "):" + arry[i] + "\t");
			if(p % 5 == 0) {
				System.out.println();
			}
			p++;
		}
	}
	static void printBody() {
		System.out.println("������ʮ���Ӽ�������£�");
	}
}
//����ʱ��2019��11��7��12:51:04

