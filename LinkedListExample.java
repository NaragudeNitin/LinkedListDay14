package LinkedListGenerics;
import java.util.LinkedList;
public class LinkedListExample {
	public static void main(String[] args) {
		
		LinkedListExample linkedListExample = new LinkedListExample();
		linkedListExample.add();

	}
	public void add() {
		LinkedList<Integer> addnode = new LinkedList<>();
		addnode.add(70);
		addnode.add(30);
		addnode.add(56);
		System.out.println(addnode);
	}
}
