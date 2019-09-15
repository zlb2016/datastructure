package tree;

import java.util.Stack;

public class NoInOrder {
    public void inOrderTraversalbyLoop(Node node){
        Stack<Node> stack=new Stack();
        Node p=node;
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p=p.getLeft();
            }
            if(!stack.isEmpty()){
                p=stack.pop();
                System.out.print(p.getValue()+" ");
                p=p.getRight();
            }
        }
    }
}
