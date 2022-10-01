package Academy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestOops {

	public static void main(String[] args) {
		
//		int i = 0;
//		
//		do {
//			System.out.println(i+1);
//			i++;
//		}
//		
//		while(i<30);
//		{
//			
//			System.out.println(i);
//			
//			//i--;
//			
//		}
		
		// TODO Auto-generated method stub

	/*	
		for (int i=1; i<5 ; i++)
		{
			System.out.println("====outer loop started======" +i);
			for (int j=1; j<10; j++)
			{
				System.out.println("inner loop" +j);
				
			}
			
			System.out.println("====outer loop ended====" +i);
		} */
		
	
	/*	
	 * 
	    1 2 3 4
	    5 6 7
	    8 9
	    10
		
		
		*/
		
		
//		int k=0;
//		for(int i=0; i<4; i++)
//		{
//			//System.out.print(i);
//			for(int j=0; j<4-i; j++)
//			{
//				
//				System.out.print(k+1);
//				System.out.print("\t");
//				k++;
//				
//			}
//			
//			System.out.println("");
//		}
		
		
//		for (int l=0; l<50; l++)
//		{
//			
//			for(int m=0; m<50-l; m++)
//			{
//				System.out.print("*");
//				System.out.print("\t");
//				
//			}
//			System.out.println("");
//		}
		
		/*	
		 * 
		    1 
		    2 3 
		    4 5 6 
		    7 8 9 10
			
			
			*/
//		int k =0;
//		for(int i = 0; i <4; i++)
//		{
//			
//			for(int j=0; j<i+1; j++)
//			{
//				System.out.print(k+1);
//				//System.out.println("");
//				System.out.print("\t");
//				k++;
//				
//			}
//			System.out.println("");
//		}
		
		
		/*	
		 * 
		    1 
		    1 2 
		    1 2 3
		    1 2 3 4
			
			
//			*/
//		
//		
//		for(int i = 0; i<4; i++)
//		{
//			for (int j= 0; j<i+1 ; j++)
//			{
//				System.out.print(j+1);
//				System.out.print("\t");
//				
//			}
//			System.out.println("");
//		}
		
		
		int array[] = {1,2,3,4,4,56,6556,44};
		int k =0;
		
//		for(int i=0; i<array.length; i++)
//		{
//			//System.out.println(k+""+i);	
//			array[k]=i;
//			k++;
//			//System.out.println(array[k]);	
//			
//
//
//		}
//		for(int x: array)
//		{
//		
//		System.out.println(x);	
//		
//		
////		}
//		
//		
//		int b[][]= {{1,2,3},{5,6,7},{8,9,10}};
//		
//		for(int i=0;i<3;i++)
//		{
//			
//		for(int j=0; j<3;j++)
//		{
//			System.out.print(b[i][j]);
//			System.out.print("\t");
//		}
//		System.out.println("");
//		}
		
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		hm.put(0, "hello");
		hm.put(1, "Gudbye"); 
		hm.put(42, "morning"); 
		hm.put(3, "evening"); 
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sn= hm.entrySet(); 
		Iterator it =sn.iterator(); //hashtable -pass table set collections 
		while(it.hasNext())
		{ 
		Map.Entry mp=(Map.Entry)it.next();
		System.out.println(mp.getKey());   
		System.out.println(mp.getValue()); }
//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
	

	//HashSet treeset, LinkedHashset implements Set interface 
		//does not accept duplicate values  
		// There is no guarantee elements stored in sequential order..Random order
		
		HashSet<String> hs= new HashSet<String>(); 
		hs.add("USA"); hs.add("UK"); hs.add("INDIA"); hs.add("he"); hs.add("she"); hs.add("INDIA"); 
		System.out.println(hs); 
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size()); 
		Iterator<String> i=hs.iterator(); 
		while(i.hasNext()) { System.out.println(i.next()); 
		
		
		
		}	
	}

}
