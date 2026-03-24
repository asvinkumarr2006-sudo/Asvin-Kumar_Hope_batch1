import java.util.*;
public class subway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch( n){
            case 1:
                System.out.println("JUMP");
                break;
            case 2:
                System.out.println("ROLL DOWN");
                break;
            case 3:
                System.out.println("MOVE LEFT");
                break;
            case 4:
                System.out.println("MOVE RIGHT");
                break;
            case 5:
                System.out.println("USE THE KEY");
                break;
             default:
                 System.out.println("Invalid input");
                 break;
        }
    }
}
