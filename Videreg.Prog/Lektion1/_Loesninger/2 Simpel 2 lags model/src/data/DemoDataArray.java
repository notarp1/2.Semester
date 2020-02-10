package data;

import java.util.ArrayList;
import java.util.List;
// Ikke med i opgaveformuleringen. Her er en implementering som ikke anvender list / arraylist
public class DemoDataArray implements IData {
    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return id + " \'" + name + "\'" + " (" + amount + " gram)";
        }
    }
    private Ingredient[] ingredients;

    public DemoDataArray() {
        ingredients = new Ingredient[3];
        ingredients[0]=(new Ingredient(10, "flormelis", 60));
        ingredients[1]=(new Ingredient(2, "mel", 240));
        ingredients[2]=(new Ingredient(3, "smør", 185));
    }

    @Override
    public String[] getAllIngredients() {
        String[] temp;
        temp = new String[ingredients.length];
        for (int j = 0; (j<ingredients.length) ; j++){
            temp[j]=ingredients[j].toString();
        }
        return temp;
    }

    @Override
    public String getIngredientName(int id) {
        for (Ingredient i : ingredients)
            if (i.id == id)
                return i.name;
        return null;
    }

    @Override
    public int getIngredientAmount(int id) {
        for (Ingredient i : ingredients)
            if (i.id == id)
                return i.amount;
        return -1;
    }

    @Override
    public void setIngredientName(int id, String name) {
        for (Ingredient i : ingredients)
            if (i.id == id) {
                i.name = name;
                return;
            }
    }

    @Override
    public void setIngredientAmount(int id, int amount) {
        for (Ingredient i : ingredients)
            if (i.id == id) {
                i.amount = amount;
                return;
            }
    }

    @Override
    public void createIngredient(int id, String name, int amount){
        Ingredient[] temp = new Ingredient[ingredients.length+1];
        for (int j = 0; (j<ingredients.length); j++)
            temp[j]=ingredients[j];
        temp[ingredients.length-1+1]=new Ingredient(id, name, amount);
        ingredients=temp;
    }
}
