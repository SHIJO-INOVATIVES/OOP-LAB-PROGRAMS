public class Queue{
    int SIZE=5;
    int items[]=new int[SIZE];
    int front,rear;
    Queue(){
        front=-1;
        rear=-1;
    
    }
    boolean isFull(){
        if(front==0 && rear==SIZE-1){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(front==-1)
        return true;
        else
        return false;
    }
    void enqueue(int element){
        if(isFull()){
            System.out.println("\nThe Queue is full");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            items[rear]=element;
            System.out.println("\nThe element "+element+"is inserted");
        }
    }
    int dequeue(){
        int element;
        if(isEmpty()){
            System.out.println("\nThe queue is empty");
            return(-1);
        }
        else{
            element=items[front];
            if(front>=rear){
                front=-1;
                rear=-1;
            }
            else{
                front++;
            }
            System.out.println("\nThe element "+element+"is deleted");
            return(element);
        }
    }
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        else{
            System.out.println("\nThe elements of the queue are:");
            for(i=front;i<=rear;i++)
            System.out.println(items[i]+"");
        }
    }
    public static void main(String[] args){
        Queue input_queue=new Queue();
        for(int i=1;i<6;i++){
            input_queue.enqueue(i*100);
        }
        System.out.println("\nThe queue is defined as:"+input_queue);
        input_queue.enqueue(6);
        input_queue.display();
        input_queue.dequeue();
        input_queue.display();
    }
}
