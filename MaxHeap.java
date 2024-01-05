import java.util.Scanner;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    public void insert(int element) {
        size++;
        heap[size] = element;

        int i = size;
        while (i > 1 && heap[i] > heap[i / 2]) {
            swap(i, i / 2);
            i = i / 2;
        }
    }
    

    public void printHeap() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print("Parent Node : " + heap[i]);
            if(2*i<=size)
            System.out.print(" --> Left Child Node : "+heap[2*i]);
            if((2*i+1)<=size)
            System.out.println(" -->Right Child Node : "+heap[2*i+1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the max heap: ");
        int capacity = scanner.nextInt();

        MaxHeap maxHeap = new MaxHeap(capacity);

        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Print Heap");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    maxHeap.insert(element);
                    break;
                case 2:
                    maxHeap.printHeap();
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    
}