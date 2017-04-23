import java.util.Comparator;


public class VowelComparator implements Comparator <String> {

	@Override
	public int compare(String device1, String device2) {
		int  c1 = GetAmountOfVowels(device1);
		int  c2 = GetAmountOfVowels(device2);
		return c1-(c2);
	

	}
	public  int GetAmountOfVowels(String s)
	{
		s = s.toLowerCase();
		int vowelCount = 0;
		for (int i = 0; i < s.length(); ++i) {
		    switch(s.charAt(i)) {
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		            vowelCount++;
		            break;
		        default:
		            // do nothing
		    }
		}	
	return vowelCount;
	}	
}

