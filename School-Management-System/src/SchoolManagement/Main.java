package SchoolManagement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher heather = new Teacher(1, "Heather", 500);
        Teacher mary = new Teacher(2, "Mary", 700);
        Teacher ankur = new Teacher(3, "Ankur", 500);
        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(heather);
        teacherList.add(mary);
        teacherList.add(ankur);


        Student trisha = new Student(1,"Trisha", 4);
        Student vidya = new Student(2,"Vidya", 2);
        Student afsheen = new Student(3,"Afsheen", 8);
        List<Student> studentList = new ArrayList<>();

        studentList.add(trisha);
        studentList.add(vidya);
        studentList.add(afsheen);

        School newSchool = new School(teacherList, studentList);

        // Adding new teacher to the school.
        Teacher megan = new Teacher(4, "Megan", 1000);
        newSchool.addTeacher(megan);

        //Adding new student to the school.
        Student arun = new Student(4,"Arun", 5);
        newSchool.addStudent(arun);

        System.out.println("----------New School Established------------");
        System.out.println("New School has earned : $" + newSchool.getTotalMoneyEarned());
        System.out.println("-----------New School earnings after receiving the fees from few students-----------------");
        System.out.println("Trisha paid $2000 school fees");
        trisha.payFees(2000);
        System.out.println("New School has earned : $" + newSchool.getTotalMoneyEarned());
        System.out.println("Vidya paid $5000 school fees");
        vidya.payFees(5000);
        System.out.println("New School has earned : $" + newSchool.getTotalMoneyEarned());
        System.out.println("Afsheen paid $7000 school fees");
        afsheen.payFees(7000);
        System.out.println("New School has earned : $" + newSchool.getTotalMoneyEarned());

        System.out.println("--------------Making New School pay salary for the teachers-------");

        heather.receiveSalary(heather.getSalary());
        System.out.println(heather.getName() + "'s salary is $" + heather.getSalary());
        System.out.println("New School has spend money to pay the salary for " + heather.getName() + " and now has $ " +
                newSchool.getTotalMoneyEarned());

        mary.receiveSalary(mary.getSalary());
        System.out.println(mary.getName() + "'s salary is $" + mary.getSalary());
        System.out.println("New School has spend money to pay the salary for " + mary.getName() + " and now has $ " +
                newSchool.getTotalMoneyEarned());

        ankur.receiveSalary(ankur.getSalary());
        System.out.println(ankur.getName() + "'s salary is $" + ankur.getSalary());
        System.out.println("New School has spend money to pay the salary for " + ankur.getName() + " and now has $ " +
                newSchool.getTotalMoneyEarned());

        System.out.println("----------Teacher Information----------------");
        for (Teacher teacher: teacherList){
            System.out.println(teacher);
        }



        System.out.println("----------Student Information----------------");
        for (Student student: studentList){
            System.out.println(student);
        }





    }
}
