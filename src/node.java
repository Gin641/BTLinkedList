public class node {
    private node next;
    private Object data;
    public node(Object data){
        this.data = data;
    }
    public Object getData(){
        return this.data;
    }
    public node getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(node next) {
        this.next = next;
    }
}
