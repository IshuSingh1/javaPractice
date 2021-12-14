package Expressions;

public class Main {
    public static void main(String[] args){
        int friends = 10;
        friends++;
        friends = friends %2;
        friends = friends *20;
        friends = friends /2;
        friends--;
        print(friends);
    }

    static void print(int friends){
        System.out.println("Friends: "+ friends);
    }
}
