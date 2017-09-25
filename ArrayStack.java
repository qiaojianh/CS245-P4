/*
    ArrayStack
    @author Qiaojian
*/
public class ArrayStack implements Stack {

	private Object[] arr = new Object[10];
	private int top = 0 ;
	
	public void push(Object item){
		if (top == arr.length) {
			Object[] tmp = new Object[arr.length * 2];
			System.arraycopy(arr,0,tmp,0,arr.length);
			arr = tmp;
		}
		arr[top++] = item; 
	}

	public Object pop(){
		if (!empty()) {
			return arr[--top];
		}
		return null;
	}

	public Object peek(){
		if (!empty()) {
			return arr[top-1];
		}
		return null;
	}

	public boolean empty(){
		if (top == 0) {
			return true;
		}
		return false;
	}

}