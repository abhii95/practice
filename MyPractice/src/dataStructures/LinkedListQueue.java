package dataStructures;

public class LinkedListQueue {

	MyNode head;
	MyNode tail;
	MyNode oldTail;
	int size = 0;

	public LinkedListQueue() {

		this.head = null;
		this.tail = null;
	}

	public boolean offer(int data) {

		oldTail = tail;
		tail = new MyNode();
		tail.data = data;

		if (head == null)
			head = tail;
		else
			oldTail.nextNode = tail;

		size++;

		System.out.printf("Added '%d' element to the end of Queue", data);

		return true;

	}

	public int poll() {

		int value = 0;
		if (size > 0) {

			value = head.data;
			head = head.nextNode;
			size--;

			System.out.printf("Removed '%d' element from the Starting of Queue", value);
		} else
			System.out.println("Queue is Empty");

		return value;
	}

	public int peek() {

		if (size == 0)
			System.out.println("Queue is Empty");
		else
			System.out.printf("Peeked '%d' element in the Queue\n", head.data);

		return head.data;
	}

	@Override
	public String toString() {

		MyNode node = head;
		int tempSize = size;
		String str = "Queue is Empty";

		if (tempSize > 0) {

			str = "\nQueue is: [";

			for (;;) {

				str = str + node.data;
				node = node.nextNode;
				tempSize--;

				if (tempSize == 0)
					break;
				else
					str = str + ",";
			}
			str = str + "]\n";
		}

		return str;
	}
}
