package pe.edu.upc.aaw.parcial1.dtos;

public class DessertDTO {
    private int idDessert;
    private String nameDessert;
    private int  preparationTimeDessert;
    private String difficultyDessert;
    private String categoryDessert;
    public int getIdDessert() {
        return idDessert;
    }

    public String getCategoryDessert() {
        return categoryDessert;
    }

    public void setCategoryDessert(String categoryDessert) {
        this.categoryDessert = categoryDessert;
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
