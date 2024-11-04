package pizzabillin.java;

public class Pizza {
         private int price;
         
         private Boolean veg;
         
         private int extraCheesePrize = 100;
         private int extraTopingsPrize =150;
         private int backpack = 20;
         
         private int basePrize;
         
         private Boolean isExtraChesseAdded = false;
         private Boolean isExtraTopingsAdded = false;
         private Boolean isoptedForTakeAway = false;
        		 
         
         
         public Pizza(Boolean veg)
         {
        	 this.veg = veg;
        	 
        	 if(this.veg)
        	 {
        		 this.price = 300;
        		 
        	 }
        	 else
        	 {
        		 this.price = 400;
        	 }
        	 
        	 basePrize = this.price;
         }
         
        
         public void addExtraCheese()
         {
        	 isExtraChesseAdded = true;
        	;
        	 
            this.price += extraCheesePrize;	
         }
         
         public void addExtraTopings()
         {
        	 isExtraTopingsAdded = true;
        	
        	this.price += extraTopingsPrize;
         }
         
         
         public void takeAway()
         {
        	 isoptedForTakeAway = true;
        	 
        	this.price += backpack;
         }
         
         public void getBill()
         {
        	 String bill = "";
        	 System.out.println("pizza base price:"+basePrize);
        	 if(isExtraChesseAdded)
        	 {
        		 bill += "Extra cheese aded:"+extraCheesePrize+ "\n";
        	 }
        	 
        	 if(isExtraTopingsAdded)
        	 {
        		 bill += "Extra topings aded:"+extraTopingsPrize+ "\n";
        	 }
        	 
        	 if(isoptedForTakeAway)
        	 {
        		 bill += "back pack given:"+backpack+ "\n";
        	 }
        	 
        	 bill += "Bill: " +this.price+ "\n";
        	 System.out.println(bill);
         }
	public static void main(String[] args) {
		Pizza basePizza = new Pizza(false);
		basePizza.addExtraCheese();
		basePizza.addExtraTopings();
		basePizza.takeAway();
		basePizza.getBill();
		
		Deluxpizza dp = new Deluxpizza(false);
		dp.addExtraCheese();
		dp.addExtraTopings();
		dp.takeAway();
		dp.getBill();
		

	}

}
