package com.elephant.rectangle;

public class Rectangle {
	Point point1, point2;	//��������
	
	/*���캯��֮һ���������������о���ĳ�ʼ��*/
	public Rectangle (Point p1, Point p2) {
		this.point1 =new Point(p1.getX(), p1.getY());	//new��������ڴ���һ�����ʵ�������ض��������
		this.point2 =new Point(p2.getX(), p2.getY());
	}
	
	/*���캯��֮����������������ֵ���о���ĳ�ʼ��*/
	public Rectangle(double x1, double y1, double x2, double y2) {
		this.point1 = new Point(x1, y1);	//��������new��
		this.point2 = new Point(x2, y2);
	}
	
	/*������ε��ܳ�*/
	public double getCircumference() {
		return 2* Math.abs(point1.getX() - point2.getX())
				+2*Math.abs(point1.getY() - point2.getY());
	}
	/*������ε����*/
	public double getArea() {
		return Math.abs(point1.getX() - point2.getX())
				*Math.abs(point1.getY() - point2.getY());
	}
	/*������εĶԽ��߳�*/
	public double getDiagnal() {
		double width=Math.abs(point1.getX() - point2.getX());
		double height=Math.abs(point1.getY() - point2.getY());
		return Math.sqrt(width*width+height*height);	//square root��ƽ����
	}
	/*�ж�һ��������Ƿ��ھ���֮��*/
	public Boolean isInner(Point p){
		if((Math.min(point1.getX(), point2.getX()) <= p.getX())
			&& (p.getX() <= Math.max(point1.getX(), point2.getX()))
			&& (Math.min(point1.getY(), point2.getY()) <= p.getY())
			&& (p.getY() <= Math.max(point1.getY(), point2.getY())))
			return true;
		else
			return false;
	}
}
