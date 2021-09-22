public class BabyMaker
	{
		
		public static void main(String[] args)
			{
				//first baby
				Baby myBaby1 = new Baby("Alfred", 13.1, false);
				
				//second baby 
				Baby myBaby2 = new Baby("Gabriella", 25, true);
				
				//second baby 
				myBaby2.barf();
				
				//first baby
				System.out.println("My first baby is " + myBaby1.getName() + " and is " + myBaby1.getWeight() + " pounds");
				
				//Change name 
				myBaby1.setName("Daniel");
				
				//print name again
				System.out.println(myBaby1.getName());
				if(myBaby1.isGirl())
					{
						
					}
			}

	}
