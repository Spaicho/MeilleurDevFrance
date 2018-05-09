package mdf;

import java.util.*;

public class Bataille {
public static void main( String[] argv ) throws Exception {
		String  line;
		Scanner sc = new Scanner(System.in);
	
		
		int n = 0;
		if(sc.hasNextLine())
		    n=Integer.parseInt(sc.nextLine());
		
		int[] combatant = new int[n];
		Map<Integer,List<Integer>> g = new HashMap<Integer,List<Integer>>();

		
		int ind = 0;
			//while(sc.hasNextLine()) {
			//    line = sc.nextLine();
			//    IsoContestBase.localEcho("line:"+line);
		    //}
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			//IsoContestBase.localEcho("line:"+line);
			String[] ss = line.split("\\s+");
			
			List<Integer> l = new ArrayList<Integer>();
			//IsoContestBase.localEcho("ss0:"+ss[0]);
			combatant[ind]=Integer.parseInt(ss[0]);
			
			for(int i=1;i<ss.length;i++){
			    //IsoContestBase.localEcho("ss"+i+":"+ss[i]);
			     l.add(Integer.parseInt(ss[i]));
			}
            g.put(ind,l);
			ind++;
		}
		
		int max = 0;
		
		
		for(int i= 0;i<n;i++){
		    Queue<Integer> q = new LinkedList<Integer>();
		    boolean[] visited = new boolean[n];
		    int allCombat = combatant[i];
		    q.add(i);
		    
		    while(!q.isEmpty()){
		        int x =  q.poll();
		        List<Integer> gg = g.get(x);
		        if(gg!=null){
		           for(int j : g.get(x)){
    		            if(! visited[j]==true){
    		                q.add(j);
    		                allCombat += combatant[j];
    		                visited[j]=true;
    		            }
		            } 
		        }
		        
		    }
		    max = max < allCombat ? allCombat : max;
		}
		
		System.out.println(max);
		
	}
}
