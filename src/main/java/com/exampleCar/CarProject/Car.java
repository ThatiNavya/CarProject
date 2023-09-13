package com.exampleCar.CarProject;

public class Car {
	private DieselEngine dieselEngine;

	public DieselEngine getDieselEngine() {
		return dieselEngine;
	}

	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;
	}

	public Car() {
		System.out.println("Car Constructor Called");
	}

	public void drive() {
		int result = dieselEngine.start();
		if (result >= 1) {
			System.out.println("Journy Started Successfully");
		} else {
			System.out.println("Engine has some problem");

		}
	}

}
