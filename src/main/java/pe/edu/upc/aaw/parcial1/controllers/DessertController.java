package pe.edu.upc.aaw.parcial1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.parcial1.dtos.DessertDTO;
import pe.edu.upc.aaw.parcial1.dtos.IngredientDTO;
import pe.edu.upc.aaw.parcial1.dtos.QueryDTO;
import pe.edu.upc.aaw.parcial1.entities.Dessert;
import pe.edu.upc.aaw.parcial1.repositories.IDessertRepository;
import pe.edu.upc.aaw.parcial1.serviceinterfaces.IDessertService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dessert")
public class DessertController {
    @Autowired
    private IDessertService dS;

    @PostMapping
    public void registrar(@RequestBody DessertDTO dto) {
        ModelMapper m = new ModelMapper();
        Dessert a = m.map(dto, Dessert.class);
        dS.insertar(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dS.eliminar(id);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<DessertDTO> listar() {
        return dS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DessertDTO.class);

        }).collect(Collectors.toList());
    }
    @GetMapping("/cantidades")
    @PreAuthorize("hasAuthority('USER')")
    public List<QueryDTO> cantidadpordificultad(){
        List<String[]> lista= dS.QuantityOfIngredientsPerDifficulty();
        List<QueryDTO> listaSTO = new ArrayList<>();
        for (String[] data:lista){
            QueryDTO dto = new QueryDTO();
            dto.setDifficulty((data[0]));
            dto.setQuantity(Integer.parseInt(data[1]));
            listaSTO.add(dto);
        }
        return listaSTO;
    }


}
