public class Student {
    int id;
    String name;
    double marks;

    public Student(int Id, String Name, double Marks) {
        this.id = Id;
        this.name = Name;
        this.marks = Marks;
    }
}

import java.io.*;
import java.util.*;

public class StudentManager {

    String fileName = "experiment .txt";

    public void writeStudent() {
        Scanner scan = new Scanner(System.in);

        try {
            FileWriter writing = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(writing);

            System.out.print(" ID : ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.print(" Name : ");
            String name = scan.nextLine();

            System.out.print(" Marks : ");
            double marks = scan.nextDouble();

            Student s = new Student(id, name, marks);

            bw.write(s.id +" "+ s.name +" "+  s.marks);
            bw.newLine();
            bw.close();

            System.out.println("done");

        } catch (InputMismatchException e) {
            System.out.println("Wrong value");

        } catch (IOException e) {
            System.out.println("Fileissue");

        }
    }

    public void readStudents() {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File not here");
                return;
            }
            BufferedReader bro = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bro.readLine()) != null) {
                System.out.println(line);
            }
            bro.close();
        } catch (IOException e) {
            System.out.println("File issue yr");
        }
    }
}

import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while (true) {
            System.out.println("\n1.Add  2.View  3.Exit");
            int ch = sc.nextInt();

            if (ch == 1)
                sm.writeStudent();
            else if (ch == 2)
                sm.readStudents();
            else
                System.exit(0);
        }
    }
}