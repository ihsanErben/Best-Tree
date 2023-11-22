
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        BinarySearchTree x = new BinarySearchTree();
        boolean cikis = false;
        while (cikis == false) {
            System.out.println("0 - exit");
            System.out.println("1 - add node");
            System.out.println("2 - sum");
            System.out.println("3 - size");
            System.out.println("4 - height");
            System.out.println("5 - search");
            System.out.println("6 - search2");
            System.out.println("7 - search min");
            System.out.println("8 - search min2");
            System.out.println("9 - delete min");
            System.out.println("11 - preOrder");
            System.out.println("22 - inOrder");
            System.out.println("33 - postOrder");
            System.out.print("choose an action: ");
            int action = input.nextInt();
            System.out.println("");
            switch (action) {
                case 0:
                    cikis = true;
                    break;
                case 1:
                    System.out.print("new data: ");
                    int data = input.nextInt();
                    x.addNode(data);
                    break;
                case 2:
                    int sum = x.sum(x.root);
                    System.out.println("sum: " + sum);
                    break;
                case 3:
                    int size = x.size(x.root);
                    System.out.println("size: " + size);
                    break;
                case 4:
                    int height = x.height(x.root);
                    System.out.println("height: " + height);
                    break;
                case 5:
                    System.out.print("what is the data you are looking at: ");
                    int t1 = input.nextInt();
                    Node aranan = x.search(t1);
                    if (aranan == null) {
                        System.out.println("There is no such a value.");
                        break;
                    } else {
                        System.out.println("The value you are looking for is avalible in the system.");
                    }
                    break;
                case 6:
                    System.out.print("what is the data you are looking at: ");
                    int data3 = input.nextInt();
                    Node aranan2 = x.search2(x.root, data3);
                    if (aranan2 == null) {
                        System.out.println("There is no such a value.");
                        break;
                    } else {
                        System.out.println("The value you are looking for is avalible in the system.");
                    }
                    break;
                case 7:
                    Node min = x.searchMin();
                    System.out.println("Min number: " + min.data);
                    break;
                case 8:
                    Node min2 = x.searchMin2(x.root);
                    System.out.println("Min number: " + min2.data);
                    break;
                case 9:
                    x.deleteMin();
                    break;
                case 11:
                    x.preOrder(x.root);
                    System.out.println("");
                    break;
                case 22:
                    x.inOrder(x.root);
                    System.out.println("");
                    break;
                case 33:
                    x.postOrder(x.root);
                    System.out.println("");
                    break;
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    }
}
