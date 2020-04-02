public class test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(1);
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);
        list.add(1, 4);
        list.add(2, 5);
        list.add(3, 6);
        list.add(1, 7);
        list.add(2, 8);
        list.add(3, 9);
        list.add(2,10);
        System.out.println(list.size());
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.get(2));
        System.out.println(list.getFisrt());
        System.out.println(list.getLast());
        LinkedList<Integer> newlist = (LinkedList<Integer>) list.clone();
    }
}
