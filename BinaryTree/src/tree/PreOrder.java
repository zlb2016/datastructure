package tree;
import tree.Node;
import java.util.List;
public class PreOrder {
    public void preTraversal(Node node){
        if(node==null)  //很重要，当遇到叶子节点用来停止向下遍历
            return;
        System.out.print(node.getValue()+" ");
        preTraversal(node.getLeft());
        preTraversal(node.getRight());
    }
    public static  void main(String args[]){
        int[] datas=new int[5];
        datas[0]=1;
        datas[1]=2;
        datas[2]=3;
        datas[3]=4;
        datas[4]=5;
        CreateTree Ctree=new CreateTree();
        //Ctree.create(datas,List<Node> list);
    }
}
