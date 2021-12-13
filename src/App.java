import lib.Units;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);
        
        System.out.println("Please select what you wish to order (By typing the name of the item");
        System.out.println("1. Chicken Parmesian");
        System.out.println("2. Chicken Enchiladas");
        System.out.println("3. Meatballs");
        
        String MenuChoice = kbScanner.next();
    
        Recipe recipeToSend = new Recipe("", new Ingredient[] {}, 0);
        switch(MenuChoice){
            
                case "Chicken Parmesian": //Chicken Parmesian
                    recipeToSend = new Recipe("Chicken Parmesian",new Ingredient[] {
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
                    recipeToSend = new Recipe("Chicken Enchiladas",new Ingredient[] {
                        new Ingredient("Traditional Chicken and Cheese Enchilada Soup", 18.5, Units.oz),
                        new Ingredient("Hot Enchilada Sauce", 10, Units.oz),
                        new Ingredient("Chicken", 1, Units.pounds),
                        new Ingredient("Cheese", 1, Units.pounds),
                        new Ingredient("Corn Tortillas", 10, Units.items),
                        new Ingredient("Medium Green Onions", 2, Units.items),
                        
                    }, 5); 
                    
                    break;
                    
                case "Meatballs": //Meatballs
                    recipeToSend = new Recipe("Meatballs",new Ingredient[] {
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
            }

            System.out.println("How many people are you feeding?");
            int feedsThisManyPeople = kbScanner.nextInt();

            Recipe calculateRecipe = Recipe.CalculateIngredients(recipeToSend, feedsThisManyPeople);

            calculateRecipe.PrintRecipe();


            kbScanner.close();
        }      
    }

