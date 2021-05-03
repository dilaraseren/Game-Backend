public class Campaign {
    private int id;
    private String name;
    private double discountPercentage;
    Game game=new Game();

    public Campaign() {

    }

    public Campaign(int id, String name, double discountPercentage) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountPercentage() {

        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {

        this.discountPercentage = discountPercentage;
    }

}
