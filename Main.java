public class Main {
    public static void main(String[] args) {
        Clothes hoodie = new Clothes("medium", "blue",1900);
        hoodie.inputSize();
        System.out.println(hoodie.sizeFit());
        Jeans jeans = new Jeans("medium", "black", 1200,"skinny");
    }
}