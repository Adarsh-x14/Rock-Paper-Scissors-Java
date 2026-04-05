import java.util.*;
public class RockPaperScissor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random R = new Random();
        
        String arr[] = {"Rock ","Paper ","Sizer "};
        System.out.println("press the button \n0 for Rock \n1 for Paper \n2 for Sizer");
        int attempt =0;
        int com =0;
        int round = 0;
        int  userwin =0;
        int computerwin =0;

        while(round != 5){
            
            int Computer = R.nextInt(3);
            int user = sc.nextInt();
            round++;
            System.out.println("__________________________________________________________________");
             if(user < 0 || user > 2){
              System.out.println("Invalid input");
              continue;
             }
        

        System.out.println();

        if(user == Computer){
            System.out.println("Draw the match\n");
            System.out.println("you choose "+arr[user]+"\ncomputer choose "+arr[Computer]);
            System.out.println();
        }
        else if (user == 0 & Computer == 1 || user == 1 & Computer == 2 || user == 2 & Computer == 1){
            System.out.println("You losse -----------------!\n");
            System.out.println("you choose "+arr[user]+"\ncomputer choose "+arr[Computer]);
            System.out.println();
            computerwin++;
           
        }
        else{
            System.out.println("You win -----------------!\n");
             System.out.println("you choose "+arr[user]+"\ncomputer choose "+arr[Computer]);
             System.out.println();
             userwin++;
            
        }
    }
    System.out.println("In 5 round you win "+userwin+ " round "+ "and computer win "+computerwin );
    System.out.println();

        
        

    }

}