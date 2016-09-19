package util;
/**
 * Created by SchubertDavidRodriguez on 9/19/16.
 */
public  class FizzBuzzUtil {

    /*
    * Method to evaluate a number in FizzBuzz game
    * @Params:
    * number: Integer - Number to be evaluated
    * @Return:
    * String: Return a message with the evaluation
    * @author Schubert D. Rodriguez
    * */
    public static String evaluateFizzBuzz(Integer number){
        try {
            boolean isFizz = number%3==0;
            boolean isBuzz = number%5==0;
            String message="";
            if(isFizz) {
                message = "Fizz";
            }
            if(isBuzz){
                message += "Buzz";
            }
            if(!(isFizz || isBuzz)){
                message = number.toString();
            }
            return  message;
        }catch (ClassCastException e){
            throw e;
        }
    }

}
