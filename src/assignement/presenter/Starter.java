package assignement.presenter;

import java.io.FileNotFoundException;

public class Starter {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 0) {
			System.out.println("at least one candidate should be passed");
			System.out.println("e.g. mattia dario stefano gennaro valentino vacca manlio enrico chicco ale matteo pino massi gabri");
			return;
		}
		System.out.println(new Chooser(args).choose());
	}

}
