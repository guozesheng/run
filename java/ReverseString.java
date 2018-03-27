public class ReverseString {
  public static void main(String[] args) {
    if (args.length > 0) {
      String str = args[0];
      System.out.println(str);
      StringBuilder sbuilder = new StringBuilder(str.length());
      for (int i = 0; i < str.length(); i++) {
        sbuilder.append(str.charAt(str.length() - i - 1));
      }
      String reverse = sbuilder.toString();
      System.out.println(reverse);
    }
  }
}
