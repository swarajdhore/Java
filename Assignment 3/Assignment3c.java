import java.util.Arrays;

public class Assignment3c {
	public static void main(String[] args) {
		char str1[] = { 'o', 'r', 'a', 'n','g','e','s' };
        char str2[] = { 'r', 'a', 'o', 'e', 's', 'n', 'g' };
		int n1 = str1.length;
        int n2 = str2.length;
 
        if (n1 != n2)
        {
            System.out.println("The two string are not anagram");
            System.exit(0);
        }
        
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
            {
            	System.out.println("The two string are not anagram");
        		System.exit(0);
            }
        
        System.out.println("The two string are anagram");
	}
}
