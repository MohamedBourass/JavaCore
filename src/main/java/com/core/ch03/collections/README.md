# Collection and Generics

## Collection
- A collection is a group of objects contained in a single object
- There are 4 main interfaces in the Java Collections Framework (List, Set, Queue and Map*)

| Method                           | Description                                                                 |
|----------------------------------|-----------------------------------------------------------------------------|
| `add(E e)`                       | Adds an element to the collection.                                           |
| `addAll(Collection<? extends E> c)` | Adds all elements from the specified collection to this collection.         |
| `clear()`                        | Removes all elements from this collection.                                   |
| `contains(Object o)`             | Returns `true` if this collection contains the specified element.            |
| `containsAll(Collection<?> c)`   | Returns `true` if this collection contains all elements from the specified collection. |
| `equals(Object o)`               | Compares the specified object with this collection for equality.             |
| `hashCode()`                     | Returns the hash code value for this collection.                             |
| `isEmpty()`                      | Returns `true` if this collection contains no elements.                      |
| `iterator()`                     | Returns an iterator over the elements in this collection.                    |
| `remove(Object o)`               | Removes a single instance of the specified element from this collection.      |
| `removeAll(Collection<?> c)`     | Removes all this collection's elements that are also contained in the specified collection. |
| `retainAll(Collection<?> c)`     | Retains only the elements in this collection that are contained in the specified collection. |
| `size()`                         | Returns the number of elements in this collection.                           |
| `toArray()`                      | Returns an array containing all elements in this collection.                 |
| `toArray(T[] a)`                 | Returns an array containing all elements in this collection; the runtime type of the returned array is that of the specified array. |

## List
- A list is an ordered collection of elements that allows duplicate entries

| Method                         | Description                                                                    |
|--------------------------------|--------------------------------------------------------------------------------|
| `add(int index, E element)`    | Inserts the specified element at the specified position in the list.            |
| `addAll(int index, Collection<? extends E> c)` | Inserts all elements in the specified collection starting at the specified position. |
| `get(int index)`               | Returns the element at the specified position in the list.                      |
| `indexOf(Object o)`            | Returns the index of the first occurrence of the specified element in the list.  |
| `lastIndexOf(Object o)`        | Returns the index of the last occurrence of the specified element in the list.   |
| `listIterator()`               | Returns a list iterator over the elements in the list.                          |
| `listIterator(int index)`      | Returns a list iterator starting at the specified position in the list.         |
| `remove(int index)`            | Removes the element at the specified position in the list.                      |
| `set(int index, E element)`    | Replaces the element at the specified position in the list with the specified element. |
| `subList(int fromIndex, int toIndex)` | Returns a view of the portion of the list between the specified indices.  |


## Set
- The Set interface extends the Collection interface and does not introduce any new methods. However, it emphasizes that sets do not allow duplicate elements.

## Queue
- A queue is a collection that orders its elements in a specific order for processing

| Method                         | Description                                                                    |
|--------------------------------|--------------------------------------------------------------------------------|
| `element()`                    | Retrieves, but does not remove, the head of this queue.                         |
| `offer(E e)`                   | Inserts the specified element into this queue.                                  |
| `peek()`                       | Retrieves, but does not remove, the head of this queue, or returns `null` if this queue is empty. |
| `poll()`                       | Retrieves and removes the head of this queue, or returns `null` if this queue is empty. |
| `remove()`                     | Retrieves and removes the head of this queue.                                   |


## Map
- The Map interface does not extend the Collection interface and has its own unique methods.
- A map is a collection that maps key to values, with no duplicate keys allowed

| Method                         | Description                                                                    |
|--------------------------------|--------------------------------------------------------------------------------|
| `clear()`                      | Removes all mappings from this map.                                             |
| `containsKey(Object key)`      | Returns `true` if this map contains a mapping for the specified key.             |
| `containsValue(Object value)`  | Returns `true` if this map maps one or more keys to the specified value.        |
| `entrySet()`                   | Returns a `Set` view of the mappings contained in this map.                     |
| `get(Object key)`              | Returns the value to which the specified key is mapped, or `null` if this map contains no mapping for the key. |
| `isEmpty()`                    | Returns `true` if this map contains no key-value mappings.                      |
| `keySet()`                     | Returns a `Set` view of the keys contained in this map.                         |
| `put(K key, V value)`          | Associates the specified value with the specified key in this map.              |
| `putAll(Map<? extends K, ? extends V> m)` | Copies all of the mappings from the specified map to this map.        |
| `remove(Object key)`           | Removes the mapping for a key from this map if it is present.                   |
| `size()`                       | Returns the number of key-value mappings in this map.                           |
| `values()`                     | Returns a `Collection` view of the values contained in this map.                |

A static array cannot be resized
Most dynamic array implementation use static arrays internally
String are a sequence of characters
HashTable is thread-safe but HashMap is not thread-safe
Vector and HashTable are old version, nowadays we use Collections.synchronizedMap, synchronizedList etc.
Comparable is a functional interface since it has only one abstract method "compareTo"
Comparator to sort object that did not implement the FI Comparable, or you want to sort objects in different ways at different times