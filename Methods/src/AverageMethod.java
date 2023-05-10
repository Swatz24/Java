public class AverageMethod {
    public static void main(String[] args) {
        System.out.println("The average is: " + average(2,5,8));
    }

    public static int sum(int a , int b, int c){
        return a+b+c;
    }
    public static double average(int a, int b, int c){
        int s = sum(a,b,c);
        double avg = s/3;
        return  avg;
    }
}
