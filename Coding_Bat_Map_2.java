/* word0 */
public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (String s:strings) {
    map.put(s, 0);
  }
  return map;
}

/* wordLen */
public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s:strings) {
    map.put(s, s.length());
  }
  return map;
}
// for (int i = 0; i < strings.length; i++) {
//  String tmp = strings[i];
//  map.put(tmp, tmp.length());
// }

/* pairs */
public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for (String s:strings) {
    map.put(s.substring(0,1), s.substring(s.length()-1));
  }
  return map;
}

/* wordCount */
public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s:strings) {
    if (!map.containsKey(s))
      map.put(s, 1);
    else {
      int count = map.get(s);
      map.put(s, count + 1);
    }
  }
  return map;
}

/* firstChar */
public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap();
  for (String s:strings) {
    String key = String.valueOf(s.charAt(0));
    if (!map.containsKey(key)) {
      map.put(key, s);
    }
    else {
      String val = map.get(key) + s;
      map.put(key, val);      
    }
  }
  return map;
}

/* wordAppend */
public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  String result = "";
  for (String s:strings) {
    String key = s;
    if (!map.containsKey(key))
      map.put(key, 1);
    else {
      int value = map.get(key);
      value++;
      if (value % 2 == 0) {
        result = result + key;
      }
      map.put(key, value);
    }
  }
  return result;
}

/* wordMultiple */
public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Integer> counts = new HashMap<String, Integer>();
  Map<String, Boolean> result = new HashMap<String, Boolean>();
  for (int i = 0; i < strings.length; i++) {
    String key = strings[i];
    if (!counts.containsKey(key)) {
      counts.put(key, 1);
    } 
    else {
      int val = counts.get(key);
      val++;
      counts.put(key, val);
    }
    result.put(key, counts.get(key) >= 2);
  }
  return result;
}
//  Map<String, Boolean> map = new HashMap();
//  for (String s:strings) {
//    if (!map.containsKey(s)) map.put(s, false);
//    else if (map.get(s) == false) map.put(s, true);
//  }
//  return map;

/* allSwap */
public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (int i = 0; i < strings.length; i++) {
    String key = String.valueOf(strings[i].charAt(0));
    if (!map.containsKey(key)) {
      map.put(key, i);
    }
    else {
      // Swap
      int position = map.get(key);
      String temporary = strings[position];
      strings[position] = strings[i];
      strings[i] = temporary;
      // Delete
      map.remove(key);
    }
  }
  return strings;
}

/* firstSwap */
public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (int i = 0; i < strings.length; i++) {
    String key = strings[i].substring(0,1);
    if (!map.containsKey(key)) {
      map.put(key, i);
    }
    else {
      int val = map.get(key);
      if (val == -1) {
        continue;
      }
      // Swap
      int pos = map.get(key); 
      String tmp = strings[pos];
      strings[pos] = strings[i];
      strings[i] = tmp;
      // Set a Flag
      map.put(key, -1);
    }
  }
  return strings;
}
