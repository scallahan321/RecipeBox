/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1849422_snhu
 */


import java.util.Scanner;
import java.util.ArrayList;

public class Recipe {
    
    private String recipeName;
    
   
     public int servings = 0;
    
     public ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
    
     public double totalRecipeCalories = 0;
    /**
     * Add mutators and accessors for the class variable.
     * 
     */
     
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
     
    public ArrayList getRecipeIngredients(){
        return this.recipeIngredients;
    }
    
    public void setTotalRecipeCalories(double totalRecipeCalories){
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public double getTotalRecipeCalories(){
        return this.totalRecipeCalories;
    }
    
    public Recipe() {
        this.recipeName = "";
        this.servings = 0; //<--- assignment value with appropriate data type
        this.recipeIngredients = new ArrayList<Ingredient>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;
        
    }
    public Recipe(String recipeName, int servings, 
    	ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories) 
    //<-- use appropriate data type for the ArrayList and the servings arguments
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public void printRecipe() {
        
       
        int singleServingCalories = (int)totalRecipeCalories / servings;
         
          
        System.out.println("Recipe: " + recipeName);
        System.out.println("Serves: "+ servings);
        int i;
        for (i=0; i<recipeIngredients.size();++i){
            System.out.println(recipeIngredients.get(i));
        }
        System.out.println(singleServingCalories);
       
    }
    
    
    public Recipe createNewRecipe() {
        double totalRecipeCalories = 0;
        ArrayList <Ingredient> recipeIngredients = new ArrayList <Ingredient>();
        boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
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

            recipeIngredients.add(ingredientName);
            
        
                System.out.println("Please enter the ingredient amount: ");
                float ingredientAmount = scnr.nextFloat();
                
            
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
                totalRecipeCalories += ingredientCalories;
                
              
            
            }
           
       } while (addMoreIngredients) ;
        
        Recipe recipe1 = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe();
        
        return recipe1;
    }
}


/**
 * Final Project
 * 
 * For your Final Project:
 * 
 * 1. Modify this code to develop a Recipe class:
 *	a. change the void main method createNewRecipe() that returns a Recipe 
 * 	 
 * 2. FOR FINAL SUBMISSION ONLY:Change the ArrayList type to an 
 *		Ingredient object.  When a user adds an ingredient to the recipe, 
 * 		instead of adding just the ingredient name, you will be adding the 
 *		actual ingredient including name, amount, measurement type, calories.
 *	For the Milestone Two submission, the recipeIngredients ArrayList can
 *	remain as a String type.
 *
 * 3. Adapt the printRecipe() method to print the amount and measurement
 * 	type as well as the ingredient name.
 *
 * 4. Create a custom method in the Recipe class. 
 *      Choose one of the following options:
 *
 * 	a. print out a recipe with amounts adjusted for a different 
 * 		number of servings
 * 
 * 	b. create an additional list or ArrayList that allow users to 
 * 		insert step-by-step recipe instructions
 *
 * 	c. conversion of ingredient amounts from 
 * 		English to metric (or vice versa)
 *
 * 	d. calculate select nutritional information 
 *
 * 	e. calculate recipe cost
 * 
 *      f. propose a suitable alternative to your instructor
 * 
 */ 
