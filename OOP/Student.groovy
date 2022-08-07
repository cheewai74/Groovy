class Student{

    private int StudentID;
    private String StudentName;

    int Marks1;
    int Marks2;
    int Marks3;

    void setStudentID(int PID){
        StudentID = PID;
    }

    void setStudentName(String pName){
        StudentName = pName;
    }

    int getStudentID() { 
        return StudentID; 
    }

    String getStudentName() { 
        return StudentName;
    }

    // instance methods.
    int Total(){
        return Marks1 + Marks2 + Marks3;
    }

    static void main(String[] args){
        Student st = new Student();
        st.StudentID = 1;
        st.StudentName = "Joe";

        st.Marks1 = 10;
        st.Marks2 = 20;
        st.Marks3 = 30;

        println "StudentID: " + st.getStudentID() + "\nStudentName: " + st.getStudentName();
        println "Total: " + st.Total();
    }
}