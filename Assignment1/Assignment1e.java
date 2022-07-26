public class Assignment1e {
	public static void main(String[] args) {
		int n=14;
		for(int row=0; row<n; row++) 
		{
			for(int col=0; col<n; col++) 
			{
				if(row==0 || col==0 || row+col<=(n/2)-1 || row-col>=(n/2)-1 || row==n-1 ) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}


/*
Output:

************** 
******         
*****          
****           
***            
**             
*              
**             
***            
****           
*****          
******         
*******        
************** 

*/