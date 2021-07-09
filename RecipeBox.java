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

	
     public void printAllRecipeDetails(){
        for (int i=0; i < listOfRecipes.size(); ++i){
                listOfRecipes.get(i).printRecipe();
            }
        } 
     

	 public void Instructions(String selectedRecipe){
		for (int i=0; i < listOfRecipes.size(); ++i){
            if (listOfRecipes.get(i).getRecipeName().equals(selectedRecipe)){
                listOfRecipes.get(i).setRecipeInstructions();
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
	
	public static void main (String[] args) {
    	// Create a Recipe Box
    		
		RecipeBox myRecipeBox = new RecipeBox(); 
        Scanner menuScnr = new Scanner(System.in);
        boolean menuBool = true;
		
		
		while (menuBool){
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Add Recipe Instructions\n" + "5. Quit\n" +  "\nPlease select a menu item:");
       		while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
           		 	System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Add Recipe Instructions\n" + "5. Quit\n" + "\nPlease select a menu item:");
           			int input = menuScnr.nextInt();
					if (input == 1) {
                //Recipe newRecipe1 = new Recipe();
						myRecipeBox.addNewRecipe();;
           	 	  } else if (input == 2) {
               			myRecipeBox.printAllRecipeDetails();
            	  } else if (input == 3) {
						for (int j = 0; j < myRecipeBox.getListOfRecipes().size(); j++) { 
                    	System.out.println((j + 1) + ": " + myRecipeBox.getListOfRecipes().get(j).getRecipeName()); 
                         }
                 }  else if (input == 4){
				  //have them select which recipe to add instructions to. then call the recipe.setRecipeInstructions method
				 		System.out.print("Which recipe?\n");
				  		String selectedRecipe = menuScnr.next();
				  		myRecipeBox.Instructions(selectedRecipe);
			  }
			  		else if (input == 5){
				  		menuBool = false;
			  }
			
			
			
			// else {
             //   System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "4. Add Recipe Instructions\n" + "\nPlease select a menu item:");
            //}
            			
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Add Recipe Instructions\n" + "5. Quit\n" + "\nPlease select a menu item:");
		}
	
	}
        
	}

}
