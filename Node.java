/********************************************************************
 * Programmer: Lauren Minaker
 * Class:  CS40S
 *
 * Assignment: A3.1
 *
 * Description: node class
 ***********************************************************************/

// import libraries as needed here

public class Node<T> {
    //*** Class Variables ***
    
    protected Node next; // the next node in the data structure
    protected T payload; // the value contained in this node
    
    //*** Instance Variables ***
    
    //*** Constructors ***
    
    /*****************************************
    * Description: default constructor
    * 
    * Interface:
    * ****************************************/
    
    public Node(){
        this.next = null;
        this.payload = null;
    }
    
    /*****************************************
    * Description: initialized constructor
    * 
    * Interface:
    * ****************************************/
    
    public Node(T payload){
        this.next = null;
        this.payload = payload;
    }
    
    //*** Getters ***
    
    /*****************************************
    * Description: returns the next node
    * 
    * Interface:
    * ****************************************/
    
    public Node getnext(){
        return this.next;
    }
    
    /*****************************************
    * Description: returns the payload
    * 
    * Interface:
    * ****************************************/
    
    public T getPayload(){
        return this.payload;
    }
    
    //*** Setters ***
    
    /*****************************************
    * Description: sets the next node
    * 
    * Interface:
    * ****************************************/
    
    public void setnext(Node newP){
        this.next = newP;
    }
    
} // end of public class
