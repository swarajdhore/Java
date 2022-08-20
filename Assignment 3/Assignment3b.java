public class Assignment3b {
	public static void main(String[] args) {
		String s1="Think Twice";
		String s2="";
		
		String a[]=s1.split(" ");
		int size = a.length;
		for(int j=0;j<size;j++)
		{
			for(int i=a[j].length()-1;i>=0;i--)
			{
				s2=s2+a[j].charAt(i);
			}
			s2=s2+" ";
		}
		System.out.println(s2.toLowerCase());
	}
}
