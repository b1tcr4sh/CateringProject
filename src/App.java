import lib.Units;

public class App {
    public static void main(String[] args) {
        Recipe ChickenParmesian = new Recipe("Chicken Parmessian", new Ingredient[] {new Ingredient("boneless skinless chicken breast halves", 8, Units.items)}, 4);

        Recipe CalculatedChickenParm = Recipe.CalculateIngredients(ChickenParmesian, 5);
        
        System.out.println(CalculatedChickenParm.Ingredients[0].Quantity);
    }
}
