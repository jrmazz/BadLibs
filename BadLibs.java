import java.util.Scanner;

class BadLibs {
  static int userChoice;
  //this method get the words that are needed by the user
  public static String[] getWords(int a){
    if(a == 1){
      return WillsBadlibs.arr;
    }
    //TO-DO:make the rest of the if else ladder
    return WillsBadlibs.arr;
    
  }
  
  public static String[] userWords(String[] needWords){
    //this method will take input from the user
    String userWord[] = {"WORD1", "WORD2", "WORD3", "WORD4", "WORD5", "WORD6", "WORD7", "WORD8"};
    return userWord;
  }
  public static void badlibsStart(){
    chooseBadLib();
    WillsBadlibs.printBadLib(userWords(getWords(userChoice)));
  }

  public static void chooseBadLib(){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Would you like me to choose a Badlib? Yes or no.");
    System.out.println("(If the answer is 'no' one will be picked at random.)");
    
    String choice = scan.nextLine();
    
    if(choice.equalsIgnoreCase("yes")){
      //This is where i would ask the user which one they would like to use?
      //pobably a question followed by some tittles 
      //and an if else if ladder to choose
      System.out.println("Not yet implemented.");
    }
    else if(choice.equalsIgnoreCase("no")){
      userChoice = (int)(Math.random() * 5);
    }//ends else if
  }//ends chooselib method
  
}//ends class