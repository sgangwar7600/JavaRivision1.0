package controlstatementstypes.jumpstatementtypes;
/**
-- return is use to exist the method with or without a value and after the return ,
   we can write statement , or else it will "unreachable error"
-- in case of void , we can use empty return type
-- return statement must be the last statement in case of return method
**/
public class Return {

	public static void main(String[] args) {
		
		Return r = new Return();
		
		System.out.println(r.m1() + r.m2() + r.m3() + r.m4() + r.m5() + r.m6()
							+ r.m7() + r.m8() + r.m9());
				
	}

	int m1 () {
		return 10 ;							}
 String m2() {	
		return "Nikola Tesla"  ; 			}
   char m3() {
		return 'L' ;						}
   long m4() {
		return 17299271;					} 
  short m5() {
		return 1729;						}
boolean m6() {
		return false ;						}
  float m7() {
		return 5.54f ;						}
 double m8() {
		return 1729.1729d	;				}
   byte m9() {
		return 17;
	}
	}
