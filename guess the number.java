import java.util.*;
class number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Input the upper and lower limit of the range of numbers
        System.out.println("Enter the range of the number as: lower limit followed by upper limit");
        int low=sc.nextInt();
        int up=sc.nextInt();

        //Finding a random number in the given range
        int num=(int)((Math.random())*((up-low)+1));

        int i;
        int count=0;
        for(int j=0;j<10;j++){//loop to allow 10 rounds for user to play
        System.out.println("Do you want to play? Enter 1 for yes and 0 for no.");
        int choice=sc.nextInt();//Input for the choice, whether the user wants to play the game or not
        if(choice==1){
            count++;//Count the number of rounds played
            for(i=0;i<5;i++){//Loop allowing 5 chances to user in a single round to guess the number
                System.out.println("A number is chosen between "+low+" and "+up+", guess the number in 5 chances: ");
                int guess=sc.nextInt();//Input of the guess
    
                //Checking if the guess is correct or not
                if(guess==num && i<=4){
                    System.out.println("Your guess is correct");
                    break;
                }
                else if(num>guess && i<=4)
                System.out.println("The guess is too low, number is greater than "+guess);
                else if(num<guess && i<=4)
                System.out.println("The guess is too high, number is smaller than "+guess);   
            }     
        }
        else
        break;
    }
        //Giving a score based on the number of rounds played
        if(count==1)
        System.out.println("Your score is 10");
        else if(count>1 && count<=3)
        System.out.println("Your score is 8");
        else if(count>3 && count<=5)
        System.out.println("Your score is 5");
        else
        System.out.println("Your score is 0");
    }
}
