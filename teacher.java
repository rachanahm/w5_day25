class Teacher{
    String designation="ComputerTeacher";
    String collegeName="IIT";

 

    void work(){
        
    }
}
class ComputerTeacher extends Teacher{
    
}
public class Teachers{
    public static void main(String[] args){
        ComputerTeacher ct=new ComputerTeacher();
        System.out.println("Designation : "+ct.designation);
        System.out.println("College : "+ct.collegeName);
    }
}