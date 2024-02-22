public class Main {
    public static void main(String[] args) {
        
        int initialAmmount = 12;
        int refillAmount = 1593;
        boolean bonusActivation = refillAmount > 1000;

        int bonus = bonusActivation ? refillAmount/100 : 0;
        int ammountOnAccount = initialAmmount + refillAmount + bonus;

        System.out.println("Сумма на счете: " + ammountOnAccount);
        System.out.println("Из них бонусы: " + bonus);
    }
}