package lesson7.exercise2;

import java.util.Scanner;

public class Clinic {

    public void treatment(){
        Patient patient=new Patient();
        Scanner scanner=new Scanner(System.in);
        TreatmentPlan treatmentPlan = new TreatmentPlan();
        System.out.println("Ведите ваше имя");
        String name = scanner.next();
        patient.setName(name);
        System.out.println("Ведите ваш возраст");
        int age = scanner.nextInt();
        patient.setAge(age);
        System.out.println("Выберете что вас беспокоит");
        System.out.println("1.Зубы \n2.Боли в теле \n3.Не знаете");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                patient.info();
                treatmentPlan.plan(1);
                break;
            case 2:
                patient.info();
                treatmentPlan.plan(2);
                break;
            default:
                patient.info();
                treatmentPlan.plan(3);
                break;
        }

    }

}
