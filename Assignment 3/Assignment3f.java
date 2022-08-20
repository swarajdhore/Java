public class Assignment3f {
	public static void main(String[] args) {
		String str="lunch";
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) 
		{
			for (int j = 0; j < chars.length; j++) 
			{
				if (chars[j] > chars[i]) 
				{
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		System.out.println("The string after sorting will be : ");
		for (int i = 0; i < chars.length; i++) 
			System.out.print(chars[i]);
	}
}
