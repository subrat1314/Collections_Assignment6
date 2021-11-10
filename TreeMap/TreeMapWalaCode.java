
package java_Assignments;
//import java_Assignments.ContactForTreeMapWalaCode;
import java_Assignments.ContactForTreeMapWalaCode.Gender;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapWalaCode {

	public static void main(String[] args) {
		Long key1=Long.valueOf("7327054275");
		Long key2=Long.valueOf("9776447412");
		Long key3=Long.valueOf("9938124474");
		Long key4=Long.valueOf("6370013434");
		ContactForTreeMapWalaCode c1=new ContactForTreeMapWalaCode(Long.valueOf("7327054275"),"Subrat", "skspsubrat12345@gmail",Gender.valueOf("male"));
		ContactForTreeMapWalaCode c2=new ContactForTreeMapWalaCode(Long.valueOf("9776447412"),"Saroj", "sarojKumar1314@gmail",Gender.valueOf("male"));
		ContactForTreeMapWalaCode c3=new ContactForTreeMapWalaCode(Long.valueOf("9938124474"),"Nilanchal", "nilanchalsahu1234@gmail",Gender.valueOf("male"));
		ContactForTreeMapWalaCode c4=new ContactForTreeMapWalaCode(Long.valueOf("6370013434"),"Namita", "namitakumari@gmail",Gender.valueOf("female"));
		Map<Long,ContactForTreeMapWalaCode> map=new TreeMap<>(Collections.reverseOrder());
		map.put(key1, c1);
		map.put(key2, c2);
		map.put(key3, c3);
		map.put(key4, c4);
		Set<Entry<Long,ContactForTreeMapWalaCode>> entrySet =map.entrySet();
		Iterator<Entry<Long,ContactForTreeMapWalaCode>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Long,ContactForTreeMapWalaCode> entry = (Map.Entry<Long, ContactForTreeMapWalaCode>)iterator.next();
			Long k= entry.getKey();
			ContactForTreeMapWalaCode c = entry.getValue();
			System.out.println(k);
			System.out.println(c);
		}
		
	}
	
}

