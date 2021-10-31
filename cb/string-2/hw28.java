public class hw28 {
  public static String doubleChar(String str) {
  String r = "";
  for (int i = 0; i < str.length(); i+= 1){
    r += str.substring(i,i+1);
    r += str.substring(i,i+1);
    }
  return r;
  }
  public static int countHi(String str) {
  int counter = 0;
  for (int i = 0; i < str.length()-1; i += 1){
    if (str.substring(i,i+2).equals("hi")){
      counter += 1;
    }
  }
  
  return counter;
  }
  public static boolean catDog(String str) {
  int cat = 0;
  int dog = 0;
  for (int i = 0; i < str.length()-2; i += 1){
    if (str.substring(i, i+3).equals("cat")){
      cat += 1;
    }
    if (str.substring(i, i+3).equals("dog")){
      dog += 1;
    }
  }
  if (cat == dog){
    return true;
  } else{
    return false;
  }
}
  public static int countCode(String str){
  int counter = 0;
  for (int i = 0; i < str.length()-3; i += 1){
    if (str.substring(i, i+2).equals("co") && str.substring(i+3,i+4).equals("e")){
      counter += 1;
    }
  }
  return counter;
}
public static boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  if (b.length() > a.length() && b.substring(b.length()-a.length()).equals(a)){
    return true;
  } else if (a.length() > b.length() && a.substring(a.length()-b.length()).equals(b)) {
    return true;
  } else if (a.equals(b)){
    return true;
  }
  else {
    return false;
  }
}
  public static boolean xyzThere(String str) {
  for (int i = 0; i < str.length()-2; i += 1){
    if (str.substring(i,i+3).equals("xyz")){
      if (i == 0){
        return true;
      } else if (str.substring(i-1,i).equals(".")){
        i += 1;
      } else {
        return true;
      }
    }
  }
  return false;
}

  
  
  public static void main(String[] args){
    System.out.println("doubleChar test:");
    System.out.println(doubleChar("The"));
    System.out.println(doubleChar("AAbb"));
    System.out.println(doubleChar("Hi-There"));
    System.out.println("countHi test:");
    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("ABChi hi"));
    System.out.println(countHi("hihi"));
    System.out.println("catDog test:");
    System.out.println(catDog("catdog"));
    System.out.println(catDog("catcat"));
    System.out.println(catDog("1cat1cadodog"));
    System.out.println("countCode test:");
    System.out.println(countCode("aaacodebbb"));
    System.out.println(countCode("codexxcode"));
    System.out.println(countCode("cozexxcope"));
    System.out.println("endOther test:");
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc", "abXabc"));
    System.out.println("xyzThere test:");
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("xyz.abc"));
  }
}
