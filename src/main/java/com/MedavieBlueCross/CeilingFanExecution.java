package main.java.com.MedavieBlueCross;

import java.util.Scanner;

public class CeilingFanExecution {
	private int currentSpeed;
	private FanDirection currentDirection;

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public FanDirection getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(FanDirection currentDirection) {
		this.currentDirection = currentDirection;
	}

	public CeilingFanExecution() {
		this.currentSpeed = 0;
		this.currentDirection = FanDirection.FORWARD;
	}

	public void pullFirstCord() {
		if (currentSpeed == 3) {
			currentSpeed = 0;
		} else {
			currentSpeed++;
		}

	}

	public void pullSecondCord() {
		if (currentDirection == FanDirection.FORWARD) {
			currentDirection = FanDirection.BACKWARD;
		} else if (currentDirection == FanDirection.BACKWARD) {
			currentDirection = FanDirection.FORWARD;
		}

	}

	public void selectInput() {
		int input = 0;
		while (input != 1 && input != 2) {
			System.out.println("Which chord you want to pull, 1 or 2?");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			if (input == 1) {
				pullFirstCord();
			} else if (input == 2) {
				pullSecondCord();
			} else {
				System.out.println("Pull valid chord");
			}
		}

	}

}
