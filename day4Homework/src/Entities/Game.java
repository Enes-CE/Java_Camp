package Entities;

public class Game {
    private int id;
    private double price;
    private int percentDiscount;
    private double salePrice;
    private String gameName;
    private String detail;

    public Game() {
    }

    public Game(int id, double price, int percentDiscount, double salePrice, String gameName, String detail) {
        this.id = id;
        this.price = price;
        this.percentDiscount = percentDiscount;
        this.salePrice = salePrice;
        this.gameName = gameName;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

