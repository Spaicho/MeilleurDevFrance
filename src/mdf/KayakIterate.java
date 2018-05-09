package mdf;
/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 *  IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 * ***/

import java.util.*;

public class KayakIterate {
public static void main( String[] argv ) throws Exception {
		String  line;
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if(sc.hasNextLine()) {
			line = sc.nextLine();
			n = Integer.parseInt(line);
		}
		char[][] grid = new char[n][n];
		int k = 0;
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			for(int i=0;i<line.length();i++){
			    grid[k][i] = line.charAt(i);
			}
			k++;
		}
		int[][] max = new int[n][n];
		char[][] from = new char[n][n];
		int count = 0;
		int maxx = 0;
		
		while(true){
		    for(int i=0;i<n;i++){
    		    int full = 0;
    		    int maxLeft = 0;
    		    int maxUp = 0;
    		    for(int j=0;j<n;j++){
    		        if(grid[i][j]=='X')
    		            full = 1;
    		        if(i>0)
    		            maxUp = max[i-1][j];
    		        if(j>0)
    		            maxLeft = max[i][j-1];
    		      
    		        from[i][j] = maxUp >= maxLeft ? 'i' : 'j';
    		        max[i][j] = Math.max(maxUp,maxLeft) + full;
    		    }
		    }
		    if(max[n-1][n-1]>0){
		        count++;
		        max= new int[n][n];
		        
		        int x =n-1;
		        int y =n-1;
		        while(x>=0 && y>=0){
		            grid[x][y]=' ';
		            if(from[x][y]=='i')
		                x = x-1;
		            if(from[x][y]=='j')
		                y = y-1;
		            
		        }
		        from= new char[n][n];

		    } else
		        break;
		}
		System.out.println(count);
		
		
	}
}