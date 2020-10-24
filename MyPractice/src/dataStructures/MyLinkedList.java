package dataStructures;

public class MyLinkedList {

	MyNode head;
	MyNode tail;
	MyNode oldTailNode;

	int size = 0;

	public void add(int data) {

		MyNode currentNode = new MyNode();

		if (size == 0) {
			head = currentNode;
			head.nextNode = null;
			head.data = data;

			tail = head;
			oldTailNode = head;
			System.out.println("Added '" + data + "' at the end of list");

		} else {

			currentNode.data = data;
			currentNode.nextNode = null;

			oldTailNode.nextNode = currentNode;
			oldTailNode = currentNode;
			tail = currentNode;

			System.out.println("Added '" + data + "' at the end of list");

		}

		size++;

	}

	public void addFirst(int data) {

		if (size == 0)
			add(data);
		else {

			MyNode fnode = new MyNode();

			fnode.data = data;
			fnode.nextNode = head;
			head = fnode;
		}
		size++;
	}

	public void insertAtIndex(int index, int data) {

		if (index > size)
			throw new IndexOutOfBoundsException("cannot insert at " + index + ".Max size is: " + size);

		if (index == 0)
			addFirst(data);

		else if (index == size)
			add(data);

		else {

			MyNode trailNode = getTrailNode(index);
			MyNode nextNode = trailNode.nextNode;

			MyNode newNode = new MyNode();
			newNode.data = data;
			newNode.nextNode = nextNode;

			trailNode.nextNode = newNode;
		}

		size++;
	}

	public int getFirst() {

		if (head != null)
			return head.data;
		else
			throw new NullPointerException("Cannot get Element from Empty List");

	}

	public int getLast() {

		if (tail != null)
			return tail.data;
		else
			throw new NullPointerException("Cannot get Element from Empty List");

	}

	public int getElementIndexAt(int index) {

		if (size <= 0)
			throw new NullPointerException("Cannot remove element from Empty List");

		if (index >= size)
			throw new IndexOutOfBoundsException(
					"Total Size: " + size + ". Cannot get element from index: " + index + "");

		if (index == 0)
			return head.data;
		else if (index == size - 1)
			return tail.data;
		else {

			return (getTrailNode(index).nextNode.data);
		}

	}

	// 0 1 2 3
	private MyNode getTrailNode(int index) {

		MyNode node = head;

		int currentIndex = 0;
		while (currentIndex < index - 1) {

			node = node.nextNode; // 0 - 1
			currentIndex++;
		}
		return node;
	}

	private MyNode getTrailNode(MyNode node) {

		MyNode temp = head;

		while (temp.nextNode != null) {
			if (temp.nextNode.equals(node))
				return temp;
			temp = temp.nextNode;
		}

		return temp;
	}

	// Removes first occurrence
	public void remove(int data) {

		if (size <= 0)
			throw new NullPointerException("Cannot remove element from Empty List");

		MyNode currentNode = head;
		MyNode trailNode = null;

		boolean found = false;

		while (currentNode != null) {

			if (currentNode == head && currentNode.data == data) {
				head = currentNode.nextNode;
				found = true;
				break;
			} else if (currentNode == tail && currentNode.data == data) {

				trailNode.nextNode = null;
				oldTailNode = trailNode;
				found = true;
				break;

			} else {
				if (currentNode.data == data) {
					trailNode.nextNode = currentNode.nextNode;
					found = true;
					break;
				}
			}
			trailNode = currentNode;
			currentNode = currentNode.nextNode;

		}

		if (!found)
			System.out.println(data + " is not present in the list");
		else
			size--;

	}

	public int removeFirst() {

		if (size <= 0)
			throw new NullPointerException("Cannot remove element from Empty List");

		MyNode node = head;
		head = head.nextNode;

		size--;

		return node.data;

	}

	public int removeLast() {

		if (size <= 0)
			throw new NullPointerException("Cannot remove element from Empty List");

		if (tail == head)
			return (removeFirst());

		MyNode temp = tail;
		MyNode lastButOneNode = getTrailNode(tail);

		lastButOneNode.nextNode = null;
		tail = lastButOneNode;

		oldTailNode = tail;

		size--;

		return temp.data;

	}

	public void printList() {

		MyNode node = head;

		System.out.print("[");
		for (;;) {

			System.out.print(node.data);
			node = node.nextNode;

			if (node != null)
				System.out.print(",");
			else
				break;
		}

		System.out.print("]\n");

		if (size == 0)
			System.out.println("List is Empty");
	}

	public int getsize() {
		return size;
	}

	// Stack Methods

	public void push(int data) {

		add(data);
	}

	public void pop() {

		removeLast();
	}

	public int peek() {

		return (getLast());
	}

	// MyNode head,
	public void rotateListRight(int k) {

		int lsize = 1;

		MyNode lastNode = head;

		while (lastNode.nextNode != null) {
			lsize++;
			lastNode = lastNode.nextNode;
		}
		
		k = size/k;

		lastNode.nextNode = head;

		int count = 1;

		MyNode temp = head;

		while (count <= lsize) {

			if (count == (size - k)) {
				head = temp.nextNode;
				temp.nextNode = null;
				break;
			}
			temp = temp.nextNode;
			count++;
		}
	}
}
