public class Teacher {

    // Teacher Attribute
    protected Name TeacherName;
    private String ic;
    private Address TeacherAddress;
    private int numyearexp;
    private String qualification;
    protected static int ClassSize;

    // operation:
    void SetClassSize(int size){
        ClassSize = size;
    }

    int getClassSize(){
        return ClassSize;
    }

    void SetName(Name name){
        TeacherName = name;
    }

    void SetAddress(Address address){
        TeacherAddress = address;
    }

    void SetExp(int exp){
        numyearexp = exp;
    }

    void SetQual(String qual){
        qualification =qual;
    }

    void SetIC(String IC){
        ic = IC;
    }

}