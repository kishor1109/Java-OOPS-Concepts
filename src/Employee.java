public class Employee {

    //variables
    int E_id;
    String E_name;
    String E_job;
    int E_salary;

    //Methods
    void display(){

        System.out.println(E_salary);
        System.out.println(E_name);
        System.out.println(E_job);
        System.out.println(E_salary);




    }


    public static void main(String[] args){

        Employee emp1=new Employee();
        emp1.E_id=100;
        emp1.E_name="kishor";
        emp1.E_job="Software Engineer";
        emp1.E_salary=30000;

        emp1.display();

    }
}
