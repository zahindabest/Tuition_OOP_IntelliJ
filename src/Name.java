public class Name{

    private String fname;
    private String lname;
    private String mname;

    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    String SetFName(){
        return fname;  // this - refers to class attributes
    }

    String SetMName(){
        return mname;
    }

    String SetLName(){
        return lname;
    }
}