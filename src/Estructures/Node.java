
package Estructures;

/**
 *
 * @author Santiago Aristimuño
 * @param <T>
 */
public class Node<T> {
    private T data;
    private Node leftChild;
    private Node rightChild;

    public Node(T data) {
        this.data = data;
        this.rightChild = null;
        this.leftChild = null;
    }
    
    
    
    public T getData() {
        return data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node RightChild) {
        this.rightChild = RightChild;
    }
    
}
