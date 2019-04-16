public class Main{
  public static void main(String[] args){
    System.out.println("Pluralize tests");

    int dogCount = 1;
    System.out.println("I have " + dogCount + pluralize(" dog", dogCount) +".");

    int catCount = 3;
    System.out.println("I have " + catCount + pluralize(" cat", catCount) +".");

    int turtleCount = 0;
    System.out.println("I have " + turtleCount + pluralize(" turtle", turtleCount) +".");
  }
  public static String pluralize(String word, int count){
    return (word + ((count > 1 || count == 0) ? "s" : ""));
  }
}