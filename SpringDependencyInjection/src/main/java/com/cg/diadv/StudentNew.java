package com.cg.diadv;
//dependency in terms of object
//student class is dependent on mathcheat class
public class StudentNew {
	MathCheat math;
	//di using setters
	
	public void cheating() {
		math.mathcheat();
	}
	public void setMath(MathCheat math) {
		this.math = math;
	}

}
