class Main {
  public static void main(String[] args) {
    boolean palindrom = FabrykaTekstu.isPalindrom(args[0]);
    if(palindrom)
      System.out.println(args[0] + " jest palindromem");
    else 
      System.out.println(args[0] + " nie jest palindromem");
  }
}

class FabrykaTekstu {
    public static boolean isPalindrom(String text) {
        String bufferedText = text.toLowerCase().replaceAll(" ", "").trim();
        String rotatedText = "";
        int i = bufferedText.length();

        while(--i >= 0)
            rotatedText += bufferedText.charAt(i);

        if(bufferedText.equals(rotatedText))
            return true;
        else
            return false;
    }
}