package org.pushpmx.problem;

public class QuarticProblem extends FloatSymbolicRegression {

	@Override
	protected double evaluateFunction(double x) {
		return x * x * x * x + 
				x * x * x + 
				x * x + 
				x;
	}

}
