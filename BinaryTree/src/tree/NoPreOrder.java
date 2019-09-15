package tree;

import java.util.Stack;

public class NoPreOrder {
    public void preOrderTraversalbyLoop(Node node){
        Stack<Node> stack=new Stack();
        Node p=node;
        while (p!=null||!stack.isEmpty()){
            while(p!=null){
                //当p不等于空时，就读取p的值，并不断更新p为其左子节点，即不断读取左子节点
                System.out.print(p.getValue()+" ");
                stack.push(p);//将p入栈
                p=p.getLeft();
            }
            if(!stack.isEmpty()){
                p=stack.pop();
                p=p.getRight();
            }
        }
    }
}
