package collectionMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionUtil {
	
	public static boolean isEmpty(Collection<?> collection){
		if(null == collection || collection.size() == 0) return true;
		return false;
	}
	
	public static boolean isEmpty(Map<?, ?> map){
		if(null == map || map.size() == 0) return true;
		return false;
	}
	
	public static <T> List<? super T> newList(List<? extends T> src) {
		List<? super T> dest = new ArrayList<T>();
		if(isEmpty(src)) return dest;
		Iterator<? extends T> iterator = src.iterator();
		while(iterator.hasNext()){
			dest.add(iterator.next());
		}
		return dest;
	}
	
}
