package chapter9;

import java.util.ArrayList;

public class ComputerTest {
	public static void main(String[] args) {
		//Computer c1 = new Computer();
		Desktop c2 = new Desktop();
		//Computer c2 = new Desktop();
		//c2.keyboard();
		//Notebook c3 = new Notebook();
		Tablet c3 = new Tablet();
		//Computer c3 = new Tablet();
		//c3.keyboard();
		
		ArrayList<Computer> computers = new ArrayList<Computer>();
		computers.add(c2);
		computers.add(c3);
		
		for(Computer c : computers) {
			if (c instanceof Notebook) {
				Notebook nc = (Notebook)c;
				nc.webcam();
			}
			c.keyboard();
		}
	}
}
