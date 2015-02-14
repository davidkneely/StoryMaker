import java.security.SecureRandom;

/**
 * Creates story procedurally.
 * @author David Neely
 * Cited Sources: PlotLines come from Kurt Vonnegut's "Shapes of Stories."
 * http://mayaeilam.com/2012/01/01/the-shapes-of-stories-a-kurt-vonnegut-infographic/
 */
public class StoryMaker {
	
	private static String PROJECT_NAME = "StoryMaker";
	private static double PROJECT_VERSION = 0.01;

	/**
	 * Creates story procedurally.
	 * @param args The arguments. Not implemented.
	 */
	public static void main(String[] args) {
		
		String title = randomEnum(Props.class).name();
		String character = randomEnum(CharacterNames.class).name();
		String location = randomEnum(Locations.class).name();
		String plotLine = randomEnum(PlotLines.class).name();
		String antagnoist = randomEnum(Antagonists.class).name();
		String conflict = randomEnum(Conflicts.class).name();
		String prop = randomEnum(Props.class).name();
		
		// Prints out the title
		String formattedTitle = "The " + title;
		//formattedTitle = formattedTitle.toUpperCase();
		formattedTitle = "'" + formattedTitle + "'";
		System.out.println(formattedTitle + " \nby " + 
					PROJECT_NAME + " version " + 
					PROJECT_VERSION + "\n");

		// Prints out the story
		System.out.println(character + " was in " + location + ". " + 
				antagnoist + " was a " + prop + ". " + character + 
				" was stuck in a classic game of " + 
				plotLine + ". The only way to win was to get " + 
				conflict + ".");

	}
	
	/**
	 * Picks random value from Enumeration.
	 * @param clazz The Enumeration.
	 * @return The random value of the Enumeration.
	 */
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
		// Begin Scandinavian names
		Henrik, 
		Alexander,
		Aksel, 
		Alarik, 
		Albert, 
		Algot, 
		Alicia, 
		Alvis, 
		Amalia, 
		Amma, 
		Amund, 
		Anders, 
		Andor, 
		Anker,
		Annette, 
		Anneliese, 
		Anfrid, 
		Arna, 
		Arnbjorn, 
		Arne, 
		Asa, 
		Astrid, 
		Balder, 
		Barbro, 
		Barend, 
		Beatrix, 
		Benedikt, 
		Bernt, 
		Bente, 
		Bertil, 
		Birgit, 
		Bo, 
		Bjorn, 
		Broder, 
		Carl, 
		Carina, 
		Carole, 
		Caroline, 
		Caspar, 
		Cecilia, 
		Celia, 
		Charlotta, 
		Christa, 
		Claus, 
		Cornelia, 
		Dag, 
		Dagmar, 
		Dagna, 
		Dania, 
		Diedreik, 
		Disa, 
		Dorothea, 
		Ebba, 
		Edda, 
		Edith, 
		Yvonne, 
		Edmond, 
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
		Hawaii,
		SanFrancisco,
		London,
		NewYork,
		Japan,
		Iceland,
		Kaimuki,
		Moiliili,
		Manoa,
		Haleiwa,
		NorthShore,
		Kahala,
		AlaMoana,
		TheBar,
		TheBathroom,
		TheKitchen,
		TheGarage,
		TheStudio,
		TheBakery,
		Zippys,
		HataRestaurant,
		Gyukaku,
		Waianae,
		Wahiwa,
		Waikiki,
		NiuValley,
		Palolo,
		Jail,
		School,
		TheSushiBar,
		GenkiSushi,
		TheGlassBlowingStudio,
		TheDoctorsOffice,
		TheMajorsOffice,
		ThePrincipalsOffice,
		DeepUnderWater,
		UpInTheAir,
		TheDumpster,
		BehindTheSevenEleven,
		TheBottomOfThePool
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
	private enum Antagonists {
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
	private enum Conflicts {
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
	private enum Props {
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
		Book,
		Bible,
		Hook,
		Bottle,
		Keyboard,
		Stapler,
		Headphones,
		Club,
		WaterBottle,
		CanOfMace,
		Mouse,
		Pen,
		Brain,
		TrashBag,
		Pistol,
		CanOfSprayPaint,
		FeatherDuster,
		CanOfTomatoSoup,
		Hammer,
		Chisel,
		PickAxe
	}

}

/*
 * TODOS:
 * Specify genders for Characters to write out correct pronouns.
 * Determine how to link concepts of actions with subjects.
 * Enumerate verbs.
 * Enumerate nouns.
 * Enumerate adjectives.
 * Enumerate adverbs.
 */