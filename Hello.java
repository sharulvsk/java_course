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