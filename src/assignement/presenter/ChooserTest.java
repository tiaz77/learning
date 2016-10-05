package assignement.presenter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ChooserTest  {

	@Test
	public void singleCandidates() {
		String result = new Chooser(Arrays.asList("Mattia")).choose();
		assertEquals("Mattia", result);
	}
	
	@Test
	public void multipleCandidates() {
		List<String> candidates = Arrays.asList("Dario", "Mattia");
		String result = new Chooser(candidates).choose();
		assertTrue(Arrays.asList(candidates).contains(result));
	}	
	
	@Test
	public void noCandidates() {
		String result = new Chooser(new ArrayList<String>()).choose();
		assertEquals(null, result);
	}	

}
