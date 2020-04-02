public class LinkedList<E> {
    private node head;
    private int numNodes;
    public LinkedList(Object data){
        this.head = new node(data);
    }
    public void add(int index,E element){
        node temp = this.head;
        node holder;
        for (int i = 0; i < index - 1 && temp.getNext() != null; i++){
            temp = temp.getNext();
        }
        holder = temp.getNext();
        temp.setNext(new node(element));
        temp.getNext().setNext(holder);
        this.numNodes++;
    }
    public void addFirst(E e){
        node temp = this.head;
        this.head = new node(e);
        this.head.setNext(temp);
        this.numNodes++;
    }
    public E remove(int index){
        this.head = this.head.getNext();
        this.numNodes--;
        return (E) this.head;
    }
    public boolean remove(Object e){
        node temp = this.head;
        while (temp != null){
            if (e.equals(temp.getData())){
                this.numNodes--;
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    public int size(){
        return this.numNodes;
    }
    public Object clone(){
        LinkedList<E> linkedList = new LinkedList<E>(this.head.getData());
        linkedList.numNodes = this.numNodes;
        linkedList.head = this.head;
        return linkedList;
    }
    public boolean contains(E o){
        node temp = this.head;
        while (temp != null){
            if (o.equals(temp.getData())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    public int indexOf(E o){
        int index = -1;
        node temp = this.head;
        for (int i = 0;i < numNodes -1 ;i++){
            if (o.equals(temp.getData())){
                index = i;
            }
            temp = temp.getNext();
        }
        return index;
    }
    public boolean add(E e){
        node temp = head;
        for (int i =0;i < numNodes - 1;i++){
            temp = temp.getNext();
        }
        temp.setNext(new node(e));
        numNodes++;
        return true;
    }
    public E get(int index){
        node temp = head;
        for (int i = 0;i < index - 1 && temp.getNext() != null; i++){
            temp = temp.getNext();
        }
        E element = (E) temp.getData();
        return element;
    }
    public E getFisrt() {
        node temp = head;
        E element = (E) temp.getData();
        return element;
    }
    public E getLast() {
        node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.getNext();
        }
        E element = (E) temp.getData();
        return element;
    }
    public void clear() {
        this.head = null;
        this.numNodes = 0;
    }
}
