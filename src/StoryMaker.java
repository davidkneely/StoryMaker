/**
 * Creates stories procedurally.
 * @author David Neely
 *
 */
public class StoryMaker {

	/**
	 * Creates story procedurally.
	 * @param args The arguments. Not implemented.
	 */
	public static void main(String[] args) {
		System.out.println("Starting StoryMaker.");
		// select random element from Characters
		// select random element from CharacterNames
		// select random element from Locations
		// select random element from PlotLines
		// select random element from Antagnoists
		// select random element from Conflicts
		// select random element from Props
		// prints out the random story
	}
	
	private enum Characters {
		Protagonist,
		Antagonist,
		Support,
		Extra
	}
	
	private enum CharacterNames {
		David,
		Jim,
		Jason,
		Carol,
		Andy,
		Watson,
		Sergei,
		Jill,
		Wendy,
		Jenny,
		Anna,
		Jessica,
		Henri,
		Sam,
		Henrik,
		Holly,
		Fred,
		Frank,
		Stan,
		Peggy,
		Don,
		Rodger,
		Burt
	}
	
	private enum Locations {
		Home,
		Hawaii,
		SanFrancisco,
		London,
		NewYork,
		Japan,
		Iceland
	}
	
	private enum PlotLines {
		ManInHole,
		BoyMeetsGirl,
		FromBadToWorse,
		WhichWayIsUp,
		CreationStory,
		OldTestament,
		NewTestament,
		Cinderalla
	}
	
	public enum Antagnoists {
		SelfEsteem,
		Government,
		Work,
		Life,
		Love,
		Health,
		Weather,
		Money,
		Power,
		Lover,
		Boss
	}
	
	public enum Conflicts {
		LostJob,
		Marooned,
		Ostracized,
		Immobailized,
		Diseased,
		Punished,
		Intoxicated,
		MentalHealth,
		HitByABus
	}
	
	public enum Props {
		CoffeeCup,
		Car,
		Plane,
		Bicycle,
		Bystander,
		Helicopter,
		Lighter,
		Gun,
		Knife,
		Stool,
		Computer,
		Book
	}
	
//	public enum Morals {
//		
//	}
}

/*
 * TODOS:
 * 
 */