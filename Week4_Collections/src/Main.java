import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		linkedLists();
	}
	
	public void deques() {
		Deque<String> myQueue = new ArrayDeque<String>();
		myQueue.add("Fernanda");
		myQueue.add("Jesper");
		myQueue.add("Jose");
		myQueue.add("Carmi");
		myQueue.addFirst("Anitta");
		
		System.out.println(myQueue);
		
		myQueue.remove("Jesper");
		
		System.out.println(myQueue);
		
	}
	
	public void personDeque() {
		Deque<Person> myPersonQueue = new ArrayDeque<Person>();
		myPersonQueue.add(new Person("Jesper"));
		myPersonQueue.add(new Person("Jose"));
		myPersonQueue.addFirst(new Person("Fernanda"));
		myPersonQueue.add(new Person("Carmi"));
		myPersonQueue.add(new Person("Jesper"));
		
		System.out.println(myPersonQueue);
	}
	
	public void maps() {
		Map<String, Person> myMap = new HashMap<String, Person>();
		myMap.put("The Best", null);
		myMap.put("Second", new Person("Fernanda"));
		myMap.put("Best Boyfrien", new Person("Jesper"));
		myMap.put("Fourth", new Person("Carmi"));
		myMap.put("Fifth", null);
		
		System.out.println(myMap);
	}
	
	public void linkedLists() {
		LinkedList myLL = new LinkedList();
		
		Person a = new Person("Fernanda");
		Person b = new Person("Jesper");
		Person c = new Person("Carmi");
		Person d = new Person("Jose");
		
		myLL.add(b);
		myLL.add(d);
		myLL.add(a);
		myLL.add(c);
		
		System.out.println(myLL.toString());
	}

}
