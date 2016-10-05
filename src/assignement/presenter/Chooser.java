package assignement.presenter;

import java.util.List;
import java.util.Random;

public class Chooser {
	
	private List<String> _candidates;
	private Random _strategy;

	public Chooser(List<String> candidates) {
		_candidates = candidates;
		_strategy = new Random();
	}

	public String choose() {
		if (_candidates.isEmpty()) {
			return null;
		}
		
		int result = _strategy.nextInt(_candidates.size());
		return _candidates.get(result);
	}

}
