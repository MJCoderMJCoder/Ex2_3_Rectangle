package com.elephant.test;
import com.elephant.rectangle.Point;
import com.elephant.rectangle.Rectangle;	//�õ���ͬ���е���ʱ����Ҫ��import������롣

public class TestMain {
	public static void main(String[] args) {
		Point p1=new Point(-1,-1);
		Point p2=new Point(2,3);
		System.out.println("p1�����꣺"+ p1.toString());
		System.out.println("p2�����꣺"+ p2.toString());
		Rectangle r=new Rectangle(p1,p2);
		System.out.println("���ε��ܳ���"+r.getCircumference());
		System.out.println("���ε������"+r.getArea());
		System.out.println("���εĶԽ��߳���"+r.getDiagnal());
		if(r.isInner(Point.origin))
			System.out.println("ԭ���ھ�����");
		Point p3 =new Point(-1.5, -1.5);
		if(r.isInner(p3))
			System.out.println(p3.toString()+"�ھ�����");
		else
			System.out.println(p3.toString()+"���ھ�����");
	}

}
