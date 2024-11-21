- Node  : a place/point where things or systems join 
- self-referential data type :  in its own datatype(class) give reference of same type(data type)

```c
struct node{
    int data;
    struct node* next;
}
```

```cpp
class node{
    private: 
        int data;
        node* next;
}
```

```java
public class Node{
    private int data;
    private Node next;
}
```