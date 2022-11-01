package LinkedListGenerics;
import java.util.LinkedList;
public class LinkedListExample {
	public static void main(String[] args) {
		
		LinkedListExample linkedListExample = new LinkedListExample();
		linkedListExample.add();
	}
	public void add() {
		LinkedList<Integer> addnode = new LinkedList<>();
		addnode.add(56);
		addnode.add(30);
		addnode.add(70);
		System.out.println("Before Pop");
		System.out.println(addnode);
		System.out.println();
		addnode.pollLast();
		System.out.println("After Deleting Last element output is: ");
		System.out.println(addnode);

	}

}
