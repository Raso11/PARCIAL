package pe.edu.upc.aaw.parcial1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.aaw.parcial1.entities.Dessert;

import java.time.LocalDate;
import java.util.List;

public interface IDessertRepository extends JpaRepository<Dessert,Integer> {
    @Query(value = "SELECT p.difficulty_dessert, COUNT(i.id_ingredient) AS cantidad_ingredientes\n" +
            " FROM dessert p\n" +
            " INNER JOIN ingredient i ON p.id_dessert = i.id_dessert\n" +
            " GROUP BY p.difficulty_dessert;", nativeQuery = true)
    public List<String[]>QuantityOfIngredientsPerDifficulty();

}
