package com.elephant.rectangle;		//rectangle矩形；

public class Point {	//类声明
	double x, y;	//成员变量声明
	public Point (double x, double y) {
		/*this表示每个实例对象指向自己的引用，其可以出现在实例方法(非static修饰的成员方法)和构造方法中*/
		/*this代表实例对象自身，可以通过this来访问实例对象的成员变量或调用成员方法*/
		this.x = x; this.y=y;	//通过this访问成员变量
	}
	
	/*类初始化，创建一个原点实例*/
	/*static用来修饰类的成员变量（称为类变量）或成员方法（称为类方法），*/
	//类变量，java运行系统为其分配公共的存储空间，该类的每个实例对象共享同一类变量的存储空间。
	public static Point origin=new Point(0,0);	
	
	//用+运算符得到坐标点的字符串
	public String toString(){
		//return语句用于强行结束正在执行的方法，返回到调用方法的位置，继续执行后面的语句。
		return "(" + x +"," +y+")";
	}
	
	//获得坐标的x,y值
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
}
