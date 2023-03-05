// created by team in KL
public class Student {
    // data/attributes

    Name StdName;
    private Address StudentAddress;
    private String ic;
    private String schoolname;
    private final float[] marks = new float[3];
    private float TotalMark = 0;
    private float max = -1;
    private float min = 101;
    private float average;


    // These are the methods or operations of the Student class
    // A method to set the student's name
    void SetName(Name name){
        StdName = name;
    }

    // A method to set the student's address
    void SetAddress(Address address){
        StudentAddress = address;
    }

    // A method to set the student's identification card number
    void SetIC(String IC){
        ic= IC;
    }

    // A method to get the student's identification card number
    String GetIC(){
        return ic;
    }

    // A method to set the student's school name
    void SetSchool(String school){
        schoolname = school;
    }

    // A method to get the student's school name
    String getSchool(){
        return schoolname;
    }

    // A method to display the student's marks
    void displayMarks(){
        System.out.println("Student: " + StdName.SetFName()+" " + StdName.SetMName()+" " + StdName.SetLName());
        System.out.println("");
        for(int i = 0; i < marks.length; i++){
            System.out.println("Mark #" + (i+1)+ " :" + marks[i]);
        }
        System.out.println("-------------------------------\n");
    }

    // A method to set the student's marks for a subject
    void SetMark(float mark, int i){
        marks[i] = mark;
    }

    // A method to calculate the total marks of the student
    float calcTotalMark(){
        for(int i  = 0; i < marks.length; i++){
            TotalMark += marks[i];
        }
        System.out.println("Total Mark For "+ marks.length + " = "+ TotalMark);
        return TotalMark;
    }

    // A method to calculate the maximum marks of the student
    float calcMax(){
        for(int i  = 0; i < marks.length; i++){
            if(max < marks[i]){
                max = marks[i];
            }
        }
        return max;
    }

    // A method to calculate the minimum marks of the student
    float calcMin(){
        for(int i  = 0; i < marks.length; i++){
            if(min > marks[i]){
                min = marks[i];
            }
        }
        return min;
    }

    // A method to calculate the average marks of the student
    float calcAvg(){
        average = TotalMark / marks.length;
        return average;
    }
}