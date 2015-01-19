package Triangle;

/**
 * Author: Abhijit Shanbhag
 */


import java.io.IOException;
import java.net.URL;
import java.util.*;

public class TriangleYodle {
	
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://www.yodlecareers.com/puzzles/triangle.txt");
		Scanner sc = new Scanner(url.openStream());
		int n =100;
		int size = n * (n+1) /2;
		
		int[] ipTriangle = new int[size];
		int i=0;
		
		while(sc.hasNextInt())
		{
			ipTriangle[i++]=sc.nextInt();
		}

		int row = 100;
		while(row > 1)
		{
			int currIndex = row * (row - 1)/ 2;
			int prevRowIndex = (row-1) * (row-2)/2;
			for(int j=currIndex;j< (currIndex+row-1); j++)
			{
				
				if(ipTriangle[j]>=ipTriangle[j+1]){
					ipTriangle[prevRowIndex++]+=ipTriangle[j];
					
				}
				else{
					ipTriangle[prevRowIndex++]+=ipTriangle[j+1];
				}
				
			}
			
			row--;
			
		}
		System.out.println(ipTriangle[0]);
	}

}
