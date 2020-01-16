package com.bridgelabz.datastructure;

public class DequeuePalindromeChaecker
{ 
    static final int MAX = 100; 
     String[] arr; 
    int  front; 
    int  rear; 
    int  size; 
      
    public DequeuePalindromeChaecker(int size) 
    { 
        arr = new String[MAX]; 
        front = -1; 
        rear = 0; 
        this.size = size; 
    } 
   
    // Checks whether Deque is full or not. 
    boolean isFull() 
    { 
        return ((front == 0 && rear == size-1)|| 
            front == rear+1); 
    } 
   
    // Checks whether Deque is empty or not. 
    boolean isEmpty () 
    { 
        return (front == -1); 
    } 
   
    // Inserts an element at front 
    void insertfront(String key) 
    { 
        // check whether Deque if  full or not 
        if (isFull()) 
        { 
            System.out.println("Overflow");  
            return; 
        } 
   
        // If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
          
        // front is at first position of queue 
        else if (front == 0) 
            front = size - 1 ; 
   
        else // decrement front end by '1' 
            front = front-1; 
   
        // insert current element into Deque 
        arr[front] = key ; 
    } 
   
    // function to inset element at rear end 
    // of Deque. 
    void insertrear(String key) 
    { 
        if (isFull()) 
        { 
            System.out.println(" Overflow "); 
            return; 
        } 
   
        // If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
   
        // rear is at last position of queue 
        else if (rear == size-1) 
            rear = 0; 
   
        // increment rear end by '1' 
        else
            rear = rear+1; 
          
        // insert current element into Deque 
        arr[rear] = key ; 
    } 
   
    // Deletes element at front end of Deque 
    void deletefront() 
    { 
        // check whether Deque is empty or not 
        if (isEmpty()) 
        { 
            System.out.println("Queue Underflow\n"); 
            return ; 
        } 
   
        // Deque has only one element 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else
            // back to initial position 
            if (front == size -1) 
                front = 0; 
   
            else // increment front by '1' to remove current 
                // front value from Deque 
                front = front+1; 
    } 
   
    // Delete element at rear end of Deque 
    void deleterear() 
    { 
        if (isEmpty()) 
        { 
            System.out.println(" Underflow"); 
            return ; 
        } 
   
        // Deque has only one element 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else if (rear == 0) 
            rear = size-1; 
        else
            rear = rear-1; 
    } 
   
    // Returns front element of Deque 
    String getFront() 
    { 
        // check whether Deque is empty or not 
        if (isEmpty()) 
        { 
            System.out.println(" Underflow"); 
        } 
        return arr[front]; 
    } 
   
    // function return rear element of Deque 
    String getRear() 
    { 
        // check whether Deque is empty or not 
        if(isEmpty() || rear < 0) 
        { 
            System.out.println(" Underflow\n"); 
        } 
        return arr[rear]; 
    } 
   
    // Driver program to test above function 
    public static void main(String[] args) 
    { 
    	DequeuePalindromeChaecker dq = new DequeuePalindromeChaecker(5); 
        
        System.out.println("Insert element at rear end  : 5 "); 
        dq.insertrear("one"); 
          
        System.out.println("insert element at rear end : 10 "); 
        dq.insertrear("two"); 
          
        System.out.println("get rear element : "+ dq.getRear()); 
          
        dq.deleterear(); 
        System.out.println("After delete rear element new rear become : " +  
                               dq.getRear()); 
          
        System.out.println("inserting element at front end"); 
        dq.insertfront("three"); 
          
        System.out.println("get front element: " +dq.getFront()); 
          
        dq.deletefront(); 
          
        System.out.println("After delete front element new front become : " + dq.getFront()); 
		
	}
	
}
