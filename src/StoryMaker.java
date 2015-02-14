import java.io.File;
import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Creates story procedurally.
 * @author David Neely
 * Cited Sources: PlotLines come from Kurt Vonnegut's "Shapes of Stories."
 * http://mayaeilam.com/2012/01/01/the-shapes-of-stories-a-kurt-vonnegut-infographic/
 */
public class StoryMaker {
	
	private static String PROJECT_NAME = "StoryMaker";
	private static double PROJECT_VERSION = 0.01;

  static ArrayList<String> nouns;
  static ArrayList<String> verbs;
  static ArrayList<String> adverbs;
  static ArrayList<String> adjectives;
  static ArrayList<String> props;
  static ArrayList<String> characterNames;
  static ArrayList<String> locations;
  static ArrayList<String> characters;
  static ArrayList<String> plotLines;
  static ArrayList<String> antagonists;
  static ArrayList<String> conflicts;
  static ArrayList<String> tenses;
  static ArrayList<String> pointsOfView;

	/**
	 * Creates story procedurally.
	 * @param args The arguments. Not implemented.
	 */
	public static void main(String[] args) {

    initWordBank();

    String title;
    String character;
    String plotLine;
    String antagnoist;
    String conflict;
    String prop;
    String location;

    title = getRandomElementFromList(props);
    character = getRandomElementFromList(characters);
    plotLine = getRandomElementFromList(plotLines);
    antagnoist = getRandomElementFromList(antagonists);
    conflict = getRandomElementFromList(conflicts);
    prop = getRandomElementFromList(props);
    location = getRandomElementFromList(locations);

    printTitle(title);
    printStory(character, location, plotLine, antagnoist, conflict, prop);
  }

  /**
   * Gets a random element from ArrayList.
   * @param inputArrayList The input ArrayList.
   * @return The random element in ArrayList.
   */
  private static String getRandomElementFromList(ArrayList<String> inputArrayList) {
    String returnString;
    Random randomGenerator = new Random();
    int index = randomGenerator.nextInt(inputArrayList.size());
    returnString = inputArrayList.get(index);
    return returnString;
  }

  /**
   * Initializes words from text files for use in the story.
   */
  private static void initWordBank() {
    nouns = importWordList("src/nounList.txt");
    verbs = importWordList("src/verbList.txt");
    adverbs = importWordList("src/adverbList.txt");
    adjectives = importWordList("src/adjectiveList.txt");
    props = importWordList("src/propList.txt");
    characterNames = importWordList("src/characterNameList.txt");
    locations = importWordList("src/locationList.txt");
    characters = importWordList("src/characterList.txt");
    plotLines = importWordList("src/plotLineList.txt");
    antagonists = importWordList("src/antagonistList.txt");
    conflicts = importWordList("src/conflictList.txt");
    tenses = importWordList("src/tenseList.txt");
    pointsOfView = importWordList("src/pointOfViewList.txt");

  }

  /**
   * Imports the word list.
   * @param inputFileName The name of the file that has the list of words.
   * @return An ArrayList of the imported words.
   */
  private static ArrayList<String> importWordList(String inputFileName) {

    ArrayList<String> list = null;
    try {
      Scanner s = new Scanner(new File(inputFileName)).useDelimiter("\n");
      list = new ArrayList<String>();
      while (s.hasNext()) {
        list.add(s.next());
      }
      s.close();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return list;
  }

  private static void printStory(String character, String location,
                                 String plotLine, String antagnoist,
                                 String conflict, String prop) {

		System.out.println(character + " was in " + location + ". " + 
				antagnoist + " was a " + prop + ". " + character + 
				" was stuck in a classic game of " + 
				plotLine + ". The only way to win was to get " + 
				conflict + ".");
	}

	private static void printTitle(String title) {

		String formattedTitle = "The " + title;
		formattedTitle = "'" + formattedTitle + "'";
		System.out.println(formattedTitle + " \nby " + 
					PROJECT_NAME + " version " + 
					PROJECT_VERSION + "\n");
	}

}

// Create list of sentence structures.

// Subject verb object.
// Subject adverb verb adjective noun.

/*
 * TODOS:
 * Research how to list out compound words as entries.
 * Specify genders for Characters to write out correct pronouns.
 * Determine how to link concepts of actions with subjects.
 * Create weighing system for each word that is chosen.
 * There should be a scoring system to tell where they story is going based on the variables that are chosen.
 */