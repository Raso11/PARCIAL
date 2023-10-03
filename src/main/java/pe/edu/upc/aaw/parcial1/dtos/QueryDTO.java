package pe.edu.upc.aaw.parcial1.dtos;

public class QueryDTO {
    private String Difficulty;
    private int Quantity;

    public String getDifficulty() {
        return Difficulty;
    }

    public void setDifficulty(String difficulty) {
        Difficulty = difficulty;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
