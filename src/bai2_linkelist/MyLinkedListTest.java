package bai2_linkelist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> mylist = new MyLinkedList<>("Lâm");
        mylist.add("Nam");
        mylist.add("Tuấn");
        mylist.add("Mến");
        mylist.add("Tuấn Em");
        mylist.add("Minh");
        mylist.remove(2);
        mylist.printList();
        mylist.remove("Minh");
        mylist.printList();
        mylist.addFirst("Mít");
        mylist.printList();
    }
}
