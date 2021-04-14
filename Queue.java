/********************************************************************
 * Programmer: Lauren Minaker
 * Class:  CS40S
 *
 * Assignment: A3.1
 *
 * Description: queue class
 ***********************************************************************/

// import libraries as needed here

public class Queue<T> {
    //*** Class Variables ***
    
    protected Node front; // the front of the queue
    protected Node back; // the back of the queue
    
    //*** Instance Variables ***
    
    //*** Constructors ***
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * ****************************************/
    
    public Queue(){
        this.front = null;
        this.back = null;
    }
    
    //*** Getters ***
    
    /*****************************************
    * Description: returns the front node's payload and removes it from the queue
    * 
    * Interface:
    * ****************************************/
    
    public T dequeue(){
        T topPayload = null;
        
        if(this.isEmpty()){
           System.out.println("The stack is empty.");
        } else {
           topPayload = (T) front.getPayload();
           if(front == back){
               front = null;
               back = null;
            } else {
               front = front.next;
            } // end more than 1 in the queue
        } // end dequeue cases
        
        return topPayload;
    }
    
    /*****************************************
    * Description: checks if the stack is empty
    * 
    * Interface:
    * ****************************************/
    public boolean isEmpty(){
        boolean empty = false;
        if(front == null || back == null){
            empty = true;
        } // end empty queue
        return empty;
    }
    
    //*** Setters ***
    
    /*****************************************
    * Description: adds a new node to the back of the queue
    * 
    * Interface:
    * ****************************************/
    
    public void enqueue(Node n){
        if(isEmpty()){
            back = n;
            front = n;
        } else {
            back.next = n;
            back = n;
        } // end enqueue cases
    }
    
} // end of public class
