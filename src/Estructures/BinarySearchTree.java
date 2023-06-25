
package Estructures;

/**
 *
 * @author Santiago Aristimuño
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> {
    Node root;

    public BinarySearchTree() {
        root = null;
    }
    
    public void addNode(T data){
        
    }
    public boolean isEmpty(){
        return root == null;
    } 
    public T getMin(){
        if (this.isEmpty()){
            return null;
        }
        Node<T> node = this.root;
        while (node.getLeftChild() != null){
            node = node.getLeftChild();
        }
        return node.getData();
    }
    public Comparable getMax(){
        if (this.isEmpty()){
            return null;
        }
        return getMax(root);
    } 
    private Comparable getMax(Node<T> node){
        if (node.getRightChild() != null){
            return getMax(node.getRightChild());
        }
        return node.getData();
    }
    public void insert(T data){
        if (this.isEmpty()){
            this.root = new Node<>(data); 
        }else{
            insert(data, root);
        }
        return;
    }
    private void insert(T data, Node<T> node){
        if (data.compareTo(node.getData())<0){
            if (node.getLeftChild() == null){
                Node<T> newNode = new Node<>(data);
                node.setLeftChild(newNode);
            }else{
                this.insert(data, node.getLeftChild());
            }
        }else if (data.compareTo(node.getData())>0){
            if (node.getRightChild() == null){
                Node<T> newNode = new Node<>(data);
                node.setRightChild(newNode);
            }else{
                this.insert(data, node.getRightChild());
            }
        }
    }
    public void delete(T data){
        this.root = delete(data, root);
    }
    private Node<T> delete(T data, Node<T> node){
        if (node == null){
            return null;
        }
        if (data.compareTo(node.getData())<0){
            node.setLeftChild(delete(data,node.getLeftChild()));
        }else if(data.compareTo(node.getData())>0){
            node.setRightChild(delete(data,node.getRightChild()));
        }else{
            //one child or leaf
            if (node.getLeftChild() == null){
                return node.getRightChild();
            }else if (node.getRightChild() == null){
                return node.getLeftChild();
            }
            //two children
            node.setData((T) getMax(node.getLeftChild()));
            node.setLeftChild(delete(node.getData(), node.getLeftChild()));
        }
        return node;
    }
}
