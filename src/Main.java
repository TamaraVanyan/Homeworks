public class Main {
    public static void main(String[] args) {
        //First task____________________________________________________________________//
        int c;
        int a = 6;
        int b = 8;
        c  = a*a + b*b;
        System.out.println("First task______________________");
        System.out.println("c = a*a + b*b" + " " + "=" + c + " ; " + "where" + " a = " + a +" and " + "b = " + b);

        //Second task____________________________________________________________________//
        a = 10; //sexani himq
        b = 18; // sexani myus himq
        c = 9; // sexani barcrutyun
        System.out.println("Second task______________________");
        System.out.println("The surface of the table with the given dimensions is equal. S = ((a + b)/2)*c" + " = " +
                ((a + b)/2)*c + "; " + "where" + " a = " + a +" and " + "b = " + b +" ; " + "c = " +c);

        //Third task ____________________________________________________________________________//
        int number = 365;
        int firstNumber = number/100;
        int secondNumber = number/10 - firstNumber*10;
        int thirdNumber = number - (firstNumber*10 + secondNumber)*10;
        System.out.println("Third task______________________");
        System.out.println(number + " tvi tvanshannern en` " + "miavor` " + thirdNumber + "; " + "tasnavor` " +
                secondNumber + "; " + "haryuravor` " + firstNumber);
    }
}