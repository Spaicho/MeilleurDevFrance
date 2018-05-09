/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 *  IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 * ***/
package mdf;
import java.util.*;

public class IsoContest {
    public static class Coord {
        public int x;
        public int y;
        
        //Both override are Always necessary for custom object when used in set to avoid duplicate
        @Override
        public boolean equals(Object o){
            return ((Coord)o).x == x && ((Coord)o).y == y;
        }
        @Override
        public int hashCode() {
            return x | (y << 15);
        }
        
        @Override
        public String toString() {
          return x + ","+y;
        }
        public Coord (int x, int y){
            this.x = x; 
            this.y = y;
        }
        public Coord (){
            this.x = -1; 
            this.y = -1;
        }
    }

public static void main( String[] argv ) throws Exception {
		String  line;
		Scanner sc = new Scanner(System.in);

		int h = 0;
		int l = 0;
		
		
//		if(sc.hasNextLine()) {
//			line = sc.nextLine();
//			h = Integer.parseInt(line);
//		}
//		
//		if(sc.hasNextLine()) {
//			line = sc.nextLine();
//			l = Integer.parseInt(line);
//		}
		h = 4;
		l = 5;
		char[][] g = new char[h][l];
		
		//while(sc.hasNextLine()) {
		List<String> ll = new ArrayList<String>();
		ll.add("..*..");
		ll.add(".*.*.");
		ll.add("*.x.*");
		ll.add(".*.*.");
		//ll.add("..*..");
		int m = 0;
		for(String s : ll){

			//line = sc.nextLine();
			char[] charArray = s.toCharArray();
			for(int i =0;i<charArray.length;i++)
		    	g[m][i] = charArray[i];
		    m++;

		}
		
		
	    Coord c = new Coord(); 
	    
		for(int i=0;i<h;i++){
		    for(int j=0;j<l;j++){
		        System.out.print(g[i][j]);
		        if(g[i][j]=='x'){
		            c.y = i; c.x = j;
		            //break;
		        }
		    }
		    System.out.println();
		}
		
		Set<Coord> s = new HashSet<Coord>();
		Queue<Coord> q = new LinkedList<Coord>();
		q.add(c);
		s.add(c);
		
		while(! q.isEmpty()){
		    Coord p = q.poll();
		    
		    for(int i = -1; i<2;i++){
		        for(int j = -1; j<2;j++){
		        	if(i == 0 || j == 0){
		        		
			            int xx = p.x + j; 
			            int yy = p.y + i; 
			            
			        	if(xx >=0 && xx <l){
	        		        if(yy >= 0 && yy <h){
	        		            Coord pp = new Coord(xx, yy);
	        		            if(! s.contains(pp)){
	        		                if(g[yy][xx]!='*'){
	                                    s.add(pp); q.add(pp);
	        		                }
	        		            }
	        		        }
	        		    }
		        	}
		        }
		    }
		}
		
		System.out.println(s.size());
		
	}
}