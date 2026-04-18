// ```java
// /*
// ========================================
//  JAVA COLLECTIONS FRAMEWORK (JCF)
// ========================================

// Part of Java programming language.
// Used to store and manipulate groups of objects.

// ----------------------------------------
// 1. LIST (Ordered, Allows Duplicates)
// ----------------------------------------

// Classes:
// - ArrayList
// - LinkedList
// - Vector
// - Stack

// 1.1 ArrayList
// Syntax:
// List<String> list = new ArrayList<>();

// Methods:
// add(), get(), set(), remove(), size()

// Example:
// List<String> list = new ArrayList<>();
// list.add("Kia");
// list.add("Hyundai");
// System.out.println(list.get(0));

// ----------------------------------------

// 1.2 LinkedList
// Syntax:
// List<Integer> list = new LinkedList<>();

// Extra Methods:
// addFirst(), addLast(), removeFirst()

// Example:
// LinkedList<Integer> li = new LinkedList<>();
// li.add(10);
// li.addFirst(5);

// ----------------------------------------

// 1.3 Vector (Legacy)
// Syntax:
// Vector<Integer> v = new Vector<>();

// ----------------------------------------

// 1.4 Stack (LIFO)
// Syntax:
// Stack<Integer> s = new Stack<>();

// Methods:
// push(), pop(), peek()

// ----------------------------------------
// 2. SET (No Duplicates)
// ----------------------------------------

// Classes:
// - HashSet
// - LinkedHashSet
// - TreeSet

// 2.1 HashSet
// Syntax:
// Set<Integer> set = new HashSet<>();

// Methods:
// add(), remove(), contains()

// Example:
// Set<Integer> set = new HashSet<>();
// set.add(10);
// set.add(10); // ignored

// ----------------------------------------

// 2.2 LinkedHashSet
// Maintains insertion order

// Syntax:
// Set<Integer> set = new LinkedHashSet<>();

// ----------------------------------------

// 2.3 TreeSet
// Sorted order

// Syntax:
// Set<Integer> set = new TreeSet<>();

// ----------------------------------------
// 3. QUEUE (FIFO)
// ----------------------------------------

// Classes:
// - PriorityQueue
// - ArrayDeque

// 3.1 PriorityQueue
// Syntax:
// Queue<Integer> q = new PriorityQueue<>();

// Methods:
// add(), poll(), peek()

// ----------------------------------------

// 3.2 ArrayDeque
// Syntax:
// Deque<Integer> dq = new ArrayDeque<>();

// Methods:
// addFirst(), addLast(), removeFirst()

// ----------------------------------------
// 4. MAP (Key-Value Pair)
// ----------------------------------------

// Classes:
// - HashMap
// - LinkedHashMap
// - TreeMap
// - Hashtable

// 4.1 HashMap
// Syntax:
// Map<Integer, String> map = new HashMap<>();

// Methods:
// put(), get(), remove(), containsKey()

// Example:
// Map<Integer, String> map = new HashMap<>();
// map.put(1, "Kia");
// map.put(2, "Hyundai");
// System.out.println(map.get(1));

// ----------------------------------------

// 4.2 LinkedHashMap
// Maintains insertion order

// Syntax:
// Map<Integer, String> map = new LinkedHashMap<>();

// ----------------------------------------

// 4.3 TreeMap
// Sorted by keys

// Syntax:
// Map<Integer, String> map = new TreeMap<>();

// ----------------------------------------

// 4.4 Hashtable (Legacy, synchronized)
// Syntax:
// Hashtable<Integer, String> ht = new Hashtable<>();

// ----------------------------------------
// COMMON METHODS
// ----------------------------------------

// add()        -> Add element
// remove()     -> Remove element
// size()       -> Number of elements
// isEmpty()    -> Check empty
// clear()      -> Remove all
// contains()   -> Check element

// ----------------------------------------
// QUICK DIFFERENCE
// ----------------------------------------

// List   -> Ordered, allows duplicates
// Set    -> No duplicates
// Queue  -> FIFO
// Map    -> Key-Value (keys unique)

// ----------------------------------------
// INTERVIEW TIPS
// ----------------------------------------

// ArrayList   -> Fast access
// LinkedList  -> Fast insert/delete
// HashSet     -> No duplicates
// HashMap     -> Fast lookup

// ========================================
// */
// ```
