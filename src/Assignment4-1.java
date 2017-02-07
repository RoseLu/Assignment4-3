/**
 * Created by Kevin on 2/6/2017.
 */

class Student {

    private String name;
    private int ID;

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public Student(String name, int ID) {
        setName(name);
        setID(ID);
    }
}

class Course {

    private String name;

    private int numberOfStudent;
    private int maxStudent = 10;
    private String[] arrayStudent = new String[10];

    private int count = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public Course(String name) {
        setName(name);
    }

    public String[] getStudents() {
        return arrayStudent;
    }

    public void getStudent() {
        System.out.println("------------------------");
        System.out.println("Course Name: " + getName());
        System.out.println();
        System.out.println("Name:");
        for (int i = 0; i < count; i++) {
            System.out.println(arrayStudent[i]);
        }
        System.out.println("------------------------");
    }

    public boolean isFull() {
        if (arrayStudent[9] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void registerStudent(Student student) {
        if (!isFull()) {
            arrayStudent[count] = student.getName();
            count++;
        } else {
            System.out.println("Sry, this course is full.");
        }
    }
}
