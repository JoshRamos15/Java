package Queue;

public class TestQueue {
			  public static void main(String[] args) {
				  java.util.Queue<String> queue = new java.util.LinkedList<>();
				    queue.offer("Oklahoma");
				    queue.offer("Indiana");
				    queue.offer("Georgia");
				    queue.offer("Texas");

				    while (queue.size() > 0)
				      System.out.println(queue.remove() + " ");
				  
				
				  
	java.util.Queue<Integer> queue1 = new java.util.LinkedList<>();
		
	    queue1.add(5);
	    queue1.add(7);
	    queue1.add(10);
	    queue1.add(6);
	    queue1.add(11);
	    queue1.add(99);
	          
          System.out.println("Queue: " + queue1);
	      System.out.println( queue1.poll());
	      System.out.println( queue1.remove());
	      System.out.println(queue1.peek());
	      System.out.println(queue1.element());
	     
			  
	  
		     
	     
	      
	   
		   
	  }
		  }
	