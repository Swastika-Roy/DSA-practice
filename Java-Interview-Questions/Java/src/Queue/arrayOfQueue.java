package Queue;

public class arrayOfQueue {
    static class Queue{
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[5];

        void add(int x){
            if(isFull()){
                System.out.println("array full");
            }
            if(front == -1 && rear == -1){
                front=0;
                rear=0;
                arr[rear]=x;
                size++;
            }
            else{
                arr[rear+1]=x;
                rear++;
                size++;
            }
        }

        int top(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

        int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int ans = arr[front];
            front++;
            size--;
            return ans;
        }

        void display(){
            for(int i=front; i <= rear; i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }

        boolean isEmpty(){
           return size==0;
        }

        boolean isFull(){
            return size==arr.length-1;
        }
    }



    public static void main(String[] args) {
         Queue q = new Queue();
         q.add(1);
         q.add(2);
         q.add(3);
        System.out.println(q.size);
        System.out.println(q.top());
        q.display();
        System.out.println(q.remove());
        q.display();
    }
}
