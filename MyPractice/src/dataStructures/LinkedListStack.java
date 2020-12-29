package dataStructures;

public class LinkedListStack {

	MyNode head;
	MyNode oldHead;
	int size = 0;

	public LinkedListStack() {

		this.head = null;
	}

	public boolean push(int data) {

		oldHead = head;
		head = new MyNode();
		head.nextNode = oldHead;
		head.data = data; // Last added element will be head.
		size++;

		System.out.printf("Added '%d' element to the top of stack", head.data);

		return true;
	}

	public int pop() {

		int value = 0;
		if (size > 0) {

			value = head.data;
			head = head.nextNode;
			size--;

			System.out.printf("Removed '%d' element from the top of stack", value);
		} else
			System.out.println("Stack is Empty");

		return value;
	}

	public int peek() {

		if (size == 0)
			System.out.println("Stack is Empty");
		else
			System.out.printf("Peeked '%d' element in the stack\n", head.data);

		return head.data;
	}

	@Override
	public String toString() {

		MyNode node = head;
		int tempSize = size;
		String str = "Stack is Empty";

		if (tempSize > 0) {

			str = "\nStack is: [";

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
