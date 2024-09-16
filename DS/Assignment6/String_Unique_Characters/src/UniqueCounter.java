/** 
 * This class is responsible to find unique characters in a given String 
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Amit
 *
 */
public class UniqueCounter {
	
	/** cache is a hashMap which maps the string with number of unique
	 * characters in that String */
	private static Map<String, Integer> cache = new HashMap<String, Integer>();
	
	
	/** This method counts number of unique characters in a given input string
	 * 
	 * @param inputString : string in which number of unique characters are to be counted
	 * @return number of unique characters in the inputString
	 */
	public Integer countUniqueCharacters(String inputString) {
		
		/* condition to check whether the input string is null or not */
		if(inputString == null) 
			return -1;
		
		/* condition to check whether the input string is blank or not */
		else if(inputString.length() == 0)
			return 0;
		
		/** characterSet will hold unique characters of the given string */
		Set<Character> characterSet = new HashSet<Character>();
		
		/* condition to check whether the given string is already in the cache or not.
		 * and if string is already exits then number of unique characters in that string
		 * is directly returned */
		if(cache.containsKey(inputString)) {
			return cache.get(inputString);
		}
		else {
			/* input string is converted into a character array */
			char[] charArray = inputString.toCharArray();
			
			/* character array is traversed using for each loop
			 * and characters are added to characterSet (Repeated characters
			 * will not be stored)
			 */
			for(char c : charArray)
				characterSet.add(c);
			
			/* Size contains size of the characterSet 
			 * i.e. the number of unique characters in the inputString */
			int size = characterSet.size();
			
			/* the input string and number of unique characters in it are put to hashMap cache */
			cache.put(inputString, size);
			
			/* size of characterSet is returned as number of unique characters */
			return size;
		}
	}
}
