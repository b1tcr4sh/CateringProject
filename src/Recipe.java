import lib.Units;

public class Recipe { // An object to represent an entire recipe, as provided on the project instructions.
    public String Name; // The name of the recipe.
    public Ingredient[] Ingredients; // An array of the ingredients required to complete each recipe.
    public int PeopleServes; // The amount of people that each recipe serves.

    public Recipe(String name, Ingredient[] ingredients, int peopleServes) {
        // A constructor that maps the paramaters to class members.
        Name = name;
        Ingredients = ingredients;
        PeopleServes = peopleServes;
    }

    public static Recipe CalculateIngredients(Recipe recipeToModify, int peopleToFeed) {
        Ingredient[] calculatedIngredients = recipeToModify.Ingredients.clone(); // Creates a clone of the array of ingredients.

        for (int i = 0; i < recipeToModify.Ingredients.length; i++) { 
            // Iterates over the ingredients, scales them to the quantity of people being served, and adds replaces the corresponding index in the cloned array.
            calculatedIngredients[i].Quantity = (recipeToModify.Ingredients[i].Quantity / recipeToModify.PeopleServes) * peopleToFeed;
        }
        return new Recipe(recipeToModify.Name, recipeToModify.Ingredients, recipeToModify.PeopleServes); // Returns ne recipe object with calculated ingredient quantities. 
    }

    public void PrintRecipe() {
        System.out.println(String.format("Recipe for %s:", Name));

        for (int i = 0; i < Ingredients.length; i++) {
            if (Ingredients[i].Unit == Units.items) {
                System.out.println(String.format("%s %s", Ingredients[i].Quantity, Ingredients[i].Name));
            } else {
                System.out.println(String.format("%s %s of %s", Ingredients[i].Quantity, Ingredients[i].Unit.toString(), Ingredients[i].Name));
            }
        }
    }
}