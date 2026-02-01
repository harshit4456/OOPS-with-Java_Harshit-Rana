class Student {

    String name;
    int rollno;
    int age;

    Student() {
        name = "Alex";
        rollno = 10;
        age = 20;
    }
    Student(String n, int r, int a) {
        name = n;
        rollno = r;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Priya", 45, 23);

        s1.display();
        s2.display();
    }
}
