import java.util.ArrayList;

public class LLDeque<T> implements Deque<T>{
  ArrayList deque<T> = new ArrayList<T>();
  
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
    return deque.get(0);
  }
  
  public T peekLast() {
    return deque.get(deque.size - 1);
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
  
