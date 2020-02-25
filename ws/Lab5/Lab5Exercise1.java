package Lab5;

import java.util.Scanner;

public class Lab5Exercise1
 {

	public static void main(String[] args) {
		
		TrafficLight trafficLight=new TrafficLight();
		trafficLight.execute();

	}
	public void execute()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Choice Red, Yellow or Green");
		String choice=scan.next();
		System.out.println(display(choice));
	}

	public String display(String input)
	{
		String choice=input.toLowerCase();
		switch(choice)
		{
		case "red":
			return "stop";
		case "yellow":
			return "ready";
		case "green":
			return "go";
		default:
			return "Incorrect input";
			
		}
	}
}
