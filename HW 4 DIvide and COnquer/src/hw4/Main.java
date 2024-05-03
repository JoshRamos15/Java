package hw4;

public class Main {

public static void main(String[] args) {

int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

//Naive Approach

int max = array[0];

for(int i = 1; i < array.length; i++) {

if(array[i] > max) {

max = array[i];
long begin, end, time;
// we will measure time it took to search
begin = System.nanoTime();
//we measure in nanoseconds.
//Starting the watch

end = System.nanoTime();
time = end-begin; 
System.out.println("it took " + time + " nanoseconds " +   " on the array of " +   " elements.");
}

}

System.out.println("The maximum element using the naive approach is: " + max);

//Divide and Conquer Approach

int max1 = divideAndConquer(array, 0, array.length - 1);

System.out.println("The maximum element using the divide and conquer approach is: " + max1);

}

public static int divideAndConquer(int[] array, int start, int end) {

if(start == end) {

return array[start];

}

int mid = (start + end) / 2;

int leftMax1 = divideAndConquer(array, start, mid);

int rightMax1 = divideAndConquer(array, mid + 1, end);

return Math.max(leftMax1, rightMax1);

}

}
 




