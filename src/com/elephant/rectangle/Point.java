package com.elephant.rectangle;		//rectangle���Σ�

public class Point {	//������
	double x, y;	//��Ա��������
	public Point (double x, double y) {
		/*this��ʾÿ��ʵ������ָ���Լ������ã�����Գ�����ʵ������(��static���εĳ�Ա����)�͹��췽����*/
		/*this����ʵ��������������ͨ��this������ʵ������ĳ�Ա��������ó�Ա����*/
		this.x = x; this.y=y;	//ͨ��this���ʳ�Ա����
	}
	
	/*���ʼ��������һ��ԭ��ʵ��*/
	/*static����������ĳ�Ա��������Ϊ����������Ա��������Ϊ�෽������*/
	//�������java����ϵͳΪ����乫���Ĵ洢�ռ䣬�����ÿ��ʵ��������ͬһ������Ĵ洢�ռ䡣
	public static Point origin=new Point(0,0);	
	
	//��+������õ��������ַ���
	public String toString(){
		//return�������ǿ�н�������ִ�еķ��������ص����÷�����λ�ã�����ִ�к������䡣
		return "(" + x +"," +y+")";
	}
	
	//��������x,yֵ
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
}
