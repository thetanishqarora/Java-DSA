public class Queue {
    int arr[];
    int size;
    int rear;

    Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
    }
    public boolean isEmpty(){
        return rear == -1;
    }
    public void add(int data){
        if(rear == size-1) return;
        rear += 1;
        arr[rear] = data;
    }
    public int remove(){
        if(isEmpty()) return -1;
        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear -= 1;
        return front;
    }
    public int peek(){
        if(isEmpty()) return -1;
        return arr[0];
    }

    public static void main(String args[]){
        Queue q1 = new Queue(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}

