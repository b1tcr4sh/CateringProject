public class App {
    public static void main(String[] args) {
        Recipe ChickenParmesian = new Ingredient {
            Name = "Chicken Parmesian",
            Ingredients = new Ingredient[] {
                new Ingredient { Name = "Boneless skinless chicken breast halves", Quantity = 4, Units = Units.items},
                new Ingredient { Name = "Salt", Quantity = 1, Units = Units.tablespoons}
            },
            PeopleServes = 4
        } 

        Recipe CalculatedChickenParm = Recipe.CalculateIngredients(ChickenParmesian, 5);
        
        System.out.println(CalculatedChickenParm.quantity);
    }
}
