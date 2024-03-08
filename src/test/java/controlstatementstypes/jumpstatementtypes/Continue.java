package controlstatementstypes.jumpstatementtypes;


// Unlike break statement, the continue statement doesn't break the loop, whereas, 
// it skips the specific part of the loop and jumps to the next iteration of the 
// loop immediately

// it skips the current iteration
// also here we can use labeled continue 
 
public class Continue {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		outer:
			for (int i = 1 ; i<=3 ; i++) 
				{
			
					Inner:
						for (int j = 1 ; j<=3 ; j++) 
						{
						
							if (i==2) 
							
							{ 		
								continue outer;
								//System.out.println(i);	-- you can not provide any statement after the continue; statement

							}
							System.out.println(i);
						}
				}

		}
	}
