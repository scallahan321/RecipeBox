/**
 *
 * @author 1849422_snhu
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Recipe {
    
    //declare Recipe variables
    private String recipeName;
    
     public int servings = 0;
    
     public ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();

     public ArrayList<String> recipeInstructions = new ArrayList<String>();
    
     public double totalRecipeCalories = 0;
    
     //accessor and mutator methods for Recipe object
     public void setRecipeName (String recipeName){
         this.recipeName = recipeName;
     }
     
     public String getRecipeName() {
         return this.recipeName;
     }
     
    public void setServings (int servings){
        this.servings = servings;
    }
    
    public int getServings(){
        return this.servings;
    }
     
    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients){
        this.recipeIngredients = recipeIngredients;
    }
     
    public ArrayList<Ingredient> getRecipeIngredients(){
        return this.recipeIngredients;
    }
    
    public void setTotalRecipeCalories(double totalRecipeCalories){
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public double getTotalRecipeCalories(){
        return this.totalRecipeCalories;
    }
    
    // custom method for prompting user to enter instructions for recipe
    public void setRecipeInstructions(){
            boolean addMoreInstructions = true;
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
            
            do {
                System.out.println("Enter an instruction or type end if you are finished");
                String instruction = scanner.next();

                 if (instruction.toLowerCase().equals("end")){
                    addMoreInstructions = false;
                    }
                else {
                    recipeInstructions.add(instruction);
                 }

         } while (addMoreInstructions);
    }
    //this method returns the recipe instructions
    public ArrayList<String> getRecipeInstructions() {
        return this.recipeInstructions;
    }
    //plain constructor
    public Recipe() {
        this.recipeName = "";
        this.servings = 0; //<--- assignment value with appropriate data type
        this.recipeIngredients = new ArrayList<Ingredient>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;
        
    //constructor that takes variable arguments
    }
    public Recipe(String recipeName, int servings, 
    	ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories) 
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    //method to print all recipe details
    public void printRecipe() {      
       
        int singleServingCalories = (int)totalRecipeCalories / servings;
                  
        System.out.println("Recipe: " + recipeName);
        System.out.println("Serves: "+ servings);
       
        int i;
        for (i=0; i<recipeIngredients.size();++i){
            System.out.println(recipeIngredients.get(i).getNameOfIngredient());
            System.out.println(recipeIngredients.get(i).getIngredientAmount()+ " " + recipeIngredients.get(i).getUnitMeasurement());
        }
        System.out.println(singleServingCalories);  
        
        if (recipeInstructions.isEmpty()==false){
            System.out.println("Instructions:");
            for (int y = 0; y<recipeInstructions.size();++y){
            System.out.println(recipeInstructions.get(y));
        }
    }
    }
    
    //this is the method that will be accessed from RecipeBox to create a recipe
    public static Recipe createNewRecipe() {
        double totalRecipeCalories = 0;
        ArrayList <Ingredient> recipeIngredients = new ArrayList <Ingredient>();
        boolean addMoreIngredients = true;
      
        Scanner scnr = new Scanner(System.in);
        scnr.useDelimiter("\n");
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");       
        int servings = scnr.nextInt(); 
                        
        do {
            System.out.println("Please enter the ingredient name or type end if you are finished entering ingredients: ");
            String ingredientName = scnr.next();
          
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
            } else {         
            Ingredient ingredient1 = new Ingredient();
            ingredient1.setNameOfIngredient(ingredientName);
            
            System.out.println("Enter the amount of the ingredient");
            float ingredientAmount = scnr.nextFloat();
            ingredient1.setIngredientAmount(ingredientAmount);

            System.out.println("Enter the unit of measurement");
            String unitOfMeasurement = scnr.next();
            ingredient1.setUnitMeasurement(unitOfMeasurement);

            recipeIngredients.add(ingredient1);
                       
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
                totalRecipeCalories += ingredientCalories;           
            }
           
       } while (addMoreIngredients);
        
        Recipe recipe1 = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
        
        return recipe1;
    }
}
