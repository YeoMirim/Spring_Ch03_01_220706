package com.mirim.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator myCal = new MyCalculator(); // ����
		
		myCal.setNum1(20);
		myCal.setNum2(10);
		
/*
		Calculator cal1 = new Calculator(); 
		myCal.setCal(cal1); // �ʱ�ȭ
*/		
		myCal.setCal(new Calculator());
		
		
		myCal.add();
		myCal.sub();
		myCal.mul();
		myCal.div();
		
	}

}
