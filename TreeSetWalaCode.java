package java_Assignments;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetWalaCode {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);

        EmpFTS emp1=new EmpFTS("Subrat",33,"RB",70000);
        EmpFTS emp2=new EmpFTS("Sergio",11,"RB",49000);
        EmpFTS emp3=new EmpFTS("Lewis",44,"Merc",55000);
        EmpFTS emp4=new EmpFTS("Bottas",77,"Merc",45000);
        EmpFTS emp5=new EmpFTS("Norris",4,"McL",30000);
        EmpFTS emp6=new EmpFTS("Charles",16,"Fer",41000);
        EmpFTS emp7=new EmpFTS("Carlos",55,"Fer",40000);
        EmpFTS emp8=new EmpFTS("Daniel",3,"Mcl",35000);
        EmpFTS emp9=new EmpFTS("Gasly",10,"AT",39000);
        EmpFTS emp10=new EmpFTS("Alonso",14,"Alp",38000);

        System.out.println("Enter option : \na) ID \nb) Name \nc) Department \nd) Salary");
        String res= ip.next();
        if(res.equalsIgnoreCase("a")){
            TreeSet<EmpFTS> emp = new TreeSet<EmpFTS>(new myIdComparator());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            emp.add(emp7);
            emp.add(emp8);
            emp.add(emp9);
            emp.add(emp10);
            System.out.println("Sorting by ID...");

            for(EmpFTS a:emp){
                System.out.println("ID: "+a.getId()+", Name: "+a.getName()+", Dept: "+a.getDept()+", Salary: "+a.getSal());
            }
        }
        else if(res.equalsIgnoreCase("b")){
            TreeSet<EmpFTS> emp = new TreeSet<EmpFTS>(new myNameComparator());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            emp.add(emp7);
            emp.add(emp8);
            emp.add(emp9);
            emp.add(emp10);
            System.out.println("Sorting by name...");
            for(EmpFTS a:emp){
                System.out.println("Name: "+a.getName()+", ID: "+a.getId()+", Dept: "+a.getDept()+", Salary: "+a.getSal());
            }
        }
        else if(res.equalsIgnoreCase("c")){
            TreeSet<EmpFTS> emp = new TreeSet<EmpFTS>(new myDeptComparator());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            emp.add(emp7);
            emp.add(emp8);
            emp.add(emp9);
            emp.add(emp10);
            System.out.println("Sorting by Department...");

            for(EmpFTS a:emp){
                System.out.println("Dept: "+a.getDept()+", Name: "+a.getName()+", ID: "+a.getId()+", Salary: "+a.getSal());
            }
        }
        else if(res.equalsIgnoreCase("d")){
            TreeSet<EmpFTS> emp = new TreeSet<EmpFTS>(new mySalComparator());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            emp.add(emp7);
            emp.add(emp8);
            emp.add(emp9);
            emp.add(emp10);
            System.out.println("Sorting by Salary...");

            for(EmpFTS a:emp){
                System.out.println("Salary: "+a.getSal()+", Name: "+a.getName()+", ID: "+a.getId()+", Dept: "+a.getDept());
            }

        }

    }
}
class EmpFTS {

    private String name;
    private int id;
    private String Dept;
    private float salary;

    public EmpFTS(String name, int id,String Dept, float salary)
    {
        this.name = name;
        this.id = id;
        this.Dept=Dept;
        this.salary=salary;
    }

    public EmpFTS() {}

    public String getName() { return name; }
    public String getDept() { return Dept; }
    public float getSal() { return salary; }
    public int getId() { return id; }

}

class myNameComparator implements Comparator<EmpFTS> {
    public int compare(EmpFTS s1, EmpFTS s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class myIdComparator implements Comparator<EmpFTS> {
    public int compare(EmpFTS s1, EmpFTS s2) {
        return s1.getId()-s2.getId();
    }
}

class myDeptComparator implements Comparator<EmpFTS> {
    public int compare(EmpFTS s1, EmpFTS s2){
        return s1.getDept().compareTo(s2.getDept());
    }
}

class mySalComparator implements Comparator<EmpFTS> {
    public int compare(EmpFTS s1, EmpFTS s2) {
        return (int) (s1.getSal()-s2.getSal());
    }
}