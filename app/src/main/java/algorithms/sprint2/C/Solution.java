package algorithms.sprint2.C;

// <template>
class Node<V> {
    public V value;  
    public Node<V> next;  
 
    public Node(V value, Node<V> next) {  
        this.value = value;  
        this.next = next;  
    }  
}
// <template>

public class Solution {
    public static Node<String> getNodeByIndex(Node<String> node, int index) {
        while (index > 0) {
            node = node.next;
            index--;
        }
        return node;
    }
    public static Node<String> solution(Node<String> head, int index) {
        Node<String> previousNode = getNodeByIndex(head, index - 1);
        Node<String> nextNode = getNodeByIndex(head, index + 1);
        if (index == 0) {
             head = nextNode;
            return head;
        }
        previousNode.next = nextNode;
        return head;
    }

    public static void test() {
        Node<String> node3 = new Node<>("node3", null);
        Node<String> node2 = new Node<>("node2", node3);
        Node<String> node1 = new Node<>("node1", node2);
        Node<String> node0 = new Node<>("node0", node1);
        Node<String> newHead = solution(node0, 1);
        assert newHead == node0;
        assert newHead.next == node2;
        assert newHead.next.next == node3;
        assert newHead.next.next.next == null;

        printList(newHead);
        // result is : node0 -> node2 -> node3
    }

    private static void printList(Node<String> head) {
        for (int i = 0; i < 5000; i++) {
            if (head != null) {
                System.out.println(head.value);
                head = head.next;
            }
        }
    }
}