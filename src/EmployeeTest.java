//import java.io.*;

public class EmployeeTest {
    public static void main(String []args){
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");
        Employee a;

        empOne.empAge(26);
        empOne.empDesignation("prime programmer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("lower programmer");
        empTwo.empSalary(100);
        empTwo.printEmployee();
    }
}
