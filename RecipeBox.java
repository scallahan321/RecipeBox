//package SteppingStones;

import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBox {

    
     private ArrayList<Recipe> listOfRecipes = new ArrayList<Recipe>();



	

     public void setListOfRecipes(ArrayList<Recipe> listOfRecipes){
			this.listOfRecipes = listOfRecipes;
	 }

	 public ArrayList<Recipe> getListOfRecipes(){
		 return this.listOfRecipes;
	 }

    
    public RecipeBox(){
        this.listOfRecipes = new ArrayList<Recipe>();
    }
    
    public RecipeBox(ArrayList<Recipe> listOfRecipes){
        this.listOfRecipes = listOfRecipes;
    }

	
	/**
	 * Add the following custom methods:
	 * 
	 * //printAllRecipeDetails(SteppingStone5_Recipe selectedRecipe)
	 * 		This method should accept a recipe from the listOfRecipes ArrayList
	 * 		recipeName and use the SteppingStone5_Recipe.printRecipe() method 
	 * 		to print the recipe
	 * 		
	 * //printAllRecipeNames() <-- This method should print just the recipe
	 * 		names of each of the recipes in the listOfRecipes ArrayList
	 * 
	 * //addRecipe(SteppingStone5_Recipe tmpRecipe) <-- This method should use
	 * 		the SteppingStone5_Recipe.addRecipe() method to add a new 
	 * 		SteppingStone5_Recipe to the listOfRecipes
	 * 
	 */

     public void printAllRecipeDetails(String selectedRecipe){
        for (int i=0; i < listOfRecipes.size(); ++i){
            if (listOfRecipes.get(i).getRecipeName()==selectedRecipe){
                listOfRecipes.get(i).printRecipe();
            }
        } 
     }
	
     public void printAllRecipeNames(){
            for (int i = 0; i <listOfRecipes.size(); ++i){
                System.out.println(listOfRecipes.get(i).getRecipeName());
            }
     }
	
	 public void addNewRecipe(){
		listOfRecipes.add(Recipe.createNewRecipe());
	}
	/**
	* A variation of following menu method should be used as the actual main 
	*		once you are ready to submit your final application.  For this 
	*		submission and for using it to do stand-alone tests, replace the 
	*		public void menu() with the standard 
	*			public static main(String[] args)
	*		method
	*
	*/
	
	public static void main (String[] args) {
    	// Create a Recipe Box
    		
		RecipeBox myRecipeBox = new RecipeBox(); 
        Scanner menuScnr = new Scanner(System.in);
        
		
		/**
		* Print a menu for the user to select one of the three options:
		*
		*/
		
		System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            int input = menuScnr.nextInt();
            
			/**
			* The code below has two variations:
			* 	1. Code used with the SteppingStone6_RecipeBox_tester.
			*	2. Code used with the public static main() method
			*
			* One of the sections should be commented out depending on the use. 
			*/
			
			/**
			* This could should remain uncommented when using the
			* SteppingStone6_RecipeBox_tester.
			* 
			* Comment out this section when using the
			*		public static main() method
			*/
			
			if (input == 1) {
                //Recipe newRecipe1 = new Recipe();
				Recipe.createNewRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                myRecipeBox.printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {
                
				
				for (int j = 0; j < myRecipeBox.getListOfRecipes().size(); j++) { 
                    System.out.println((j + 1) + ": " + myRecipeBox.getListOfRecipes().get(j).getRecipeName()); 
                }
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
            
			/**
			* This could should be uncommented when using the
			* 		public static main() method
			* 
			* Comment out this section when using the
			* 		SteppingStone6_RecipeBox_tester.
			*		
			
			
			if (input == 1) {
                myRecipeBox.newRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                myRecipesBox.printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {		
				for (int j = 0; j < myRecipesBox.listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + myRecipesBox.listOfRecipes.get(j).getRecipeName());
				}
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
			
			*
			*/
			
			//System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		}
		
        
	}

}


/**
 * 
 * Final Project Details:
 * 
 * For your final project submission, you should add a menu item and a method 
 *		to access the custom method you developed for the Recipe class 
 * 		based on the Stepping Stone 5 Lab.
 *
 */