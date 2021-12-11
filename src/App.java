import lib.Units;

public class App {
    public static void main(String[] args) {
        // **This is meant to be an example for Joe to see for the interface.**

        // Creates a new recipe of "Chicken Parmesian" with one ingredient, "boneless skinless chicken breast halves".
        Recipe ChickenParmesian = new Recipe("Chicken Parmessian", new Ingredient[] {new Ingredient("boneless skinless chicken breast halves", 8, Units.items)}, 4); 


        // Calls a method that calculates the amount of ingredients based upon the amount of people that need to be fed.
        Recipe CalculatedChickenParm = Recipe.CalculateIngredients(ChickenParmesian, 5);
        
        // Prints out a formatted recipe to the console
        CalculatedChickenParm.PrintRecipe();
    }
}
