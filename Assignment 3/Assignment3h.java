public class Assignment3h {
	public static void main(String[] args) {
		int spCharCount = 0;    
        String str = "M@#NInr#N@#(*NnKU#%)";    
        str = str.toLowerCase();    
        for(int i = 0; i < str.length(); i++)
        {    
            if((str.charAt(i) >=32 && str.charAt(i) <= 47) || (str.charAt(i) >=58 && str.charAt(i) <= 64) || (str.charAt(i) >=91 && str.charAt(i) <= 96) || (str.charAt(i) >=123 && str.charAt(i) <= 126))     
            	spCharCount++;               
        }    
        System.out.println("The number of special characters are : " + spCharCount);    
	}
}
