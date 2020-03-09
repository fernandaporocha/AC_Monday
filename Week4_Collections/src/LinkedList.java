
public class LinkedList {

	private Person first;
	private Person last;
	private int size;
	
	public LinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void add(Person person) {
		if (size == 0) {
			this.first = person;
			this.last = person;
			size++;
		}else {
			this.last.setNext(person);
			this.last = person;
			size++;
		}
	}
	
	public void addFirst(Person person) {
		if (size == 0) {
			this.first = person;
			this.last = person;
			size++;
		}else {
			person.setNext(first);
			this.first = person;
			size++;
		}
	}
	
	public boolean remove() {
		if (size == 0) {
			return false;
		}else if(size == 1) {
			this.first = null;
			this.last = null;
			size--;
			return true;
		}else {
			this.first = this.first.getNext();
			size--;
			return true;
		}
	}
	
	public boolean removeLast() {
		if (size == 0) {
			return false;
		}else if(size == 1) {
			this.first = null;
			this.last = null;
			size--;
			return true;
		}else {
			Person current = this.first;
			int i = 0;
			while(i < size -2) {
				current = current.getNext();
				i++;
			}
			this.last = current;
			this.last.setNext(null);
			size--;
			return true;
		}
	}

	@Override
	public String toString() {
		String toReturn = "";
		Person current = this.first;
		
		while(current!=null) {
			toReturn += current + " ";
			current = current.getNext();
		}
		
		return toReturn;
	}
}
