package com.company;

public class Main {


    public static void main(String[] args) {
        Calcul c=new Calcul();
        System.out.println("The firsts 40 number of fibonacci sequence");
        c.fibonacci(40);
    }
}

class Calcul{

    void fibonacci(int count){
        int nb1=0, nb2=1, nb3, i;
        System.out.print(nb1+" "+nb2);
        for(i=2; i<count; ++i)
        {
            nb3 = nb1 + nb2;
            System.out.print(" "+nb3);
            nb1 = nb2;
            nb2 = nb3;

        }
    }
}
