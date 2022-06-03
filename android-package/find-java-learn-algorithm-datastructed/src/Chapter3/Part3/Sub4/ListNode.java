package Chapter3.Part3.Sub4;

import java.text.MessageFormat;

public class ListNode {
    public Object data;
    public ListNode next;

    public ListNode() {
        this.data = null;
        this.next = null;
    }

    public ListNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
//        return super.toString();
        return MessageFormat.format("ListNode({0})", data.toString());
    }
}
