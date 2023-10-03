package pe.edu.upc.aaw.parcial1.serviceinterfaces;

import pe.edu.upc.aaw.parcial1.entities.Dessert;

import java.util.List;

public interface IDessertService {
    public void insertar(Dessert dessert);

    public void eliminar(int idDessert);

    List<Dessert> listar();
    public List<String[]>QuantityOfIngredientsPerDifficulty();

}
