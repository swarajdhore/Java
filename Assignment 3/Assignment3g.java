public class Assignment3g {
	public static void main(String[] args) {
		int vowelCount = 0, consonantCount = 0;    
        String str = "My name is Swaraj";    
        str = str.toLowerCase();    
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')     
                vowelCount++;       
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
                consonantCount++;        
        }    
        System.out.println("The number of vowels are : " + vowelCount);    
        System.out.println("The number of consonants are : " + consonantCount);
	}
}
