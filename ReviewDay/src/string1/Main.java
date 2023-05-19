package string1;

public class Main {
    public static void main(String[] args){
        Quiz3 q = new Quiz3();

        System.out.println("Does the string 'redXYZ start with color 'red'? " );
        System.out.println("Print red if true, else return nothing");

        System.out.println(q.seeColor("redXYZ"));

        System.out.println("Does the string 'ZZredXYZ start with color 'red'? " );
        System.out.println("Print red if true, else return nothing");

        System.out.println(q.seeColor("ZZredXYZ"));


        System.out.println("Does the string 'ZZblueXYZ start with color 'blue'? " );
        System.out.println("Print blue if true, else return nothing");

        System.out.println(q.seeColor("ZZblueXYZ"));

        System.out.println("Does the string 'blueXYZ start with color 'blue'? " );
        System.out.println("Print blue if true, else return nothing");

        System.out.println(q.seeColor("blueXYZ"));
    }
}
