public class Main {
  public static void main(String[] args) {
    int accountrefill = 800;
    int rublesFor1Bonus = 100;
    int totalBonusRubles = accountrefill / rublesFor1Bonus;
    int totalaccount = accountrefill + totalBonusRubles ;
    if (accountrefill > 1000) {
      System.out.println(totalaccount);
    }else {
      System.out.println(accountrefill);
    }
  }
}

