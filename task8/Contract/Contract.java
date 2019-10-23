package task8.Contract;

import java.util.Date;

public class Contract {
    private int num;
    private Date date;
    private String[] priceList;
    public Contract(int num, Date date,String[] priceList){
        this.num = num;
        this.date = date;
        this.priceList = priceList;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String[] getPriceList() {
        return priceList;
    }
    public void setPriceList(String[] priceList) {
        this.priceList = priceList;
    }
}
