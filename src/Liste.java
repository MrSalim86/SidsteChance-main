public class Liste {

    Node head = null;
    Node tail = null;

    boolean isEmpty() {

        return head == null && tail == null;
    }

    public Node insetFromHead(Node node) {
        // List er tom;

        if (isEmpty()) {

            head = node;
            tail = node;
            return head;

        }

        //List er ikke tom;
        node.next = head;
        head.previous = node;
        head = head.previous;
        return head;
    }


    String printFromHead() {

        Node n = head;

        StringBuilder stringBuilder = new StringBuilder();

        while (n != null) {

            stringBuilder.append(n.data + " ");



            n = n.next;
        }

        return stringBuilder.toString().trim();
    }
}
