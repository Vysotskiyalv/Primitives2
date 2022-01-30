public class Main {
    public static void main(String[] args) {
        int accountrefill = 800;
        int rublesFor1Bonus = 100;
        int totalBonusRubles;
        int totalaccount;
        if (accountrefill > 1000) {
            totalBonusRubles = accountrefill / rublesFor1Bonus;
        } else {
            totalBonusRubles = 0;
        }
        totalaccount = accountrefill + totalBonusRubles;

        System.out.println(totalaccount);
    }
}

