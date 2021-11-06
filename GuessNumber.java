import java.util.Scanner;
class GuessNumber{
    public static void main(String args[]){
        //small project
        int myNumber =(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int userNumber =0;
        do{
            System.out.println("Guess my Number(1 to 100):");
            
            userNumber=sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("WHooHoo....CORRECT NUMBER!!!.");
                break;
            }
            else if(userNumber>myNumber){
                System.out.println("YOUR NUMBER IS TOO LARGE");
            }
            else{
                System.out.println("YOUR NUMBER IS TOO SMALL");
            }    
            }
            while(userNumber >= 0);
            System.out.print("MY NUMBER WAS : ");
            System.out.println(myNumber);
        }
    }