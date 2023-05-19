package Logic1;

public class Quiz {
    public boolean squirrelPlay(int temp, boolean isSummer) {

        // It is not summer, and temp is between 60 & 90 (inclusive)
        if(!isSummer && (temp >=60 && temp <=90 )){
            // squirrel will play outside
            return true;
            // In summer, temp range is between 60 and 100
        }else if(isSummer && (temp >= 60 && temp <=100) ){
            return true;
        }
        // all other cases, squirrel won't play outside.
        else{
            return false;
        }
    }

    public int teaParty(int tea, int candy) {

        /* Check if the party is great by checking if tea & candy are atleast 5 above and either one is double of the other. if yes, return 2.
        If not, check whether both candy and tea are atleast 5 each, then it's a good party, return 1
        If both the cases are false, it means, both tean and candy are less than 5, which means it's a bad party, return 0.
        */
        if(tea >= 5 && candy >= 5 && (tea >= 2* candy || candy >= 2* tea)){
            return 2;
        }else if(tea >= 5 && candy >=5){
            return 1;
        }
        else
            return 0;

    }

    /*
        Your cell phone rings. Return true if you should answer it.
         Normally you answer, except in the morning you only answer if it is your mom calling.
          In all cases, if you are asleep, you do not answer.

        answerCell(false, false, false) → true
        answerCell(false, false, true) → false
        answerCell(true, false, false) → false

     */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        // if asleep don't attend call
        if (isAsleep){
            return false;
        }
        // if not asleep but it's morning, attend Mom's call
        else if (!isAsleep && isMorning && !isMom){
            return false;
            // if not asleep , and it's morning, and not mom's call, dont attend call. if it's not morning, then attend all calls, if awake.
        }else{
            return true;
        }
    }

            /*   The number 6 is a truly great number.
            Given two int values, a and b, return true if either one is 6.
            Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
              love6(6, 4) → true
              love6(4, 5) → false
              love6(1, 5) → true
     */
            public boolean love6(int a, int b) {
                // check if either a or b is == 6, if yes, return true
                if(a==6 || b==6){
                    return true;
                    // if a+b is 6, return true
                }else if(a+b ==6){
                    return true;
                  //  if a-b is 6, return true.
                } else if(Math.abs(a-b) ==6){
                    return true;
                }
                return false;

            }
}
