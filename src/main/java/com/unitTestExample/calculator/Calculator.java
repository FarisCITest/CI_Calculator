package com.unitTestExample.calculator;

public class Calculator {

	public int sum(int a, int b) {
             int result = a+b;
		return result;
	}

	public int minus(int a, int b) {
              int result = a+b; // ERROR HERE !
		return result;  // ERROR!!!
	}

	public int divide(int a, int b) {
              int result = a / b;
		return result;
	}

	public int multiply(int a, int b) {
           int result = a * b;
		return result;
	}

}
