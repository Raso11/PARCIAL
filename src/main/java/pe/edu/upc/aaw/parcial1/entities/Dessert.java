package pe.edu.upc.aaw.parcial1.entities;

import javax.persistence.*;

@Entity
@Table(name ="dessert" )
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDessert;
    @Column(name = "nameDessert",nullable = false,length = 40)
    private String nameDessert;
    @Column(name = "preparationTimeDessert",nullable = false)
    private int  preparationTimeDessert;
    @Column(name = "difficultyDessert",nullable = false,length = 40)
    private String difficultyDessert;
    @Column(name = "categoryDessert",nullable = false,length = 40)
    private String categoryDessert;

    public Dessert() {
    }

    public Dessert(int idDessert, String nameDessert, int preparationTimeDessert, String difficultyDessert, String categoryDessert) {
        this.idDessert = idDessert;
        this.nameDessert = nameDessert;
        this.preparationTimeDessert = preparationTimeDessert;
        this.difficultyDessert = difficultyDessert;
        this.categoryDessert = categoryDessert;
    }

    public String getCategoryDessert() {
        return categoryDessert;
    }

    public void setCategoryDessert(String categoryDessert) {
        this.categoryDessert = categoryDessert;
    }

    public int getIdDessert() {
        return idDessert;
    }

    public void setIdDessert(int idDessert) {
        this.idDessert = idDessert;
    }

    public String getNameDessert() {
        return nameDessert;
    }

    public void setNameDessert(String nameDessert) {
        this.nameDessert = nameDessert;
    }

    public int getPreparationTimeDessert() {
        return preparationTimeDessert;
    }

    public void setPreparationTimeDessert(int preparationTimeDessert) {
        this.preparationTimeDessert = preparationTimeDessert;
    }

    public String getDifficultyDessert() {
        return difficultyDessert;
    }

    public void setDifficultyDessert(String difficultyDessert) {
        this.difficultyDessert = difficultyDessert;
    }
}
