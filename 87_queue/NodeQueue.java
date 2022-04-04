public class NodeQueue<QUASAR> implements Queue<QUASAR>{

  private QUASAR _cargo;    //cargo may only be of type String
  private LLNode _nextNode; //pointers to next, prev DLLNodes
  private LLNode _head;
  private int _size;

  public NodeQueue(QUASAR value, LLNode next){
    _cargo = value;
    _size = 0;
    _nextNode = next;

  }

  public QUASAR getCargo() { return _cargo; }

  public LLNode getNext() { return _nextNode; }

  public QUASAR setCargo( QUASAR newCargo )
  {
    QUASAR foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode setNext( DLLNode newNext )
  {
    DLLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public QUASAR dequeue(){
    _head.getCdr =
  }
}






  // constructor -- initializes instance vars


  //--------------v  ACCESSORS  v--------------

  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------




  public DLLNode setPrev( DLLNode newPrev )
  {
    DLLNode foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }


  //main method for testing
  public static void main( String[] args )
  {
    //Below is an exercise in creating a linked list...

 /*********************
    //Create a node
    DLLNode first = new DLLNode( "cat", null );
    //Create a new node after the first
    first.setNext( new DLLNode( "dog", null ) );
    //Create a third node after the second
    first.getNext().setNext( new DLLNode( "cow", null ) );
    DLLNode temp = first;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }
   ***********************/
  }//end main

}//end class DLLNode
