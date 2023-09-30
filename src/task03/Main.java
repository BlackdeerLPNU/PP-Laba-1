package task03;

public class Main {
    public static void main(String[] args) {

       final String email = "very.common@example.com";

        //================================================================
        System.out.print("Input email: ");
        System.out.println(email);
        if (validateEmail(email)) {
            System.out.println("This email is valid");
        } else {
            System.out.println("This email is invalid");
        }
    }

    public static boolean validateEmail(final String email) {
        if (email.isEmpty() || email == null) {
            return false;
        }
        String[] partsOfEmail = email.split("@", 2);
        if ((partsOfEmail.length != 2)) {
            return false;
        }
        String localPart = partsOfEmail[0];
        String domainPart = partsOfEmail[1];
        if (localPart.isEmpty() || domainPart.isEmpty() || !domainPart.contains(".")) {
            return false;
        }

        return isValidLocalPart(localPart) && isValidDomainPart(domainPart);
    }

    private static boolean isValidLocalPart(final String localPart) {
        char[] chars = localPart.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '-' && c != '_') {
                return false;
            }
            if (i > 0 && (c == '.' || c == '-' || c == '_') && (chars[i - 1] == c)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidDomainPart(final String domainPart) {
        char[] chars = domainPart.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!Character.isLetterOrDigit(c) && c != '.') {
                return false;
            }
            if (i > 0 && c == '.' && chars[i - 1] == '.') {
                return false;
            }
        }
        if (chars[0] == '.' && chars[chars.length - 1] == '.') {
            return false;
        }
        return true;
    }
}
