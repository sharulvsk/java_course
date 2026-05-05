//Class and Objects: Object-Oriented Programming Concepts
class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b!=0){
            return a/b;
        }
        else{
            return 0;
        }
    }
} 
//Variable Types: Local, Instance, Static
class Student {
    static String college = "ABC";  // static variable
    String name="John";  // instance variable
    public void display(){
        String course="Computer Science";  // local variable
        System.out.println("Course: "+course);
    }

}
//Array of objects
class Employee{
    String name;
    int id;
    void show1(){
        //StringBuffer is mutable, modifies the same object, memory efficient, thread safe, synchronized
        StringBuffer fn1=new StringBuffer();
        System.out.println(fn1);
        System.out.println(fn1.hashCode());
        System.out.println(fn1.capacity());
        fn1.append("Arul,");
        System.out.println(fn1);
        System.out.println(fn1.hashCode());
        System.out.println(fn1.capacity());
        fn1.append("Twin,");
        System.out.println(fn1);
        System.out.println(fn1.hashCode());
        System.out.println(fn1.capacity());
        fn1.reverse();
        System.out.println(fn1);
        System.out.println(fn1.hashCode());
        System.out.println(fn1.capacity());
        fn1.delete(0, fn1.length());
        System.out.println(fn1);
        System.out.println(fn1.hashCode());
        System.out.println(fn1.capacity());
        fn1.insert(0,"Arul");
        System.out.println(fn1);
        System.out.println(fn1.hashCode());
        System.out.println(fn1.capacity());
    }
    void show2(){
        //String is immutable, creates new object for every change, memory inefficient
        String fn2=new String();
        System.out.println(fn2);
        System.out.println(fn2.hashCode());
        fn2="Tom";
        System.out.println(fn2);
        System.out.println(fn2.hashCode());
        fn2="Jerry"+fn2;
        System.out.println(fn2);
        System.out.println(fn2.hashCode());
    }
}

class expense{
    public static void main(String args[]){
        int a=10;
        int b=20;
        Calculator c=new Calculator();
        int sum=c.add(a,b);
        int dif=c.subtract(a, b);
        int mul=c.multiply(a, b);
        int div=c.divide(a, b);
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+dif);
        System.out.println("Product: "+mul);
        System.out.println("Quotient: "+div);
        //Variales behavior
        Student s1=new Student();
        Student s2=new Student();
        //Static variable
        s1.college="XYZ";
        s2.college="PQR";
        System.out.println(s1.college);
        System.out.println(s2.college);
        //Instance variable
        s1.name="Alice";
        s2.name="Bob";
        System.out.println(s1.name);
        System.out.println(s2.name);
        //Local variable
        s1.display();
        s2.display();

        //Array of objects
        Employee ep1=new Employee();
        ep1.name="Abi";
        ep1.id=101;
        Employee ep2=new Employee();
        ep2.name="Babu";
        ep2.id=102;
        Employee[] e=new Employee[2];
        e[0]=ep1;
        e[1]=ep2;
        for(int i=0;i<e.length;i++){
            System.out.println("Name: "+e[i].name);
            System.out.println("Id: "+e[1].id);
        }
        String[] names=new String[2];
        names[0]="Alice";
        names[1]="Bob";
        for(String n:names){
            System.out.println(n);
        }
        String[] years=new String[]{"2020","2021"};
        for(String y:years){
            System.out.println(y);
        }
        Employee emp=new Employee();
        emp.show1();
        emp.show2();
    }
}
class Hello{
    public static void main(String args[]){
        //Conditional Statement-if,else if,else
        int x=10;
        int y=20;
        int z=30;
        if (x>y && x>z){
            System.out.println(x);
        }
        else if (y>z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
        //Ternary Operator
        int a=10;
        int result=0;
        result=a%2==0?a*a:0;
        System.out.println(result);
        //Switch Case
        int day=3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        //Loops-while,do while,for
        int i=1;
        while(i<11){
            System.out.println(i);
            i++;
        }
        for(int j=1;j<=10;j++){
            System.out.println(j);
            j++;
        }
        int k=1;
        do{
            System.out.println("Hi");
            k++;
        }while(k<3);
 
    }
}

