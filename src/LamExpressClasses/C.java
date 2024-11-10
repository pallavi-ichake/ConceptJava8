package LamExpressClasses;

import Interfacess.A;
import Interfacess.B;

public class C implements A,B {

	public void parentInterfcae() {
		System.out.println("Parent implemntaion");
	}

	public static void main(String[] args) {
		C c = new C();
		c.parentInterfcae();

	}

}
