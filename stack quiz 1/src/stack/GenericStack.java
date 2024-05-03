public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    /**/
    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public static void main(String[] args) {
        // create a Generic Stack myStack of Strings
        GenericStack<String> myStack = new GenericStack<String>();
        //Populate it with four elements: replace the values with your course name, your first name, your last name
        // and your section name
        myStack.push("ABCD");
        myStack.push("James");
        myStack.push("Bond");
        myStack.push("CS007");
        //Display what data is stored in this stack
        System.out.println(myStack);
        //Remove 1 element from the stack
        System.out.println(myStack.pop() + " is removed from the stack");
        //Display the item on top of this stack
        System.out.println("The item on top of the stack is: " + myStack.peek());
        //Display all elements left
        System.out.println(myStack);
    }
}