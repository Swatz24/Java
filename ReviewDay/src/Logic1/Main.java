package Logic1;

public class Main {
    public static void main(String[] args){

        Quiz q = new Quiz();

        System.out.println("It's Summer !! Will the squirrel play outside??");
        System.out.println("Temp is 95: " + q.squirrelPlay(95, true));
        System.out.println("Temp is 105: " + q.squirrelPlay(105, true));
        System.out.println("Temp is 55: " + q.squirrelPlay(55, true));
        System.out.println();

        System.out.println("It's not Summer !! Will the squirrel play outside??");
        System.out.println("Temp is 95: " + q.squirrelPlay(95, false));
        System.out.println("Temp is 105: " + q.squirrelPlay(105, false));
        System.out.println("Temp is 65: " + q.squirrelPlay(65, false));
        System.out.println("Temp is 90: " + q.squirrelPlay(90, false));
        System.out.println();

        System.out.println("Tea Party time!!!");
        System.out.println("Party ratings: \n 0 - Bad :( \n 1 - Good :) \n 2 - Great :D ");
        System.out.println("Party has 3 tea and 2 candy, How's the party going? " + q.teaParty(3,2));
        System.out.println("Party has 6 tea and 8 candy, How's the party going? " + q.teaParty(6,8));
        System.out.println("Party has 7 tea and 18 candy, How's the party going? " + q.teaParty(7,18));

        System.out.println();
        System.out.println("Calling!!!!!! Will you attend the call?");
        System.out.println("It is morning and it is your mom calling and you are not asleep " + q.answerCell(true,true,false));
        System.out.println("It is morning and you are asleep " + q.answerCell(true,false,true));
        System.out.println("It is morning and you are awake but it is not your mom calling. " + q.answerCell(true,false,false));
        System.out.println("It is not morning and you are awake but it is not your mom calling. " + q.answerCell(false,false,false));
        System.out.println();

        System.out.println("6 is a great number!!");
        System.out.println("(2,4) " + q.love6(2,4));
        System.out.println("(12,6)" + q.love6(12,6));
        System.out.println("(6,1)" + q.love6(6,1));
        System.out.println("(2,5)" + q.love6(2,5));
        System.out.println("(1,7)" + q.love6(1,7));

    }
}
