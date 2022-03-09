# ArrayList

- Is the resizable array implementation of list interface.
- Is NOT Synchronized.
  - It can be using Collections.synchronized
  - It can be using CopyAndWriteArrayList class, which its synchronized
- The size can grows or shrinks as you add or remove elements.
- Supports generics.
- Big-O Complexity:
  - Access O(1)
  - Search O(N)
  - Insertion O(N)
  - Deletion O(N)
- [Custom implementation](CustomArrayListImplementation.java)
  - [Test cases](../../../../../../../../src/test/java/com/java/collections/list/arrayList/CustomArrayListImplementationTest.java)
- Difference between array and ArrayList
  - array: Can NOT modify the size
  - ArrayList: CAN modify the size