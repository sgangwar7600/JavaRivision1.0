package controlstatementstypes.iterationstatementtypes.DoWhileTypes;

/**

-- it is similar to while loop, but do-while loop is an "Exit control loop", unlike while loop and for loop, the do-while check the condition at the end of
   loop body. The Java do-while loop is executed at least once because condition 
   is checked after loop body.

--  in do while loop, it is also must to give condition , or else it will not work 


@Here,

-- The body of the loop is executed at first. Then the textExpression is evaluated.
-- If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
-- The textExpression is evaluated once again.
-- If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
-- This process continues until the textExpression evaluates to false. Then the loop stops.


@Here, is the difference table:

while																|	do-while

Condition is checked first then statement(s) is executed  |		Statement(s) is executed at least once, thereafter condition is checked.
														  |
It might occur statement(s) is executed zero times, 	  | 	At least once the statement(s) is executed.
If condition is false.									  |
														  |
No semicolon at the end of while. while(condition)		  |		 Semicolon at the end of while. while(condition);
														  |
If there is a single statement, brackets are not required | 	Brackets are always required.
														  |
Variable in condition is initialized before 			  |		variable may be initialized before or within the loop.
the execution of loop.									  |		
														  |
while loop is entry controlled loop						  |		do-while loop is exit controlled loop
														  |
while(condition) { statement(s); }					 	  |		do { statement(s); } while(condition);

**/


public class DoWhileType1 {

	public static void main(String[] args) {

		int a = 4 ;
		
			do
			
			{
				// Loop Body
				System.out.println("execute");
			}
			
			while(a>5);		// Condition check  //while (test_expression); // Note: here The test_expression for the do-while loop must return a boolean value , else we would get compile-time error.
	}

}
