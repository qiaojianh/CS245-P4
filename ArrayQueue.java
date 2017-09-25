/*
    ArrayQueue
    @author Qiaojian
*/
public class ArrayQueue implements Queue {  
    private Object [] data = new Object[10];  
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public boolean empty(){    
        return size==0;  
    } 
            
    public void enqueue(Object item){  
       
        if (size == data.length) {
            Object [] oldData=data;  
            data=new Object[data.length*2];  
            System.arraycopy(oldData, 0,data , 0, oldData.length);
            head = 0;
            tail = oldData.length;        
        }
        tail = (tail)%data.length;
        data[tail++] = item;
        size++;
  
    }  
    
    public Object dequeue(){ 

        if (empty()) {
             return null;
        }
        size--; 
        Object element=data[head]; 

        head=(head+1)%data.length;  
        return element;
    }                            
}  

