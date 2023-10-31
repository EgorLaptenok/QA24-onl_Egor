package lesson8.exercise3;

import java.util.Date;

public class EmployeeContract extends AbstractDocument{
    private Date endDate;
    private String employeeName;
    public EmployeeContract(){
        super();
        endDate = new Date();
        employeeName = " ";
    }

    public EmployeeContract(int number, Date date, Date endDate, String employeeName) {
        super(number, date);
        this.endDate = endDate;
        this.employeeName = employeeName;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void printInfo() {
        System.out.println("Это трудовой договор с номером: "+number+"\nДата: "+ date+" \nи содержит информацию о "+employeeName);
        System.out.println("Дата окончания договора: "+ endDate);
        System.out.println(" ");
    }
}
