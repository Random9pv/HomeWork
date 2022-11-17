package HomeWork;

public class task05 {
    public static void main(String[] args) {
        boolean HasGuel =false;
        boolean hasElectricProblem = true;
        boolean hasMotorProblem = true;
        boolean hasTransmossion = true;
        boolean hasWhellProblem = false;
        int HasGuelsum=1000;
        int hasElectricProblemSum=5000;
        int hasMotorProblemSum=10000;
        int hasTransmossionSum=4000;
        int hasWhellProblemSum=2000;
        double  MotorTracnEletricSum=19000;
        int sum=0;
        int chetchik=0;

        boolean variant1 = hasElectricProblem || hasMotorProblem || hasTransmossion || hasWhellProblem;
        if (HasGuel && !variant1) {
            System.out.println("нет бензина  и ничего не сломано, отдают машину и берут" + " " + HasGuelsum);
        } else if (hasMotorProblem & !(HasGuel || hasElectricProblem || hasTransmossion || hasWhellProblem)) {
            System.out.println("чинят мотор и берут" + " " + hasMotorProblemSum);
        } else if (hasElectricProblem && !(HasGuel || hasTransmossion || hasWhellProblem || hasMotorProblem)) {
            System.out.println("чинят элекрику и берут" + " " + hasElectricProblemSum);
        } else if (hasTransmossion && !(HasGuel || hasElectricProblem || hasWhellProblem || hasMotorProblem)) {
            System.out.println("чинят трансмиссию и берут" + " " + hasTransmossionSum);
        } else if (hasWhellProblem) {
            System.out.println("чинят колеса и берут" + " " + hasWhellProblemSum);
        }
        else if (hasTransmossion && (hasElectricProblem && hasMotorProblem)) {
            System.out.println("Если проблема  с двигателем, трансмиссией и мотором счет равен" +
                    (MotorTracnEletricSum = MotorTracnEletricSum - ( MotorTracnEletricSum* 0.2)));
        } else if (HasGuel && variant1) {
            System.out.println("Если нет бензина и что то сломано, за консультацию денег не  берут");
        }
        if (hasElectricProblem) {
            sum =hasElectricProblemSum;
            chetchik++;
        }
        if (hasMotorProblem){
            sum+=hasMotorProblemSum;
            chetchik++;
        }
        if (hasTransmossion){
            sum+=hasTransmossionSum;
            chetchik++;
        }
        if (hasWhellProblem){
            sum+=hasWhellProblemSum;
            chetchik++;
        }
        if (chetchik==2){
            double skidka = sum*0.1;
            double chetRemonta = sum-skidka;
            System.out.println(" у вас нету бензина  и сломалось 2 детали, скидка равна 10 %, сумма счета равна"
                    + " " + chetRemonta);
        }


    }


}
