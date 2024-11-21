package com.example.lab1;
import java.util.Scanner;

public class Discriminant{
    public Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int c;
    int result;

    public Discriminant(){
        System.out.print(" \nenter a: ");
        int buff_a = sc.nextInt();
        setA(buff_a);

        System.out.print(" \nenter b: ");
        int buff_b = sc.nextInt();
        setB(buff_b);

        System.out.print(" \nenter c: ");
        int buff_c = sc.nextInt();
        setC(buff_c);
        result = b*b - 4*a*c;
    }
    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}
    public int getResult() {return result;}

    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.b = b;}
    public void setC(int c) {this.c = c;}

}
