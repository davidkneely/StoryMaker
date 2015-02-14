import java.security.SecureRandom;

/**
 * Creates stories procedurally.
 * @author David Neely
 * Cited Sources: PlotLines come from Kurt Vonnegut's "Shapes of Stories."
 * http://mayaeilam.com/2012/01/01/the-shapes-of-stories-a-kurt-vonnegut-infographic/
 */
public class StoryMaker {

	/**
	 * Creates story procedurally.
	 * @param args The arguments. Not implemented.
	 */
	public static void main(String[] args) {

		System.out.println("Random from Characters: " + randomEnum(Characters.class));
		System.out.println("Random from CharacterNames: " + randomEnum(CharacterNames.class));
		System.out.println("Random from Locations: " + randomEnum(Locations.class));
		System.out.println("Random from PlotLines: " + randomEnum(PlotLines.class));
		System.out.println("Random from Antagonists: " + randomEnum(Antagonists.class));
		System.out.println("Random from Conflicts: " + randomEnum(Conflicts.class));
		System.out.println("Random from Props: " + randomEnum(Props.class));

		// prints out the random story
	}
	
	public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
	private static final SecureRandom random = new SecureRandom();
	
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
	public enum Antagonists {
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