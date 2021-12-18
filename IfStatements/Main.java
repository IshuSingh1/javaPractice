package IfStatements;

public class Main {
    public static void main(String[] args){
        int age = 17;
        if(age>=18){
            System.out.println("Adult");
        }else if(age<18){
            System.out.println("Not an adult");
        }else{
            System.out.print("Invalid");
        }
    }
}
