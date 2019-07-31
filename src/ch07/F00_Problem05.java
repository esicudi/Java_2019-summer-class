package ch07;

import java.util.ArrayList;

class MyStack<T>{
	ArrayList<T> list=new ArrayList<>();
	int topIndex=-1;
	//void push()	stack에 값 추가
	void push(T t) {
		list.add(t);
		topIndex++;
	}
	//T pop()		stack에서 값 반환&삭제
	T pop() {
		return list.remove(topIndex--);
	}
	//T top()		마지막으로 들어온 값 반환
	T top() {
		return list.get(topIndex);
	}
	//int getSize()	스택의 길이 반환
	int getSize() {
		return topIndex+1;
	}
}

public class F00_Problem05 {
	public static void main(String[] args) {
		MyStack<String> stack1=new MyStack<>();
		
		stack1.push("Hello");
		stack1.push("World!");
		stack1.push("Java");
		stack1.push("Programming");
		
		String str=stack1.pop();
		
		if(str==null) {
			System.out.println("값이 없습니다");
		}
		System.out.println(str);
	}
}
