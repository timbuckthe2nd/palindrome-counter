public class PalindromeCounter
{

	public static int countSubstrings(String s) 
	{
	   int pCount = 0;
	   for (int i = 0; i < s.length(); i++) 
	   {
	      pCount += countPalindromes(s, i, i);
	      pCount += countPalindromes(s, i, i + 1);
	   }
	    return pCount;
	}
	
	private static int countPalindromes(String s, int left, int right) 
	{
		int count = 0;
		while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++))
			count++;
		return count;
	}
	  
	public static void main(String[] args)
	{
		System.out.println("Total Palindromes including single letters:" + countSubstrings("abccba"));
	}
}
