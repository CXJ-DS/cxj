package ʵ��һ;//�������ֵ�����д��棬ÿһ�����ж������µ������ɣ�

import java.util.Random;//������������������ѡȡ����;

public class Iteration_0 {
	public static void main(String[] args) {
		short m = 0,n = 0,p = 0;//�����뱻�����ĳ�ʼ�����Լ��ж�ֵ�ó�ʼ����
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
//��ʼģ�ͽ���ʱ�䣺2019��11��6��20:45:50��
