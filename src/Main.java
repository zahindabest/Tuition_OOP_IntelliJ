import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    // application code
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final DecimalFormat decfor = new DecimalFormat("0.00");


        //TuitionCenter
        TuitionCenter Tuition = new TuitionCenter();
        Address TuitionAddress = new Address("jalan b", "342897", "seri ayam", "kelantan", "malaysia");
        Tuition.setAddress(TuitionAddress);

        //-------------------------------------------------------------------------
        //headmaster: Jack
        headmasterList batch1 = new headmasterList();

        headmaster jack = new headmaster();
        Name headmasterName = new Name("Jack", "Hammer", "Gordon");
        Address jackAddress = new Address("123", "564", "kota bharu", "kelantan", "Malaysia");
        jack.SetName(headmasterName);
        jack.SetIC("092683745");
        jack.SetAddress(jackAddress);

        System.out.println("Tuition Address: " + Tuition.getAddress().getStreet()+ ","+Tuition.getAddress().getPostcode()+ ","+Tuition.getAddress().getDistrict());
        System.out.println("Headmaster Name: "+ jack.name.SetFName() +" " + jack.name.SetMName()+" " + jack.name.SetLName());
        System.out.println("-------------------------------\n");


        batch1.addHeadmaster(jack);
        // attributes for student mark
        float total =0;
        float average;

        //new teacher batch 1
        TeacherBatch T1 = new TeacherBatch();

        // Teacher Abu
        Teacher abu = new Teacher();
        abu.SetClassSize(4);
        Name teachername = new Name("abu", "bakar", "siddiq");
        abu.SetName(teachername);
        T1.AddTeacher(abu);
        Address teacherAddress = new Address("Jalan A", "345", "besut", "trg", "Malaysia");
        System.out.println("Class Size: "+ abu.getClassSize());
        System.out.println("-------------------------------\n");

        // Object for the first class
        StudentBatch class1 = new StudentBatch();

        //Student : zahin
        Student zahin = new Student();
        Name studentName = new Name("Zahin", "Aiman", "Cena");
        zahin.SetName(studentName);
        zahin.SetSchool("SMKTM");
        zahin.SetIC("3405896");
        Address studentAddress = new Address("Jalan 123", "2345", "jerteh", "trg", "Malaysia");
        class1.AddStudent(zahin);

        // input marks
        for(int i = 0; i < 3; i++) {
            boolean validInput = false;
            float mark = 0;
            while (!validInput) {
                try {
                    System.out.println("Enter Marks #" + (i+1) + ": ");
                    mark = Float.parseFloat(input.nextLine());
                    if (mark < 0 || mark > 100) {
                        throw new Exception("Error: mark must be between 0 and 100.");
                    }
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a float value.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            zahin.SetMark(mark, i);
        }
        System.out.println("-------------------------------\n");
        //display student report
        zahin.displayMarks();
        total+= zahin.calcTotalMark();
        average = zahin.calcAvg();

        System.out.println("Average: "+ decfor.format(average));
        System.out.println("Max: " + zahin.calcMax());
        System.out.println("Min: " + zahin.calcMin());

        //finding the student
        class1.FindStudent("Zahin", "Aiman", "Cena");
    }
}
