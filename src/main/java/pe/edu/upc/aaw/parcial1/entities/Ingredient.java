package pe.edu.upc.aaw.parcial1.entities;

import javax.persistence.*;

@Entity
@Table(name="ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngredient;
    @Column(name = "nameIngredient",nullable = false,length = 40)
    private String nameIngredient;
    @Column(name = "quantityIngredient",nullable = false)
    private int quantityIngredient;
    @ManyToOne
    @JoinColumn(name = "idDessert")
    private Dessert dessert;

    public Ingredient() {
    }
    public Ingredient(int idIngredient, String nameIngredient, int quantityIngredient, Dessert dessert) {
        this.idIngredient = idIngredient;
        this.nameIngredient = nameIngredient;
        this.quantityIngredient = quantityIngredient;
        this.dessert = dessert;
    }

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
