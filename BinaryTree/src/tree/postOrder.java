package tree;

public class postOrder {
    public void postTraversal(Node node){
        if(node==null)
            return;
        postTraversal(node.getLeft());
        postTraversal(node.getRight());
        System.out.print(node.getValue()+" ");
    }
}
