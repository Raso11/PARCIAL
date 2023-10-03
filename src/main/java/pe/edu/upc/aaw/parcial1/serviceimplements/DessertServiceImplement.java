package pe.edu.upc.aaw.parcial1.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.parcial1.entities.Dessert;
import pe.edu.upc.aaw.parcial1.repositories.IDessertRepository;
import pe.edu.upc.aaw.parcial1.serviceinterfaces.IDessertService;

import java.util.List;
@Service
public class DessertServiceImplement implements IDessertService {
    @Autowired
    private IDessertRepository dR;
    @Override
    public void insertar(Dessert dessert) {
        dR.save(dessert);
    }

    @Override
    public void eliminar(int idDessert) {
        dR.deleteById(idDessert);
    }
    @Override
    public List<Dessert> listar() {
        return dR.findAll();
    }

    @Override
    public List<String[]> QuantityOfIngredientsPerDifficulty() {
        return dR.QuantityOfIngredientsPerDifficulty();
    }


}
