public class MyTestModel {
    public static boolean checkPassword(String password) {
        return password.length() >= 8 && password.length() <= 25;
    }

    public static void main(String[] args) {
        System.out.println("Hello Test Test ");
    }
}
