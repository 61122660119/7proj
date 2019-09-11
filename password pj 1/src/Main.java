import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        String pw1 = "aaa";
        String pw2 = "bbb";
        System.out.println("new password");
        Scanner input = new Scanner(System.in);
        pw1 = input.nextLine();
        while (!pw2.equals(pw1)) {
            System.out.println("Comfirm password ");
            pw2 = input.nextLine();
        }


    }
}
