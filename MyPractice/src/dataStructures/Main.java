package dataStructures;

public class Main {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		/*
		 * list.add(5); list.add(6); list.add(8); list.add(1); list.add(9); list.add(0);
		 * list.add(3);
		 */


		/*
		 * list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
		 */
		
		/*
		 * System.out.println("size of List: " + list.getsize()); list.printList();
		 * System.out.println("First Element in the list: " + list.getFirst());
		 * 
		 * list.addFirst(111); list.printList();
		 * System.out.println("First Element in the list: " + list.getFirst());
		 * System.out.println("Last Element in the list: " + list.getLast());
		 * 
		 * System.out.println("Removed: " + list.removeFirst());
		 * System.out.println("size of List: " + list.getsize()); list.printList();
		 * 
		 * System.out.println("Removed: " + list.removeLast());
		 * System.out.println("size of List: " + list.getsize()); list.printList();
		 * 
		 * list.add(3); System.out.println("Added ");
		 * System.out.println("size of List: " + list.getsize()); list.printList();
		 * 
		 * list.insertAtIndex(1, 3); System.out.println("Inserted 3");
		 * System.out.println("size of List: " + list.getsize()); list.printList();
		 * 
		 * list.remove(3); System.out.println("Removed 3 ");
		 * System.out.println("size of List: " + list.getsize()); list.printList();
		 * 
		 * int index = 5; System.out.println("Element grabbed from index " + index +
		 * ": " + list.getElementIndexAt(index));
		 */

		/*
		 * list.printList();
		 * 
		 * list.rotateListRight(2);
		 * 
		 * list.printList();
		 */
		
		
		LinkedListStack lls = new LinkedListStack();
		
		System.out.print(lls);
		
		lls.push(10);
		System.out.println(lls);
		lls.push(20);
		System.out.println(lls);
		lls.push(30);
		System.out.println(lls);
		lls.push(40);
		System.out.println(lls);
		lls.push(50);
		System.out.println(lls);
		
		lls.pop();
		System.out.print(lls);
		lls.pop();
		System.out.print(lls);
		lls.pop();
		System.out.print(lls);
		
		lls.push(70);
		System.out.print(lls);
		lls.push(80);
		System.out.print(lls);
		
		/*
		 * System.out.println(lls); lls.pop(); System.out.println(lls); lls.pop();
		 * System.out.println(lls); lls.pop(); System.out.println(lls);
		 * 
		 */
		
		System.out.println();
		System.out.println();
		
		LinkedListQueue llq = new LinkedListQueue();
		
		llq.offer(1);
		System.out.println(llq);
		llq.offer(2);
		System.out.println(llq);
		llq.offer(3);
		System.out.println(llq);
		llq.offer(4);
		System.out.println(llq);
		llq.offer(5);
		System.out.println(llq);
		
		llq.poll();
		System.out.println(llq);
		llq.poll();
		System.out.println(llq);
		llq.poll();
		System.out.println(llq);
		
		llq.offer(6);
		System.out.println(llq);
		llq.offer(7);
		System.out.println(llq);
		
		llq.poll();
		System.out.println(llq);
		
		
		
		
		
		

	}

}
