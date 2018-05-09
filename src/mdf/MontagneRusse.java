package mdf;

import java.util.*;

public class MontagneRusse {
public static void main( String[] argv ) throws Exception {
		String  line;
		int n = 0;
		ArrayList<Integer> h = new ArrayList<>();
		
		n = 4;
		int[] hh = new int[]{10, 30, 20, 40};
		
		for(int i =0;i<hh.length;i++)
			h.add(hh[i]);
		
		//Scanner sc = new Scanner(System.in);
		
//		if(sc.hasNextLine())
//		    n = Integer.parseInt(sc.nextLine());
//		while(sc.hasNextLine()) {
//			line = sc.nextLine();
//			/* Lisez les données et effectuez votre traitement */
//			h.add(Integer.parseInt(line));
//		    
//		}
		
		Collections.sort(h);
		
		for(int i = 0; i<(h.size()/2);i++){
		    
		    System.out.print(h.get(h.size()-i-1));
		    System.out.print(" ");
		    System.out.print(h.get(i));
		    System.out.print(" ");
		    
		}
		if((h.size()%2)!=0)
		    System.out.print(h.get((h.size()/2)+1));
		
	/* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
	}
}
