package controlstatementstypes.selectionstatementtypes;

// Nested means within
// There could be infinite if conditions inside an if condition. 
// Note – If the inner condition satisfies then only outer if will be executed.
// Along with if conditions we can write else conditions also.


public class NestedIfCase1 {
 
	    public static void main(String args[]) 
	    { 
	    	
	        int a=10; 
	        int b=20; 
	        int c = 30;
	      
	        
	        if(a==10){ 
	        	
                System.out.println("nestedif1"); 

	        	
	            if(b==20){ 
	                System.out.println("nestedif2"); 
	                
	                if(c==30) {
	                	
	                	System.out.println("nestedif3");
	                }
	            }
	            
	            
	        } 
	        
	    } 
	} 
