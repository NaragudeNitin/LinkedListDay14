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
		
		addnode.add(2, 40);
		System.out.println("After inserting 40 to list, list is");
		System.out.println(addnode);
				
		
	}

}
