class Node {
    String val;
    Node(String v) { val = v; }

    void process(Node n) {
        n.val += ":1";
        n = new Node("X");
        n.val += ":2";
    }
}

public class Run {
    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = n1;
        n2.process(n2);
        n1.process(n2);
        System.out.println(n1.val);
        System.out.println(n2.val);
    }
}
