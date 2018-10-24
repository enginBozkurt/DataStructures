# DataStructures
Algorithms and Data Structures in Java

## Storing a Heap

![java1](https://user-images.githubusercontent.com/30608533/47459561-23a07100-d7e5-11e8-8305-0433033d44f5.jpg)


## Adding a New Node
To add a new node to the heap, first add it to the end of the heap and then rebuild the tree as follows:

Let the last node be the current node;

while (the current node is greater than its parent) {
    Swap the current node with its parent;
    Now the current node is one level up;
}


![java2](https://user-images.githubusercontent.com/30608533/47459722-8c87e900-d7e5-11e8-901a-970dc77924ac.jpg)


