package IfStatements;

public class Main {
    public static void main(String[] args){
        int age = 19;
        if(age<13){
            System.out.println("Not an adult");
        }else if(age<18){
            System.out.println("Teen");
        }else{
            System.out.print("Adult");
        }
    }
}
