package com.camp;

public class NodeDoubly {
	Object value;
	NodeDoubly next;
	NodeDoubly previous;
	
	public NodeDoubly(Object value, NodeDoubly next, NodeDoubly previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;	
	}
}
