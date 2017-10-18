
import java.lang.Math;

public class T89 {
	
	public static boolean isT89(long num){
		
		int counter=0;
		long num_=num;
		boolean valid=false;
		
		
		while(num_>0){
			
			counter++;
			num_/=10;
			
		}
		
		
		
		long[] nums=new long[counter+2];
		
		//System.out.println(num+" "+num_);
		while(num!=1 && num!=89){
			
			int i=0;
			num_=num;
			
			while(i<nums.length) {
				
				nums[i]=num_%10;
				num_/=10;
				i++;
				
			}
			
			num_=0;
			
			for(int j=0; j<nums.length; j++){
				//System.out.println("p"+num_);
				num_+=Math.pow(nums[j],2);
			}
			
			if(num_==89){
				valid=true;
			}
			num=num_;
			//System.out.println(num);
			
		}
		
		return valid;
	}
	
	public static long t89(long num){
		long counter=0;
		
		for(int i=1; i<=num; i++){
			if(isT89(i)) counter++;
		}
		
		return counter;
	}
	 
	
}

