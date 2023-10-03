package pe.edu.upc.aaw.parcial1.dtos;

import pe.edu.upc.aaw.parcial1.entities.Dessert;

public class Query2DTO {
    private int idIngredient;
    private String nameIngredient;
    private int quantityIngredient;
    private Dessert dessert;

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public int getQuantityIngredient() {
        return quantityIngredient;
    }

    public void setQuantityIngredient(int quantityIngredient) {
        this.quantityIngredient = quantityIngredient;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
