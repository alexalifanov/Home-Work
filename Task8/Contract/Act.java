package Task8.Contract;

import java.util.Date;

public class Act {
    private int num;
    private Date date;
    private String[] page;
    public Act(int num, Date date, String[] page){
        this.num = num;
        this.date = date;
        this.page = page;
    }
    public static Act contractToAct(Contract contract){
        return  new Act(contract.getNum(), contract.getDate(), contract.getPriceList());
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
    public String[] getPage() {
        return page;
    }
    public void setPage(String[] page) {
        this.page = page;
    }
}
