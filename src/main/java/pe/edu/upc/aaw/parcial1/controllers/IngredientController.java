package pe.edu.upc.aaw.parcial1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.parcial1.dtos.IngredientDTO;
import pe.edu.upc.aaw.parcial1.dtos.Query2DTO;
import pe.edu.upc.aaw.parcial1.entities.Dessert;
import pe.edu.upc.aaw.parcial1.entities.Ingredient;
import pe.edu.upc.aaw.parcial1.repositories.IDessertRepository;
import pe.edu.upc.aaw.parcial1.serviceinterfaces.IIngredientService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    @Autowired
    private IIngredientService iS;
    @Autowired
    private IDessertRepository dR;

    @PostMapping
    public void registrar(@RequestBody IngredientDTO dto) {
        ModelMapper m = new ModelMapper();
        Ingredient a = m.map(dto, Ingredient.class);
        iS.insertar(a);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<IngredientDTO> listar() {
        return iS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,IngredientDTO.class);

        }).collect(Collectors.toList());
    }
    @GetMapping("/ig/{categoryDessert}")
    public List<Query2DTO> listarLibroPerEmail2(@PathVariable ("categoryDessert") String nameCategory){
        List<String[]> lista=iS.ListGeneral(nameCategory);
        List<Query2DTO> listaDTO = new ArrayList<>();
        for (String[] data:lista){
            Query2DTO dto = new Query2DTO();
            dto.setIdIngredient(Integer.parseInt(data[0]));
            dto.setNameIngredient((data[1]));
            dto.setQuantityIngredient(Integer.parseInt(data[2]));
            dto.setDessert(dR.findById(Integer.parseInt(data[3])).orElse(new Dessert()));

            listaDTO.add(dto);
        }
        System.out.println(nameCategory);
        return listaDTO;
    }
}
