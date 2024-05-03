package Unit9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Radix {
public static void main(String[] args) {
int[] randint=new int[1000000];
Random rn=new Random();

for(int i=0;i<1000000;i++)
{
randint[i]=rn.nextInt(1000);//you can change the max vlue of random number here
System.out.print(randint[i]+" ");
}
rdxsort(randint);
System.out.print("\nSorted Radix List Is As Follows:\n\n");

for(int i=0;i<1000000;i++)
{
System.out.print(randint[i]+" ");
}
}
public static void rdxsort(int[] a) {
	
	final int RADIX = 1000000;

List<Integer>[] bucket = new
ArrayList[RADIX];
for (int i = 0; i < bucket.length; i
++) {
bucket[i] = new ArrayList<Integer>
();
}

boolean maxLength = false;
int tmp = -1, placement = 1;
while (!maxLength) {
maxLength = true;

for (Integer i : a) {
tmp = i / placement;
bucket[tmp % RADIX].add(i);
if (maxLength && tmp > 0) {
maxLength = false;
}
}

int ax = 0;
for (int b = 0; b < RADIX; b++) {
for (Integer i : bucket[b]) {
a[ax++] = i;
}
bucket[b].clear();
}

placement *= RADIX;

}
}
}






