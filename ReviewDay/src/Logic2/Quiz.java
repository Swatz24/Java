package Logic2;

public class Quiz {
    public int makeChocolate(int small, int big, int goal) {
        int actualKilo = small + (5 * big);

        // if small + big is less than required goal, return 0
        if(actualKilo < goal){
            return -1;

            // if we don't have enough small to add to the big, return -1
        }else if( small < goal%5)
        {
            return -1;
        }

        // we have enough small to add to big to make the goal, so return goal%5
        else if((big * 5) > goal)
        {
            return goal % 5;
        }

        // otherwise,  return the small entirely,
        else
        {
            return goal - big * 5;
        }

    }
}
