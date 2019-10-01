package Task7;

public enum MenuSheet {
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
    public int getPrice() {
        return price;
    }
    public String getCurrency() {
        return currency;
    }
      MenuSheet(int price, String currency) {
        this.price = price;
        this.currency = currency;
    }
}


