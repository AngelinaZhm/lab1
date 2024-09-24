import java.util.Scanner;

public class Clothes {
    private String size;
    private String color;
    private int price;

    public Clothes(String size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String sizeFit(){
        if (size.equalsIgnoreCase("small")){
            return "Цей розмір вам не підходить";
        } else if (size.equalsIgnoreCase("large")) {
            return "Цей розмір вам не підходить";
        } else {
            return "Цей розмір вам підходить!";
        }
    }
    public void inputSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ваш розмір - ");
        size = scanner.nextLine();
    }

}