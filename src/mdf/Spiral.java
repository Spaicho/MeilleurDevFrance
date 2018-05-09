/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 *  IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 * ***/
package mdf;
import java.util.*;

public class Spiral {
public static void main( String[] argv ) throws Exception {
		String  line;
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if(sc.hasNextInt()) {
			n = sc.nextInt();
		}
		
		char[][] s = new char[n][n];
		
		int x = n/2;
		int y = n/2;
		s[x][y] = '#';
		boolean continuer = true;
		
		for(int i =0; continuer ;i++){
		    if(i%4==0){
		        for(int j =0;j<1+i;j++){
		            y--;
		            if(y<0 || y>=n){
		                continuer=false;
		                break;
		            } else
		                
		            s[x][y]='#';
		        }
		    }
		    if(i%4==1){
		        for(int j =0;j<1+i;j++){
		            x++;
		            if(x<0 || x>=n){
		                continuer=false;
		                break;
		            } else
		            s[x][y]='#';
		        }
		    }
		    if(i%4==2){
		        for(int j =0;j<1+i;j++){
		            y++;
		            if(y<0 || y>=n){
		               continuer=false;
		                break;
		            } else
		            s[x][y]='#';
		        }
		    }
		    if(i%4==3){
		        for(int j =0;j<1+i;j++){
		            x--;
		            if(x<0 || x>=n){
		                continuer=false;
		                break;
		            } else
		            s[x][y]='#';
		        }
		    }
		}
		for (int i = 0;i<n;i++){
		    String sss = "";
		    for (int j = 0;j<n;j++)
		        sss = s[i][j] == '#' ? sss + s[i][j] : sss+ '=';
		    System.out.println(sss);
		}
		        
		
	}
}