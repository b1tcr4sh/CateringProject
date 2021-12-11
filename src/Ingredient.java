import lib.Units;

public class Ingredient { // The attributes used to identify each ingredient
    public String Name; // The name of the ingredient (Can include description ie. Minced, Stale, Toasted, etc.)
    public double Quantity; // The quantity of units that are required of this ingredient
    public Units Unit; // The unit that the quantity refers to.  View Units.java for reference.

    public Ingredient(String name, double quantity, Units unit) {
        // A constructor that maps the paramaters to class members.
        Name = name;
        Quantity = quantity;
        Unit = unit;
    }

    public Ingredient ConvertUnits(Units unitToConvertTo) {
        // returns An ingredient with converted units and quantity.

        
        return null;
    }
}