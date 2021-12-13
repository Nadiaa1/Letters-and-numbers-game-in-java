import java.util.*;

class GenerateRandoms {
	
	
    public List<Integer> GenerateRandomNumbers() {
      Random rand = new Random();
      int upperbound = 60; //max number
      List<Integer> list=new ArrayList<Integer>();  
      for (int i=0 ; i < 10;i++){
      int int_random = rand.nextInt(upperbound); 
      list.add(int_random);
      }
      return list;
    }
    
    
    
    public ArrayList<Character> GenerateRandomLetters() {
    		char[] alphabet = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
    		        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
    		ArrayList<Character> carac = new ArrayList<Character>();
    	    ArrayList<Character> vowels = new ArrayList<Character>() {
                {
                    add('A');
                    add('E');
                    add('I');
                    add('O');
                    add('U');
                }
            };
    		char[] randomLetters = new char[10];
    		int vowelCount;
    		Random rand = new Random();
    		do {
    		    for (int i = 0; i < randomLetters.length; i++) {
    		        int r = rand.nextInt(alphabet.length);
    		        randomLetters[i] = alphabet[r];
    		    }
    		    vowelCount = 0;
    		    for (char actualChar: randomLetters) {
    		        if (vowels.contains(actualChar))
    		            vowelCount++;
    		    }
    		} while (vowelCount < 3);
    		for (char actualChar: randomLetters) {
    		    carac.add(actualChar);
    		}
    		return carac;
    	}
    	
    }