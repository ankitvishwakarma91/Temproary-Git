public class check {

    static{
        System.out.println("STatic block");

        
    }



    void main(String args[]){
        System.out.println( " I am from main ");

        main(5,7);
    }

    void main(int a , int b){

        int n= 5;
        for(int i = 0; i<n; i++){
            System.out.println(i);
        }

        System.out.println("I am from two alu : " + (a + b));

        main(n);
    }

    static void main(int a){
        System.out.println("hello I am overloaded :" + a);
    }
}
