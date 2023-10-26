package lesson7.exercise2;

import java.util.Scanner;

public class Clinic {
    Dentist dentist;
    Surgeon surgeon;
    Therapist therapist;
    public Clinic(){
        dentist = new Dentist();
        surgeon = new Surgeon();
        therapist = new Therapist();
    }
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
                dentist.info();
                dentist.treatmentMethod();
                treatmentPlan.plan(1);
                break;
            case 2:
                patient.info();
                surgeon.info();
                surgeon.treatmentMethod();
                treatmentPlan.plan(2);
                break;
            default:
                patient.info();
                therapist.info();
                therapist.treatmentMethod();
                treatmentPlan.plan(3);
                break;
        }

    }

}
