public class Main {
  public static void main(String[] args) {
    int accountrefill = 5000;
    int rublesFor1Bonus = 100;
    int totalBonusRubles ;
    int totalaccount ;
    if (accountrefill > 1000) {
      totalBonusRubles = accountrefill/rublesFor1Bonus;
      totalaccount =accountrefill + totalBonusRubles;
            System.out.println(totalaccount);
    }else {
      totalBonusRubles = 0;
      totalaccount = accountrefill;
      System.out.println(totalaccount);
    }
  }
}

