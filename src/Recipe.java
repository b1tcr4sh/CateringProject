public class Recipe { // An object to represent an entire recipe, as provided on the project instructions.
    public String Name; // The name of the recipe.
    public Ingredient[] Ingredients; // An array of the ingredients required to complete each recipe.
    public int PeopleServes; // The amount of people that each recipe serves.

    public static Recipe CalculateIngredients(Recipe recipe, int peopleToFeed) {
        Ingredients[] calculatedIngredients = {}; // Initializing a variable that holds a copy of the ingredients of the passed in recipe and does calculations.

        for (int i = 0; i < recipe.Ingredients.Length(); i++) { 
            // Iterates over the ingredients and scales them to the quantity of people being served.
            recipe.Ingredients[i].quantity / PeopleServes;
            recipe.Ingredients[i] = recipe.Ingredients[i] * peopleToFeed;

            // Appends the new ingredient object to the array.
            calculatedIngredients.Append(recipe.Ingredients[i]);
        }
        return new Recipe { // Returns a new recipe object containing the calculated amount.
            Name = recipe.name,
            Ingredients = calculatedIngredients,
            PeopleServes = recipe.PeopleServes,
        } 
    }
}