import java.util.Scanner;

public class ExampleString {
    public static void main(String[] args) {
//        String text = "This is a text";
//        String newText = new String("This is a text");
//
//        System.out.println(text.length());

//        if (text.equals(newText)){
//            System.out.println("Text is equal to the new text");
//            return;
//        }
        int passwordMinLength = 8;

        System.out.println("Input a password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        while (password.length() < passwordMinLength){
            System.out.println("Password must be greater than " + passwordMinLength);
            password = scanner.nextLine();
        }
            System.out.println("Password is accepted");

        return;

    }
}



