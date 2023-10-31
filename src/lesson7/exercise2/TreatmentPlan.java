package lesson7.exercise2;

public class TreatmentPlan {
    Dentist dentist;
    Therapist therapist;
    Surgeon surgeon;
    public void plan(int treatmentPlan){
        switch (treatmentPlan){
            case 1:
                System.out.println("Ваш план лечения");
                System.out.println("Удалить зуб, не кушать пару часов после удаления, пить больше воды");
                dentist.info();
                break;
            case 2:
                System.out.println("Ваш план лечения");
                System.out.println("Вырезать аппендицит, вас кладут в больницу и вы будете под осмотром в течение 3-х дней");
                surgeon.info();
                break;
            case 3:
                System.out.println("Ваш план лечения");
                System.out.println("Пшикать горло три раза в день спреем\"тантум верде\", приди на повторное обследование через 3 дня");
                therapist.info();
                break;
            default:
                System.out.println("Вы здоровы");
        }
    }
    TreatmentPlan(){
        dentist = new Dentist();
        surgeon = new Surgeon();
        therapist = new Therapist();
    }
}
