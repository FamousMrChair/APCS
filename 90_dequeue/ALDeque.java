import java.util.ArrayList;

public class ALDeque<T> implements Deque<T>{
  ArrayList deque = new ArrayList<T>();
  
  public void addFirst( T element) {
    deque.add(0, element);
  }
  
  public void addLast( T element ) {
    deque.add(element);
  }

  public T removeFirst() {
    T output = deque.get(0);
    deque.remove(0);
    return output;
  }
  
  public T removeLast() {
    T output = deque.get(deque.size() - 1);
    deque.remove(deque.size() - 1);
    return output;
  }
    
  public T peekFirst() {
    if (!deque.isEmpty()) {
      return deque.get(0);
    }
    return null;
  }
  
  public T peekLast() {
    if (!deque.isEmpty()) {
      return deque.get(deque.size() - 1);
    }
    return null;
  }
  
  public int size() {
    return deque.size();
  }
  
  public boolean offerFirst( T element ) {
		
  }
  
  public boolean offerLast( T element ) {
    
  }

  public T pollFirst() {
		if (!deque.isEmpty()) {
      return removeFirst();
    }
    return null;
  }
  
  public T pollLast() {
    if (!deque.isEmpty()) {
      return removeLast();
    }
    return null;
  }
  
  public T getFirst() {
    return deque.get(0);
	}
  
  public T getLast() {
    return deque.get(deque.size() - 1);
  }
  
  public static void main (String[] args){
    Deque<T> Kevin = new ALDeque<T>();
    for (int i = 0; i < 50; i ++){
      Kevin.addFirst(i);
    }
    for (int i = 0; i < 50; i ++){
      Kevin.addLast(i);
    }
    while (deque.size() > 0){
      if (deque.size() > 0) {
        System.out.println(Kevin.removeFirst());
      }
      if (deque.size() > 0) {
        System.out.println(Kevin.removeLast());
      }
    }
  }
}
