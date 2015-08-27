public class Validation {
	
	/** Method to validate name of ant entity 
	 * 
	 * @param name : name to validate
	 * @return : true if name is validated, false otherwise
	 */
	public static boolean isName(String name) 
	{
	    char[] chars = name.toCharArray();

	    for (char c : chars) 
	    {
	        if(!(Character.isLetter(c)) && !(c == ' ')) 
	            return false;
	    }
	    return true;
	}
}
