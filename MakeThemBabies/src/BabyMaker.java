public class BabyMaker
	{
		
		public static void main(String[] args)
			{
				// first baby
				Baby myBaby1 = new Baby("Alfred", 13.1, false);
				
				// second baby 
				Baby myBaby2 = new Baby("Gabriella", 25, true);
				
				// second baby 
				myBaby2.barf();
				
				// first baby
				System.out.println("My first baby is " + myBaby1.name + " and is " + myBaby1.weight + " pounds");
				
				if(myBaby1.isGirl)
					{
						
					}
			}

	}
