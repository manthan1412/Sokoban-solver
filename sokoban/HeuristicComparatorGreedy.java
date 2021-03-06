package sokoban;

import java.util.Comparator;

public class HeuristicComparatorGreedy implements Comparator<GameState> {
	
	@Override
	public int compare(GameState state0, GameState state1) {
		Integer costDiff = state0.getHeuristic() - state1.getHeuristic();
		return costDiff;
	}

}
