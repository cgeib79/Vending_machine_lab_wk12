package products;

public enum Coins {

    POUND(1.00),
    FIFTYPENCE(0.50),
    TWENTYPENCE(0.20),
    TENPENCE(0.10);

    private double value;

    Coins(double value) {
        this.value = value;
    }
}
