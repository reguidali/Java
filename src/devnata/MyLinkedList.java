package devnata;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedList {

     MyLinkedList() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(9);
        list.removeLast();
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(20));
        System.out.println(list.size());
        System.out.println(list);

        var array = list.toArray();
        String stringArray = Arrays.toString(array);
        System.out.println(stringArray);
    }
}
