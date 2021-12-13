import lib.Units;
import java.util.*;

public class App {
    private static Scanner kbScanner = new Scanner(System.in);
    public static void main(String[] args) {
       

    while (true) {
       // Prints messages that define which options are available.
        System.out.println("Please select what you wish to order (By typing the name of the item)");
        System.out.println("1. Chicken Parmesian (Serves 4 people per serving)");
        System.out.println("2. Chicken Enchiladas (Serves 5 people per serving)");
        System.out.println("3. Meatballs (Serves 8 people per serving)");
        
        Recipe recipeToSend = CollectMenuItem(); // Calls the method which Collects the answer and constructs the corresponding recipe.

        System.out.println("How many people are you feeding?"); 
        int feedsThisManyPeople = kbScanner.nextInt(); // Collects ant int representing the number of people being fed.

        // Calls the static method CalculateIngredients on the Recipe class, which calculates the amount of ingredients needed to satisfy the amolunt being served.
        Recipe calculateRecipe = Recipe.CalculateIngredients(recipeToSend, feedsThisManyPeople); 

        calculateRecipe.PrintRecipe(); // Calls the PrintRecipe method on the Recipe object, which recurses through each ingredient on the recipe and prints it.
        
        // Asks if the user would like to exit the program.
        System.out.println("Would you like to end here? If so type 'exit'!  Click enter to continue."); 
        
        String s1 = kbScanner.nextLine(); // Collects imput from the user, and if it equals "exit", escapes the conditional and reaches end of method.
            if (s1.equals("exit")) {
                // If the user enters "exit", then the 
                break;
                }
                System.out.println("Insert your answer here.");
            String answer = kbScanner.nextLine();
            if(answer.equals("exit")){
                break;
            }
    }
        kbScanner.close(); // Releases the Scanner object to system resources, closing the scanning of the standard input stream. 

    }

    private static Recipe CollectMenuItem() {
        // Collects the input from the user, determines which recipe is being requested, and constructs the appropriate Recipe object.
        String MenuChoice = kbScanner.nextLine();
    
        Recipe recipeToSend = new Recipe("", new Ingredient[] {}, 0); // Defines the recipeToSend Recipe object as an empty recipe to be overwritten by the selected recipe.
        switch(MenuChoice){
            
                case "Chicken Parmesian": //Chicken Parmesian
                    recipeToSend = new Recipe("Chicken Parmesian",new Ingredient[] { // Constructs a Recipe object with the properties given in the instructions.
                        new Ingredient("boneless skinless chicken breast halves", 4, Units.items),
                        new Ingredient("salt", 1, Units.tablespoons),
                        new Ingredient("Italian Breadcrumbs", 0.5, Units.cups),
                        new Ingredient("Egg", 1, Units.items),
                        new Ingredient("Butter", 4, Units.tablespoons),
                        new Ingredient("Mozzerella Cheese", 4, Units.slices),
                        new Ingredient("Grated Paremesian Cheese", 1, Units.tablespoons),
                        
                    }, 4); 
                    
                    break;
                    
                case "Chicken Enchiladas": //Chicken Enchiladas
                    recipeToSend = new Recipe("Chicken Enchiladas",new Ingredient[] { // Constructs a Recipe object with the properties given in the instructions.
                        new Ingredient("Traditional Chicken and Cheese Enchilada Soup", 18.5, Units.oz),
                        new Ingredient("Hot Enchilada Sauce", 10, Units.oz),
                        new Ingredient("Chicken", 1, Units.pounds),
                        new Ingredient("Cheese", 1, Units.pounds),
                        new Ingredient("Corn Tortillas", 10, Units.items),
                        new Ingredient("Medium Green Onions", 2, Units.items),
                        
                    }, 5); 
                    
                    break;
                    
                case "Meatballs": //Meatballs
                    recipeToSend = new Recipe("Meatballs",new Ingredient[] { // Constructs a Recipe object with the properties given in the instructions.
                        new Ingredient("Ground Beef", 1, Units.pounds),
                        new Ingredient("Ground Veal", 0.5, Units.pounds),
                        new Ingredient("Ground Pork", 0.5, Units.pounds),
                        new Ingredient("Cloves Garlic, Minced", 2, Units.items),
                        new Ingredient("Eggs", 2, Units.items),
                        new Ingredient("Freshlly Grated Romano Cheese", 1, Units.cups),
                        new Ingredient("Chopped Italian Flat Leaf Parsley Salt and Ground Black Pepper to Taste", 1.5, Units.tablespoons),
                        new Ingredient("Stale Italian Bread, Crumbled", 2, Units.cups),
                        new Ingredient("Lukewarm Water", 1.5, Units.cups),
                        new Ingredient("Olive Oil", 1, Units.cups),
                    }, 8); 

                    break;

                default:
                    // In the even the user mistypes their selection, this is called to handle that.
                    System.out.println("Unrecognized Recipe, please try again");
                    CollectMenuItem(); // Re-invokes the method, restarting the selection process
                    break;
            }
        return recipeToSend;
    }      
 }

