package lesson8.exercise3;

import java.util.Date;

abstract public class AbstractDocument implements Document {
    protected int number;
    protected Date date;

    public AbstractDocument(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    public AbstractDocument() {
        number = 0;
        date = new Date();
    }

    @Override
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
