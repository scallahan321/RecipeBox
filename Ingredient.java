import java.util.Scanner;
 
public class Ingredient {
 
      // Declare the variables that each ingredient has
      String nameOfIngredient;
       float ingredientAmount;
       int numberCaloriesPerCup;
       double totalCalories;
       String unitMeasurement;
 
       // This constructs an object 
       public Ingredient(){
           this.nameOfIngredient="";
           this.ingredientAmount = 0;
           this.numberCaloriesPerCup = 0;
           this.totalCalories = 0.0;
       }
      
 
       //Method to return the ingredient name
       public String getNameOfIngredient(){
            return this.nameOfIngredient;
        }
      
        //Method to set ingredient name
       public void setNameOfIngredient(String ingredient){
            this.nameOfIngredient = ingredient;
           }
     
           //Method to return ingredient amount
       public float getIngredientAmount(){
            return this.ingredientAmount;
       }
       
       //Method to set ingredient amount
       public void setIngredientAmount(float cups){
           this.ingredientAmount = cups;
       }
       
       //Method to get number of calories per cup
       public int getNumberCaloriesPerCup(){
           return this.numberCaloriesPerCup;
       }
 
       //Method to set number of calories per cup
       public void setNumberCaloriesPerCup(int calories){
           this.numberCaloriesPerCup = calories;
       }
 
        //Method to get total calories
       public double getTotalCalories(){
               return this.totalCalories;
       }
 
       //Method to set total calories
       public void setTotalCalories(double totalcals){
           this.totalCalories = totalcals;
       }
 
       //Method to get unit of measurement
       public String getUnitMeasurement(){
           return this.unitMeasurement;
       }
 
        //Method to set unit of measurement
       public void setUnitMeasurement(String unit){
           this.unitMeasurement = unit;
       }
    

    
   public static void main(String[] args) {
       
    //Create an ingredient object for testing. In the future this could be done dynmically via user input
    Ingredient ing1 = new Ingredient();
       
    Scanner scnr = new Scanner(System.in);
    
    // Prompt user for ingredient name
    System.out.println("Please enter the name of the ingredient");
    
    // Checks if user entered a string. I am not 100% on how to be sure it's a string since there is no scnr.hasNextString method
    if (scnr.hasNext()){
         String name = scnr.next();
         ing1.setNameOfIngredient(name);
        }
    // terminates program if a string is not entered. In the future, a loop could be used to give the user more attempts
    else{
         System.out.println("You didn't enter a word. Out of attempts");
         return;
        }
            
    //prompts user for the amount of the ingredient
    System.out.println("Enter the ingredient amount");
    if (scnr.hasNextFloat()){
        float amount = scnr.nextFloat();
        ing1.setIngredientAmount(amount);
    }
    //terminates program if a float is not entered
    else {
        System.out.println("You didn't enter a number. Out of attempts");
        return;
    }
   
    //prompts user for the unit of measurement.
    System.out.println("Enter the unit of measurement");
    if (scnr.hasNext()){
        String unit = scnr.next();
        ing1.setUnitMeasurement(unit);
    }    
    //terminates program if a string is not entered
    else {
        System.out.println("You didn't enter a unit of measurement. Out of attempts");
        return;
    }
   
    System.out.println("Enter the number of calories.");
    if (scnr.hasNextDouble()){
        double calories = scnr.nextDouble();
        ing1.setTotalCalories(calories);
    }
    //terminates program if a double is not entered.
    else {
        System.out.println("You didn't enter a number. Out of attempts");
        return;
    }

    //prompt user to select y or n. If they select y then the details of their ingredient will be printed. 
    System.out.println("Would you like to view the details of your ingredient? type y or n");
    
    String response = scnr.next();
    if (response.equals("y")){
       System.out.println("Ingredient name: " + ing1.getNameOfIngredient());
       System.out.println("Amount: " + ing1.getIngredientAmount() + " " + ing1.getUnitMeasurement());
       System.out.println("Total Calories: " + ing1.getTotalCalories());
    }



}
}

   
   
 
  
    
  

 

        






   
