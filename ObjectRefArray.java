class Student 
{
    int rollno;
    String name;
    int marks;

    Student( int rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class ObjectRefArray {
    
    public static void main(String[] args) {
        Student student[] = new Student[3];

        student[0]  = new Student(1, "Oshini", 96);
        student[1]  = new Student(2, "Roshell", 80);
        student[2]  = new Student(3, "Mishell", 83);

        for(Student stud: student)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}
