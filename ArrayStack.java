interface Stack{
	public Object peek();
	public Object pop();
	public Object push(Object element);
	public int size();	
}
public class ArrayStack implements Stack{
	Object[] elements;
	int capacity;
	int top;
	
	public ArrayStack(int capacity){
		this.capacity=capacity;
		top=0;
		elements=new Object[capacity];	
	}
	
	//add element
	public Object push(Object element){
		if(top==capacity-1){                     //5
			System.out.println("Stack full");		
			return elements;
		}
		
		 elements[++top]=element;
		return elements;
	}
	
	//delete element
	public Object pop(){ 	
		if(top<=0)throw new IllegalStateException("Stack is empty");
		Object temp=elements[--top];
		elements[top]=null;
	
		return temp;
	}
	
	// check for last element
	public Object peek(){
		if(top<0)throw new IllegalStateException("Stack is empty");
		return elements[top];
	}

	public int size(){
		return top+1;
	}
	
	public static void main(String arg[]){
		ArrayStack a=new ArrayStack(5);
		a.push("apples");
		a.push("cheku");
		a.push("grayfruit");
		System.out.println(a.peek());	
		System.out.println(a.size());
		a.pop();
		System.out.println(a.peek());
		System.out.println(a.size());
		a.push("gray");
		a.push("fruit");
		System.out.println(a.peek());
		System.out.println(a.size());
		System.out.println(a.peek());
		System.out.println(a.size());
		
	}

}
