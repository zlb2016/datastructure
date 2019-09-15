package tree;

import javax.sound.midi.MidiDevice;

public class InOrder {
    public void MidTraversal(Node node){
        if(node==null)
            return;
        MidTraversal(node.getLeft());
        System.out.print(node.getValue()+" ");
        MidTraversal(node.getRight());
    }
}
