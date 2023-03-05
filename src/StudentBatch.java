
public class StudentBatch extends Teacher{
    // data section
    // a StudentBatch is a list of students registered in a batch
    // "list of students"???? an array of Student

    private Teacher ClassSizes = new Teacher();
    private int studentSize = ClassSizes.ClassSize;
    private Student AllStudent[] = new Student[studentSize];
    private int currsz = 0;


    // operation

    public void AddStudent(Student human){ //add student to the list
        if(currsz < studentSize){
            AllStudent[currsz] = human;

            System.out.println("Student: " + AllStudent[currsz].StdName.SetFName() +" " + AllStudent[currsz].StdName.SetMName()+" " + AllStudent[currsz].StdName.SetLName());
            System.out.println("IC: " + AllStudent[currsz].GetIC());
            System.out.println("School: " + AllStudent[currsz].getSchool());
            currsz++;
        }
        else{
            System.out.println("No more Students can be added!!");
        }
    }

    public boolean FindStudent(String fname, String mname, String lname){  // find specific student in the list
        for(int a = 0; a<currsz; a++){
            if(AllStudent[a].StdName.SetFName().equals(fname) && AllStudent[a].StdName.SetMName().equals(mname) && AllStudent[a].StdName.SetLName().equals(lname)){
                System.out.println("Student " +AllStudent[a].StdName.SetFName() + " is Found");
                return true;
            }
        }
        System.out.println("Not Found");
        return false;
    }
}