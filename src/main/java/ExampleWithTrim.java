public class ExampleWithTrim {
    public static void main(String[] args) {
        
        String savedUsername = "David";
        String testUsername = "David ";

        if (savedUsername.equals(testUsername.trim())){
            System.out.println("They are equal");
        }else{
            System.out.println(testUsername + "is not correct");
        }
    }
}
