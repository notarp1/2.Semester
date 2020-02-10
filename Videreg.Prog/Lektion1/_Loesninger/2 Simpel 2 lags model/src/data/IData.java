package data;
import java.util.List;
public interface IData {
    String[] getAllIngredients(); //returnerer alle ingredienser i String-format
    String getIngredientName(int id); //returnerer navn for ingrediens
    int getIngredientAmount(int id); //returnerer mængde for ingrediens
    void setIngredientName(int id, String name); //Ændrer navn for ingrediens til angivet værdi i 'name'
    void setIngredientAmount(int id, int amount); //Ændrer mængde for ingrediens til angivet værdi i 'amount'
    void createIngredient(int id, String name, int amount); //opretter en ny ingrediens med de angivne værdier
}
