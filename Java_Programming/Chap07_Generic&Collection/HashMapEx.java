// HashMap<K, V> 순회 방법
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("A", 10);
		hashMap.put("B", 20);
		hashMap.put("C", 30);
		hashMap.put("D", 40);
		hashMap.put("E", 50);
		
		// 순회 방법 1: keySet() : key를 이용하여 value를 찾음
		System.out.println("keySet() 사용 ");
		for(String key : hashMap.keySet()) {
			System.out.println("key: " +key + ", value: " + hashMap.get(key));
		}
		
		// 순회 방법 2: entrySet(): key, value 쌍을 리턴함
		System.out.println("entrySet() 사용 ");
		for(HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue()); 
		}
		
		// 순회 방법 3: Iterator
		Iterator<String> it = hashMap.keySet().iterator();
		System.out.println("Iterator 사용 ");
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key: " +key + ", value: " + hashMap.get(key));
		}
	}
}