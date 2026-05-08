package TP3.ejercicio1;
import java.util.*;

public class GeneralTree <T>{
	
	private T data;
	private List <GeneralTree<T>> children = new LinkedList<GeneralTree<T>>();
	
	public GeneralTree (T data) {
		this.data = data;
	}
	
	public GeneralTree (T data, List<GeneralTree<T>> children) {
		this.data = data;
		this.children = children;
	}
	
	public boolean hasChildren () {
		return children != null && !children.isEmpty();
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null) {
			this.children = children;
		}
	}
	
	public List<GeneralTree<T>> getChildren (){
		return this.children;
	}

	public void addChild(GeneralTree<T> child) {
		getChildren().add(child);
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public boolean isLeaf() {
		return !hasChildren();
	}
	
	public boolean isEmpty () {
		return data == null && !this.hasChildren();
	}
	
	public void removeChildren (GeneralTree<T> child) {
		if(this.hasChildren()) {
			children.remove(child);
		}
	}
	
	private void preOrder() {
		System.out.println(getData());
		List<GeneralTree<T>> children = this.getChildren();
		for (GeneralTree<T> child: children) {
			child.preOrder();
		}
	}
	
}
