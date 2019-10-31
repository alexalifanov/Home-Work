package task14;

public enum Menu {
    LAYS(100, "RUB"),
    SNICKERS(60, "RUB"),
    SKITTLES(50, "RUB"),
    HARIBO(45, "RUB"),
    KINDER(90, "RUB"),
    MENTOS(35, "RUB"),
    MELLER(55, "RUB"),
    OREO(75, "RUB"),
    NESQUIK(110, "RUB"),
    MILKA(115, "RUB");
    int price;
    String currency;
    Menu(int price, String currency) {
        this.price = price;
        this.currency = currency;
    }
    public int getPrice() {
        return price;
    }
    public String getCurrency() {
        return currency;
    }
}
