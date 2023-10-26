package lesson7.exercise2;

public class TreatmentPlan {
    public void plan(int treatmentPlan){
        switch (treatmentPlan){
            case 1:
                System.out.println("Ваш план лечения");
                System.out.println("Не кушать пару часов после удаления, пить больше воды");
                break;
            case 2:
                System.out.println("Ваш план лечения");
                System.out.println("Вас кладут в больницу и вы будете под осмотром в течение 3-х дней");
                break;
            case 3:
                System.out.println("Ваш план лечения");
                System.out.println("Пшикать горло три раза в день спреем\"тантум верде\", приди на повторное обследование через 3 дня");
                break;
            default:
                System.out.println("Вы здоровы");
        }
    }
    TreatmentPlan(){

    }
}
