/*
  Write a program to print
	1 1 1 1
	2 2 2 2
	3 3 3 3
	4 4 4 4
*/

public class Assignment1b {
	public static void main(String[] args) {
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=4;col++)
			{
				System.out.print(col + " ");
			}
			System.out.print("\n");
		}
	}
}

/*

Output: 
 
1 1 1 1 
2 2 2 2 
3 3 3 3 
4 4 4 4 

*/
