import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBox {
     // create arraylist to store recipe objects
     private ArrayList<Recipe> listOfRecipes = new ArrayList<Recipe>();
     
	 
	 /** 
	  * @param listOfRecipes
	  */
	 //accessor and mutator methods for listOfRecipes
     public void setListOfRecipes(ArrayList<Recipe> listOfRecipes){
			this.listOfRecipes = listOfRecipes;
	 }

	 
	 /** 
	  * @return ArrayList<Recipe>
	  */
	 public ArrayList<Recipe> getListOfRecipes(){
		 return this.listOfRecipes;
	 }

    // plain constructor
    public RecipeBox(){
        this.listOfRecipes = new ArrayList<Recipe>();
    }
    
	// constructor that takes an ArrayList argument
    public RecipeBox(ArrayList<Recipe> listOfRecipes){
        this.listOfRecipes = listOfRecipes;
    }
     
	 // method that loops through all of the recipes and calls the printRecipe method on each
     public void printAllRecipeDetails(){
        for (int i=0; i < listOfRecipes.size(); ++i){
                listOfRecipes.get(i).printRecipe();
            }
        } 
     
	
	/** 
	 * @param selectedRecipe
	 */
	// this method works in conjunction with Recipe.setRecipeInstructions. 
	 public void Instructions(String selectedRecipe){
		for (int i=0; i < listOfRecipes.size(); ++i){
            if (listOfRecipes.get(i).getRecipeName().equals(selectedRecipe)){
                listOfRecipes.get(i).setRecipeInstructions();
            }
        } 
	 }
	 
	 // method to print recipe names
     public void printAllRecipeNames(){
            for (int i = 0; i <listOfRecipes.size(); ++i){
                System.out.println(listOfRecipes.get(i).getRecipeName());
            }
     }
	 // method to add new recipe to box
	 public void addNewRecipe(){
		listOfRecipes.add(Recipe.createNewRecipe());
	}
	
	
	/** 
	 * @param args
	 */
	public static void main (String[] args) {
    	// Create a Recipe Box
    		
		RecipeBox myRecipeBox = new RecipeBox(); 
        Scanner menuScnr = new Scanner(System.in);
        boolean menuBool = true;
	
		//The menu will continually be presented until menuBool is false
		while (menuBool){
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Add Recipe Instructions\n" + "5. Quit\n" +  "\nPlease select a menu item:");
       		while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
           		 	System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Add Recipe Instructions\n" + "5. Quit\n" + "\nPlease select a menu item:");
           			
						int input = menuScnr.nextInt();
					
					   if (input == 1) {
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
            			
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Add Recipe Instructions\n" + "5. Quit\n" + "\nPlease select a menu item:");
		}
	}      
	}
}