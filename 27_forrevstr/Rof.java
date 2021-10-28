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
  		p += s.substring(i,i-1);
  		}
  	return p;
  }
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
  	
  	

  }
}
