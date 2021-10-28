public class Rof {
  public static String fenceF(int posts){
  	String fence = "|";
  	for (int i = posts; i > 1; i -= 1){
  		fence += "--|";
  		}
  	return fence;
  }
  public static String reverseF(String s){
  	String p = "";
  	for (int i = s.length(); i > 0; i -= 1){
  		p += s.substring(i-1,i);
  		}
  	return p;
  }
  public static String reverseR(String s){
    if (s.length() > 0){
      return s.substring(s.length()-1,s.length) + reverseR(s.substring(0,s.length()-1));
    } else{
      return s;
  public static void main(String[] args){
  	System.out.println(fenceF(3));
  	System.out.println(fenceF(0));
  	System.out.println(fenceF(4));
  	System.out.println(fenceF(-4));
  	System.out.println(fenceF(1));
  	System.out.println(reverseF("hello there"));
  	System.out.println(reverseF("tu madred"));
  	System.out.println(reverseF("23"));
  	System.out.println(reverseF("fr"));
    System.out.println(reverseR("hello there"));
    System.out.println(reverseR("tu madred"));
    System.out.println(reverseR("23"));
    System.out.println(reverseR("fr"));
  	
  	

  }
}
