package SchoolManagement;

/** This class is used for tracking all the student details.
* Like student name, ID, Grade, Total Fees, Fees Paid */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


  /**
   * To create new student by initializing
   * id should be unique for each student.
   * Fees for every Student is $30,000
   * Fees paid when initializing is $0
   */
    public Student(int id, String name,  int grade) {

        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;
    }

    /**
     * Used to update student's grade.
     * @param grade new grade for student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to feespaid and the school is going to receive the funds.
     * @param fees - The fees that the student paid.
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    //return remaining fees
    public int getRemainingFees() {
        return feesTotal -= feesPaid;
    }

    @Override
    public String toString() {
        return "Student name: " + name + " \n" +
                "Total fees paid so far: $" + feesPaid ;
    }
}


