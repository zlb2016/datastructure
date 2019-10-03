package java_data;

import java.util.Scanner;

public class HanoiY {
    void Move(char chSour,char chDest){
        System.out.println("Move the top plane of "+chSour+"-->"+chDest);
    }
    void Hanoi(int n,char a,char b,char c){
        if(n==1){
            Move(a,c);
        }else{
            Hanoi(n-1,a,c,b);
            this.Move(a,c);
            Hanoi(n-1,b,a,c);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HanoiY han=new HanoiY();
        han.Hanoi(n,'a','b','c');
    }
}
