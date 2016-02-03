import java.util.Scanner;

class BadLibs {

  public static void chooseBadLib(){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Would you like me to choose a Badlib? Yes or no.");
    System.out.println("(If the answer is 'no' one will be picked at random.)");
    
    String choice = scan.nextLine();
    
    if(choice.equalsIgnoreCase("yes")){
      //This is where i would ask the user which one they would liek to use?
      //pobably a question followed by some tittles and an if else if ladder
      System.out.println("Not yet implemented.");
    }
    else if(choice.equalsIgnoreCase("no")){
      int randnum = (int)(Math.random() * 5);
      //System.out.println(randnum);
      if(randnum == 0){
        //
      }
      else if( randnum == 1){
        //JacksBadLibs
      }
      else if( randnum == 2){
        //SawyersBadLibs
      }
      else if( randnum == 3){
        //FranksBadLibs
      }
      else if( randnum == 4){
        //AdamsBadLibs
      }
      
    }//ends else if
  }//ends chooselib method
}//ends class