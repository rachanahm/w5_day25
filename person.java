class Person {
  String name;
  String gender;
  int age;
  String address;
}
class Student extends Person {
  int id;
  double sub1;
  double sub2;
  double sub3;
  double average() {
    return (sub1+sub2+sub3)/3;
  }
  double percentage() {
    return ((sub1+sub2+sub3)/300)*100;
  }
  void displayProperties() {
     System.out.println(name + " " + gender + " " + age+ " " +address+" "+ id);
  }
}
public class Studentinheritance {
  public static void main(String args[]) {
    Student s1= new Student();
    s1.name = "Alvin";
    s1.gender = "MALE";
    s1.age=24;
    s1.address="Bangalore";
    s1.id=123;
    s1.sub1=56;
    s1.sub2=76;
    s1.sub3=86;
    s1.displayProperties();
    System.out.printf("Average:%.2f\n",s1.average());
    System.out.printf("Percentage:%.2f\n",s1.percentage());
  }
}class Person{
    String name;
    int age;
}
class Employee extends Person{
    double salary;
    String position;
}
class Engineer extends Employee{
    String specialization;
    void solve_problem(){
        System.out.println("Problem solved!");
    }
}
class Manager extends Employee{
    int num_reports;

 

    void hire_employee(){
        num_reports++;
    }
}

 

public class HybridInheritance{
    public static void main(String[] args){
        Engineer engineer=new Engineer();
        engineer.solve_problem();
    }
}