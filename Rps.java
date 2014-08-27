import java.util.Scanner;
public class Rps{
    public static void main(String []args){
        Scanner s = new Scanner (System.in);
        System.out.println("rock, paper, scissors?");
        String user = s.next().toLowerCase();
        double comp = Math.random();
        String a = "rock";
        String b = "paper";
        String c = "scissors";
        if (comp <= 0.33333){
            System.out.println("Computer Choose: rock");
            if (a.equals(user)){
                System.out.println("Draw!");
            }
            if (b.equals(user)){
                System.out.println("User Wins!");
            }
            if(c.equals(user)){
                System.out.println("Computer Wins!");
            }
        }
        else if (comp <= 0.66666 && comp > 0.33333){
            System.out.println("Computer Choose: paper");
            if (a.equals(user)){
                System.out.println("Computer Wins!");
            }
            if (b.equals(user)){
                System.out.println("Draw!");
            }
            if(c.equals(user)){
                System.out.println("User Wins!");
            }
        }
        else if (comp > 0.66666){
            System.out.println("Computer Choose: scissors");
            if (a.equals(user)){
                System.out.println("User Wins!");
            }
            if (b.equals(user)){
                System.out.println("Computer Wins!");
            }
            if(c.equals(user)){
                System.out.println("Draw!");
            }
        }
    }
}
