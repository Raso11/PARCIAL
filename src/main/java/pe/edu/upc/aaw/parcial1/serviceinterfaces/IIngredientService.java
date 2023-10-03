package pe.edu.upc.aaw.parcial1.serviceinterfaces;

import pe.edu.upc.aaw.parcial1.entities.Ingredient;

import java.util.List;

public interface IIngredientService {
    public void insertar(Ingredient ingredient);
    List<Ingredient> listar();
    public List<String[]> ListGeneral(String category);

}
