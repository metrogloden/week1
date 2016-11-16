import java.util. *;

public class GCD {

    public static void main(String[] args) {
        
          int tmpA = 2500;
          int tmpB = 500;
          int div;
          Scanner input = new Scanner(System.in);
          
          System.out.print("Enter in your first integer: ");
          tmpA = input.nextInt();
          System.out.print("Enter in your second integer: ");
          tmpB = input.nextInt();
          
          if (tmpA < tmpB)
                div = tmpB;
          else
              div = tmpA;
          while((tmpA % div != 0) ||(tmpB % div != 0)) {
          
                div--;
          }
          System.out.printf("The GCD for %d and %d is %d", tmpA, tmpB, div);
    }
}
