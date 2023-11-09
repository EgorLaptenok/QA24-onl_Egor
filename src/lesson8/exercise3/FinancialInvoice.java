package lesson8.exercise3;

import java.util.Date;

public class FinancialInvoice extends AbstractDocument{
    private double totalAmount;
    private int departmentCode;

    public FinancialInvoice(int number, Date date, double totalAmount, int departmentCode) {
        super(number, date);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice() {
        super();
        this.totalAmount = 0;
        this.departmentCode = 0;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public void printInfo() {
        System.out.println("Финансовый счет с номером: "+number+"\nДата: "+ date);
        System.out.println("содержит информацию об общей сумме за месяц: " + totalAmount+ " код отдела: "+departmentCode);
        System.out.println(" ");
    }
}
