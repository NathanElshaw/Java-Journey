package Fundamentals.Data_Structures;

public class LinkedList {
}

/*
 * Linked Lists:
 * Linked list are linear data structures that include a series of connected
 * nodes. Linked list can be defined as the nodes that are randomly stored in
 * memory .
 * A node contains two parts, first the data part and second is the address
 * part.
 * the last node in a list contains a pointer to the null. After arrays LL is
 * the second most used data structure.
 * In a linked list, every link contains a connection to another link.
 */

/*
 * Visual
 * (Head) [1200] ->
 * [[8(Data)][1300(Link)]]->[[12(Data)][1400(Link)]]->[[124][Null(Tail)]
 */

/*
 * Why use Linked List:
 * Linked list overcome the limitations of arrays. Here are some examples
 * 
 * The size of the array must be known in advanced before using it in a program.
 * 
 * Increasing the size of an array is a time taking process. it is almost
 * impossible to expand the size of the array at run time
 * 
 * All the elements in the array need to be contiguosly stored in memory.
 * inserting an element in the array needs shifting of all its predecessors
 * 
 * Its useful because-
 * it allocates the memory dyanmically. all the nodes of a linked list are
 * non-contiguously stored in the memory and linked together with the help of
 * pointers
 * 
 * in Linked list, size is no longer a problem since we do not need to define
 * its size at the time of declaration. Lists grow as per the programs demand
 * and limited to available memory space.
 */

/*
 * How to declare a linked list:
 * it simple to declare an array, as it is of single type, while declaration of
 * a linked list is a bit more typical than array.
 * 
 * Linked list contain two parts and both are different types, one is a data
 * value and another is a pointer variable. We can declare a linked list by
 * making a linked list class
 * 
 * Class LinkedList {
 * int data = 14
 * LinkedList next = new LinkedList();
 * }
 * 
 * in the example above there are 2 variables, one is data that is of integet
 * type and another next that points to the next node.
 */

/*
 * Types of Linked List:
 * 
 * Singly-linked list:
 * Singly linked list can be defined as the collection of an ordered set of
 * element. A node in the singly linked list consists of two parts: data part
 * and link part. Data part of the node stores the actual data to represent the
 * node, while the link part store the address of of its successor.
 * 
 * Doubly-Linked list:
 * Doubly-Linked list is a complex type of linked list in which a node contains
 * a pointer to the previous as well as the next node in sequence. Therefore, in
 * a doubly-linked list, a node consists of 3 parts: node data, next point and
 * previous pointer.
 * 
 * Circular singly-linked list:
 * The same a Singly-Linked list but the last node points to the first node in
 * the list
 * 
 * Circular Doubly-linked list:
 * The same as a Doubly-Linked list but the last node points to the first node
 * in the list.
 */

/*
 * Pros and cons of linked lists:
 * 
 * Pros:
 * Dynamic data structure:
 * The size of the linked list may vary according to the requirements. Linked
 * lists do not have a fixed size.
 * 
 * Insertion and deletion:
 * Unlike arrays, insertion and deletion in a linked list is easier. Array
 * elements are stored in the consecutive location, whereas the elements in the
 * linked list are stored at a random location. To insert or delete an element
 * in an array we have to shift the elements for creating the space. Whereas, in
 * a linked list instead of shifting, we just have to update the address of the
 * pointer node.
 * 
 * Memory Efficient:
 * The size of a linked lsit can grow or shrink according to the requirements,
 * so memory consumption in linked list is efficient.
 * 
 * Implementation:
 * We can implement both stacks and queues using linked lists.
 * 
 * Cons:
 * 
 * Memory usage:
 * in linked list, node occupies more memory than arrays. Each node of the
 * linked list occupies two types of variables, one is a simple variable and
 * another is a pointer varaiable.
 * 
 * Traversal:
 * Traversal is not easy on the linked list f we have to access an element in
 * the linked list, we cannot access it randomly, while in the case of an array
 * we can randomly access it by index. for example if we want to access the 3rd
 * node we need to traverse the first 2 nodes to get to the third so the time
 * required is particularly large to reach a certain node.
 * 
 * Reverse Traversing:
 * Backtracking is difficult in a linked list, in a doubly linked list its
 * easier but requires more memeory to store the back pointer.
 */
