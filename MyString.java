public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String newStr = "";
		char ch;
		for (int i = 0; i < str.length(); i++){
			ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z'){
				newStr += (char) (ch + 32);
			} else {
				newStr += ch;
			}
		}
		return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str2.length() == 0) return true;
        if (str1.length() == 0 || str1.length() < str2.length()) return false;
        if (str1.length() == str2.length()) return str1 == str2;
        int firstIndex = str1.indexOf(str2.charAt(0));
        int lastIndex = str1.lastIndexOf(str2.charAt(str2.length() - 1));
        if (firstIndex == -1 || lastIndex == -1) return false;
        for (int i = firstIndex; i <= lastIndex - str2.length() + 1; i++)
        {
            if (str1.substring(i, i + str2.length()).equals(str2)) return true;
        }
        return false;

    }
}
