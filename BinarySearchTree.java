
public class BinarySearchTree {

    Node root;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        } else {
            Node tmp = root;
            Node parent = root;
            while (tmp != null) {
                parent = tmp;
                if (data < tmp.data) {
                    tmp = tmp.left;
                } else if (data > tmp.data) {
                    tmp = tmp.right;
                }
            }

            if (data < parent.data) {
                parent.left = newNode;
            } else if (data > parent.data) {
                parent.right = newNode;
            }
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + ", ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + ", ");
            inOrder(root.right);
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + ", ");
        }
    }

    public Node search(int data) {                                 // BİR TIK FARKLI AMA SORUN OLACAĞINI SANMIYORUM.
        Node tmp = root;
        while (tmp != null) {
            if (data < tmp.data) {
                tmp = tmp.left;
            } else if (data > tmp.data) {
                tmp = tmp.right;
            } else if (data == tmp.data) {
                return tmp;
            } else {
                return null;
            }
        }
        return null;
    }

    public Node search2(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            return search2(root.left, data);
        } else if (data > root.data) {
            return search2(root.right, data);
        } else if (data == root.data) {
            return root;
        } else {
            return null;
        }
    }

    public Node searchMin() {
        Node tmp = root;
        while (tmp.left != null) {
            tmp = tmp.left;
        }
        return tmp;
    }

    public Node searchMin2(Node root) {
        if (root.left != null) {
            return searchMin2(root.left);
        }
        return root;
    }

    public int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return (size(root.left) + size(root.right) + 1);
        }
    }

    public int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            int sol = 0;
            int sag = 0;

            sol = height(root.left);
            sag = height(root.right);

            if (sol > sag) {
                return (sol + 1);
            } else {
                return (sag + 1);
            }

        }
    }

    public void deleteMin() {
        Node tmp = root;
        Node parent = root;

        while (tmp.left != null) {
            parent = tmp;
            tmp = tmp.left;
        }

        if (tmp == root) {
            root = root.right;
            return;
        }

        parent.left = null;

    }

    public int sum(Node root) {
        int sum = 0;
        int L = 0;
        int R = 0;

        if (root == null) {
            return 0;
        } else {

            if (root.left != null) {
                L = sum(root.left);
            }

            if (root.right != null) {
                R = sum(root.right);
            }

            sum = root.data + L + R;
        }
        return sum;
    }
}
