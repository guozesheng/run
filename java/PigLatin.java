public class PigLatin {
  public static void main(String[] args) {
    if (args.length > 0) {
      String str = pigLatin(args[0]);
      System.out.println(str);
    }
  }

  private static String pigLatin(String str) {
    String vowelStr = "aeiou";
    int idx;
    for (idx = 0; idx < str.length(); idx++) {
      int i = vowelStr.indexOf(str.charAt(idx));
      if (i >= 0) {
        break;
      }
    }
    String pigl = str.substring(idx) + "-" + str.substring(0, idx) + "ay";
    return pigl;
  }
}
