public class Assignment3e {
	public static void main(String[] args) {
		 String str = "swaraj";
	      char[] charArray = str.toCharArray();
	      System.out.print("Repeating Characters in the string are: ");
	      for (int i = 0; i < str.length(); i++) 
	         for (int j = i + 1; j < str.length(); j++) 
	            if (charArray[i] == charArray[j]) 
	            {
	               System.out.print(charArray[j] + " ");
	               break;
	            }
	}
}
