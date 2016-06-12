package assignement.presenter;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PresenterTest extends Starter {

	@Test
	public void singleCandidates() {
		String result = new Chooser("Mattia").choose();
		assertEquals("Mattia", result);
	}
	
	@Test
	public void multipleCandidates() {
		String[] candidates = {"Dario", "Mattia"};
		String result = new Chooser(candidates).choose();
		assertTrue(Arrays.asList(candidates).contains(result));
	}	
	
	@Test
	public void noCandidates() {
		String result = new Chooser().choose();
		assertEquals(null, result);
	}	

}
