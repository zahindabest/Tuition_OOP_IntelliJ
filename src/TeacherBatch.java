public class TeacherBatch extends Teacher{

    private Teacher AllTeacher[] = new Teacher[3];
    private int currsz =0;

    void AddTeacher(Teacher t){
        if(currsz < 3){
            for(int i =0; i < 1; i++){
                AllTeacher[i] = t;
                System.out.println("Teacher: " + AllTeacher[i].TeacherName.SetFName()+" "+AllTeacher[i].TeacherName.SetMName()+" " +AllTeacher[i].TeacherName.SetLName());
            }
        }
        else System.out.println("No more teacher can be added!!");

    }
}