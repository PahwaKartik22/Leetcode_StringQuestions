package medium;

public class LongestSubstringWithoutRepeatingCharacters {

	 public int lengthOfLongestSubstring(String s) 
	    { 
	      int count=0;
	      
	      if ( s!="")
          { String check = "";
	    	  for (int i =0;i<s.length();i++)
	    	   { check = ""; int countercount=0;
	    		 for (int j =i; j<s.length(); j++)
	    	      {  String inside = "";
	    		     inside = inside + s.charAt(j);
	    		    if (!(check.contains(inside)))
	    	         { check = check + s.charAt(j); countercount++;}
	    		    else if (check.contains(inside))
	    		     { break;}
	    	      }
	    		 if (countercount>count)
	    		  { count = countercount;}
	    	   }
	      }
          
	        return count;
	    }
	
	

}
