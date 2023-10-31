package lesson8.exercise3;

import java.util.Date;

public class SupplyContract extends AbstractDocument{
    private String goodsType;
    private int goodsQuantity;

    public SupplyContract() {
        super();
        this.goodsType = " ";
        this.goodsQuantity = 0;
    }

    public SupplyContract(int number, Date date, String goodsType, int goodsQuantity) {
        super(number, date);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public int getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(int goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    @Override
    public void printInfo() {
        System.out.println("Это договор поставки с номером: "+ number + "\nдата: "+date);
        System.out.println("содержит информацию о "+goodsType + " и "+ goodsQuantity);
        System.out.println(" ");
    }
}
