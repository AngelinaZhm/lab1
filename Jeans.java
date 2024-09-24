public class Jeans extends Clothes {
    private String fitType;
    public Jeans(String size, String color, int price, String fitType) {
        super(size, color, price);
        this.fitType = fitType;
    }

    public String getFitType() {
        return fitType;
    }

    public void setFitType(String fitType) {
        this.fitType = fitType;
    }

}