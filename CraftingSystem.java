import java.util.HashMap;
import java.util.Map;

public class CraftingSystem {
    private Map<String, String> craftingRecipes = new HashMap<>();

    public CraftingSystem() {
        // Esempio di ricetta: "legno" + "pietra" = "ascia"
        craftingRecipes.put("legno+pietra", "ascia");
    }

    public String craft(String ingredient1, String ingredient2) {
        String recipe = ingredient1 + "+" + ingredient2;
        if (craftingRecipes.containsKey(recipe)) {
            return craftingRecipes.get(recipe);
        } else {
            return "Ricetta non valida!";
        }
    }
}
