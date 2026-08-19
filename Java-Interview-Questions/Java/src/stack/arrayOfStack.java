package stack;

import java.util.Stack;
import java.util.logging.SocketHandler;

public class arrayOfStack {
   public static class stack {

        int arr[] = new int[5];
        int idx = 0;
        int size = 0;


     public void push(int x) {
            if (isFull()) {
                System.out.println("stack is full!");
            }
            arr[idx] = x;
            idx++;
            size++;
        }

      public int peak() {
            if (isEmpty()) {
                System.out.println("stack is empty!");
                return -1;
            }
            return arr[idx - 1];
        }

       public int pop() {
            if (isEmpty()) {
                System.out.println("stack is empty!");
                return -1;
            }
            int ans = arr[idx - 1];
            idx--;
            size--;
            return ans;
        }

       public void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
           System.out.println();
        }

     public    boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull(){
         return size==arr.length;
        }

        public static void main(String[] args) {
            stack st = new stack();
            st.push(1);
            st.push(2);
            st.push(3);
            System.out.println("size=" + st.size);
            System.out.println("peek = " + st.peak());
            st.display();
            System.out.println("deleted= " + st.pop());
            System.out.println("size=" +st.size);
        }

    }
}

//    static class  Queue{
//      int front = -1;
//      int rear = -1;
//      int size = 0;
//      int arr[] = new int[5];
//
//      void add(int x){
//          if (isFull()){
//              System.out.println("queue full!");
//          }
//          if (front== -1 && rear==-1){
//              front=0;
//              rear=0;
//              arr[rear]=x;
//              size++;
//          }else {
//              arr[rear+1]=x;
//              rear++;
//              size++;
//          }
//      }
//
//      int top(){
//          if (isEmpty()){
//              System.out.println("empty queue!");
//          }
//          return arr[front];
//      }
//
//      int remove(){
//          if (isEmpty()){
//              System.out.println("empty queue!");
//          }
//          int ans = arr[front];
//          front++;
//          size--;
//          return ans;
//      }
//
//      boolean isEmpty(){
//          return size==0;
//      }
//
//      boolean isFull(){
//          return size==arr.length-1;
//      }
//
//      void display(){
//          for (int i=front; i <= rear; i++){
//              System.out.print(arr[i]+" ");
//          }
//          System.out.println();
//      }



