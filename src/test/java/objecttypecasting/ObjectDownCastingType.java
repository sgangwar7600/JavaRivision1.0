package objecttypecasting;


class AA {								void mm() { System.out.println("parent class");		}		}

class BB extends AA {					void mm() { System.out.println("child method" );	}		}


public class ObjectDownCastingType {

	public static void main(String[] args) {
				
					//downCasting
		 		
						//	BB rv = new AA(); here i'm doing direct object down-casting, and direct that is not possible 
							
							AA ob = new BB();
							
							BB ob1 = (BB)ob;		// this way , object type-casting is possible
													// here type-casted from parent object to child object
							ob1.mm();

	}

}
