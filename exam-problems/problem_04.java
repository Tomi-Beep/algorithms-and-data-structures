import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class BNode<E> {
    public E info;
    public BNode<E> left;
    public BNode<E> right;
    static int LEFT = 1;
    static int RIGHT = 2;

    public BNode(E info) {
        this.info = info;
        left = null;
        right = null;
    }

    public BNode() {
        this.info = null;
        left = null;
        right = null;
    }

    public BNode(E info, BNode<E> left, BNode<E> right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return ""+info;
    }
}

class BTree<E> {
    public BNode<E> root;

    public BTree() {
        root = null;
    }

    public BTree(E info) {
        root = new BNode<E>(info);
    }

    public void makeRoot(E elem) {
        root = new BNode<E>(elem);
    }

    public void makeRootNode(BNode<E> node) {
        root = node;
    }

    public BNode<E> addChild(BNode<E> node, int where, E elem) {
        BNode<E> tmp = new BNode<E>(elem);

        if (where == BNode.LEFT) {
            if (node.left != null)
                return null;
            node.left = tmp;
        } else {
            if (node.right != null)
                return null;
            node.right = tmp;
        }

        return tmp;
    }

    public BNode<E> addChildNode(BNode<E> node, int where, BNode<E> tmp) {
        if (where == BNode.LEFT) {
            if (node.left != null)
                return null;
            node.left = tmp;
        } else {
            if (node.right != null)
                return null;
            node.right = tmp;
        }

        return tmp;
    }

    // Helper method to find a node with given value
    public BNode<E> findNode(String value) {
        return findNodeRecursive(root, value);
    }

    private BNode<E> findNodeRecursive(BNode<E> node, String value) {
        if (node == null) return null;
        if (node.info.toString().equals(value)) return node;

        BNode<E> leftResult = findNodeRecursive(node.left, value);
        if (leftResult != null) return leftResult;

        return findNodeRecursive(node.right, value);
    }

    // Calculate distance between two nodes
    public int findDistance(String from, String to) {
        BNode<E> fromNode = findNode(from);
        BNode<E> toNode = findNode(to);

        if (fromNode == null || toNode == null) {
            return -1; // Error case
        }

        // Use BFS to find shortest path
        Queue<BNode<E>> queue = new LinkedList<>();
        Map<BNode<E>, Integer> distances = new HashMap<>();

        queue.offer(fromNode);
        distances.put(fromNode, 0);

        while (!queue.isEmpty()) {
            BNode<E> current = queue.poll();

            if (current == toNode) {
                return distances.get(current) * 2; // Multiply by 2 as each edge has weight 2
            }

            // Process left child
            if (current.left != null && !distances.containsKey(current.left)) {
                queue.offer(current.left);
                distances.put(current.left, distances.get(current) + 1);
            }

            // Process right child
            if (current.right != null && !distances.containsKey(current.right)) {
                queue.offer(current.right);
                distances.put(current.right, distances.get(current) + 1);
            }

            // Process parent (need to find parent in the tree)
            BNode<E> parent = findParent(root, current);
            if (parent != null && !distances.containsKey(parent)) {
                queue.offer(parent);
                distances.put(parent, distances.get(current) + 1);
            }
        }

        return -1; // No path found
    }

    private BNode<E> findParent(BNode<E> root, BNode<E> node) {
        if (root == null) return null;
        if (root.left == node || root.right == node) return root;

        BNode<E> leftResult = findParent(root.left, node);
        if (leftResult != null) return leftResult;

        return findParent(root.right, node);
    }
}
@SuppressWarnings("unchecked")
public class chillinnn {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        BNode<String>[] nodes = new BNode[N];
        BTree<String> tree = new BTree<String>();

        for (int i = 0; i < N; i++)
            nodes[i] = new BNode<String>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            st = new StringTokenizer(line);
            int index = Integer.parseInt(st.nextToken());
            nodes[index].info = st.nextToken();
            String action = st.nextToken();
            if (action.equals("LEFT")) {
                tree.addChildNode(nodes[Integer.parseInt(st.nextToken())], BNode.LEFT, nodes[index]);
            } else if (action.equals("RIGHT")) {
                tree.addChildNode(nodes[Integer.parseInt(st.nextToken())], BNode.RIGHT, nodes[index]);
            } else {
                tree.makeRootNode(nodes[index]);
            }
        }

        int cases = Integer.parseInt(br.readLine());
        for (int l = 0; l < cases; l++) {
            String[] split = br.readLine().split(" +");
            String from = split[0];
            String to = split[1];

            int distance = tree.findDistance(from, to);
            System.out.println(distance == -1 ? "ERROR" : distance);
        }

        br.close();
    }
}
