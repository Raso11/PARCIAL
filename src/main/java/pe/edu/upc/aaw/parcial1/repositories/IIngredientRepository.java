package pe.edu.upc.aaw.parcial1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.aaw.parcial1.entities.Ingredient;

import java.util.List;

public interface IIngredientRepository extends JpaRepository<Ingredient,Integer> {
    @Query(value = "SELECT ing.id_ingredient, ing.name_ingredient, ing.quantity_ingredient, ing.id_dessert \n" +
            " FROM ingredient ing\n" +
            " JOIN dessert des ON ing.id_dessert = des.id_dessert\n" +
            " WHERE des.category_dessert = :category", nativeQuery = true)
    public List<String[]> ListGeneral(String category);
}
