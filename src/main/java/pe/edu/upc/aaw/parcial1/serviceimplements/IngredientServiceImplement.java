package pe.edu.upc.aaw.parcial1.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.parcial1.entities.Ingredient;
import pe.edu.upc.aaw.parcial1.repositories.IIngredientRepository;
import pe.edu.upc.aaw.parcial1.serviceinterfaces.IIngredientService;

import java.util.List;
@Service
public class IngredientServiceImplement implements IIngredientService {
    @Autowired
    private IIngredientRepository iR;
    @Override
    public void insertar(Ingredient ingredient) {
        iR.save(ingredient);
    }
    @Override
    public List<Ingredient> listar() {
        return iR.findAll();
    }
    @Override
    public List<String[]> ListGeneral(String category) {
        return iR.ListGeneral(category);
    }
}
