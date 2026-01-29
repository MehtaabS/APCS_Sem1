/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class a {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf x1 = new PooleDwarf(randName(),(int)(Math.random()*10));
		PooleDwarf x2 = new PooleDwarf(randName(),(int)(Math.random()*10));
		PooleDwarf x3 = new PooleDwarf(randName(),(int)(Math.random()*10));
		PooleDwarf x4 = new PooleDwarf(randName(),(int)(Math.random()*10));
		PooleDwarf x5 = new PooleDwarf(randName(),(int)(Math.random()*10));
		PooleDwarf x6 = new PooleDwarf(randName(),(int)(Math.random()*10));
		PooleDwarf x7 = new PooleDwarf(randName(),(int)(Math.random()*10));
		
		int T = 0;
		if(x2.isSameName(x1.getName())){
			T++;
		}
		if(x3.isSameName(x1.getName())){
			T++;
		}
		if(x4.isSameName(x1.getName())){
			T++;
		}
		if(x5.isSameName(x1.getName())){
			T++;
		}
		if(x6.isSameName(x1.getName())){
			T++;
		}
		if(x7.isSameName(x1.getName())){
			T++;
		}
		System.out.println(T+" Duplicates. The name was "+x1.getName()+".");
	}
}
