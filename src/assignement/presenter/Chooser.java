package assignement.presenter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Chooser {
	
	private List<String> _candidates;

	public Chooser(String...candidates) {
		_candidates = Arrays.asList(candidates);
	}

	public String choose() {
		if (_candidates.isEmpty()) {
			return null;
		}
		
		int result = new Random().nextInt(_candidates.size());
		return _candidates.get(result);
	}

}
