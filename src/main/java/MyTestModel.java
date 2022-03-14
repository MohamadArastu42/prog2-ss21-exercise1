public class MyTestModel {
    public static boolean checkIfUpper(String input) {
        for (char chr : input.toCharArray())
            if (Character.isUpperCase(chr))
                return true;
        return false;
    }

    public static boolean checkIfLower(String input) {
        for (char chr : input.toCharArray())
            if (Character.isLowerCase(chr))
                return true;
        return false;
    }

    public static boolean checkLength(String input) {
        return input.length() >= 8 && input.length() <= 25;
    }

    public static boolean checkIsDigit(String input) {
        for (char chr : input.toCharArray())
            if (Character.isDigit(chr))
                return true;
        return false;
    }

    public static boolean checkIfSpecialCharacter(String input) {
        char[] specialSymbols = new char[]{'@', '#', '$', '?', '!', '%', '/', '(', ')'};
        for (char chr : input.toCharArray())
            for (char chrArr : specialSymbols)
                if (chr == chrArr)
                    return true;
        return false;
    }

    public static boolean checkPassword(String password) {
        return checkLength(password)
                && (checkIfUpper(password) && checkIfLower(password))
                && (checkIsDigit(password))
                && (checkIfSpecialCharacter(password));
    }
}
