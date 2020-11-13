public class PalindromicNumberFinder {
    private int num;
    
    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      if(getNum() == num){
        num += 1;
      }
      while(testPalindromicNum(num) == false){
        num += 1;
      }
      return num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String s = reverseNum(num);
      int num1 = Integer.parseInt(s);
      if (num1 == num){
        return true;
      }else{
        return false;
      }

    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      String str1 = Integer.toString(num);
      String reverse = "";
      for(int i = str1.length()-1; i >=0; i--){
        reverse += str1.charAt(i);
      }
      return reverse;
      


    }


    //@Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
