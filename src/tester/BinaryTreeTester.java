package tester;

import container.BinaryTree;
import container.BinaryTreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTester {
    @Test
    public void insertElement(){
        BinaryTreeNode node= null;
        BinaryTree test=new BinaryTree();
        node=test.insertElementIntoBinnaryTree(10,node);
        node=test.insertElementIntoBinnaryTree(5,node);
        node=test.insertElementIntoBinnaryTree(7,node);
        node=test.insertElementIntoBinnaryTree(4,node);
        node=test.insertElementIntoBinnaryTree(8,node);
        assertEquals(5,test.GetNodesCount(node));

    }

    @Test
    public void preOrderTest(){
        BinaryTreeNode node= null;
        BinaryTree test=new BinaryTree();
        node=test.insertElementIntoBinnaryTree(5,node);
        node=test.insertElementIntoBinnaryTree(3,node);
        node=test.insertElementIntoBinnaryTree(8,node);
        node=test.insertElementIntoBinnaryTree(2,node);
        node=test.insertElementIntoBinnaryTree(6,node);
        node=test.insertElementIntoBinnaryTree(4,node);
        node=test.insertElementIntoBinnaryTree(9,node);
        int[] preOrderList = test.getPreOrderList(node);
        assertEquals(preOrderList[0],5);
        assertEquals(preOrderList[1],3);
        assertEquals(preOrderList[2],2);
        assertEquals(preOrderList[3],4);
        assertEquals(preOrderList[4],8);
        assertEquals(preOrderList[5],6);
        assertEquals(preOrderList[6],9);

    }
    @Test
    public void postOrderTest(){
        BinaryTreeNode node= null;
        BinaryTree test=new BinaryTree();
        node=test.insertElementIntoBinnaryTree(5,node);
        node=test.insertElementIntoBinnaryTree(3,node);
        node=test.insertElementIntoBinnaryTree(8,node);
        node=test.insertElementIntoBinnaryTree(2,node);
        node=test.insertElementIntoBinnaryTree(6,node);
        node=test.insertElementIntoBinnaryTree(4,node);
        node=test.insertElementIntoBinnaryTree(9,node);
        int[] postOrderList = test.getPostOrderList(node);
        assertEquals(postOrderList[0],2);
        assertEquals(postOrderList[1],4);
        assertEquals(postOrderList[2],3);
        assertEquals(postOrderList[3],6);
        assertEquals(postOrderList[4],9);
        assertEquals(postOrderList[5],8);
        assertEquals(postOrderList[6],5);
    }

    @Test
    public void inOrderTest(){
        BinaryTreeNode node= null;
        BinaryTree test=new BinaryTree();
        node=test.insertElementIntoBinnaryTree(5,node);
        node=test.insertElementIntoBinnaryTree(3,node);
        node=test.insertElementIntoBinnaryTree(8,node);
        node=test.insertElementIntoBinnaryTree(2,node);
        node=test.insertElementIntoBinnaryTree(6,node);
        node=test.insertElementIntoBinnaryTree(4,node);
        node=test.insertElementIntoBinnaryTree(9,node);
        int[] inOrderList = test.getInOrderList(node);
        assertEquals(inOrderList[0],2);
        assertEquals(inOrderList[1],3);
        assertEquals(inOrderList[2],4);
        assertEquals(inOrderList[3],5);
        assertEquals(inOrderList[4],6);
        assertEquals(inOrderList[5],8);
        assertEquals(inOrderList[6],9);
    }

    @Test
    public void height() {
        BinaryTreeNode node = null;
        BinaryTree test = new BinaryTree();
        node = test.insertElementIntoBinnaryTree(5, node);
        node = test.insertElementIntoBinnaryTree(3, node);
        node = test.insertElementIntoBinnaryTree(8, node);
        node = test.insertElementIntoBinnaryTree(2, node);
        node = test.insertElementIntoBinnaryTree(6, node);
        node = test.insertElementIntoBinnaryTree(4, node);
        node = test.insertElementIntoBinnaryTree(9, node);
        assertEquals(test.Height(node), 3);
    }

    @Test
    public void findFrequency(){
        BinaryTreeNode node = null;
        BinaryTree test = new BinaryTree();
        node = test.insertElementIntoBinnaryTree(5, node);
        node = test.insertElementIntoBinnaryTree(3, node);
        node = test.insertElementIntoBinnaryTree(8, node);
        node = test.insertElementIntoBinnaryTree(2, node);
        node = test.insertElementIntoBinnaryTree(6, node);
        node = test.insertElementIntoBinnaryTree(4, node);
        node = test.insertElementIntoBinnaryTree(4, node);
        assertEquals(test.FindFrequency(4,node), 2);
    }

    @Test
    public void leafNodeCount(){
        BinaryTreeNode node = null;
        BinaryTree test = new BinaryTree();
        node = test.insertElementIntoBinnaryTree(5, node);
        node = test.insertElementIntoBinnaryTree(3, node);
        node = test.insertElementIntoBinnaryTree(8, node);
        node = test.insertElementIntoBinnaryTree(2, node);
        node = test.insertElementIntoBinnaryTree(6, node);
        node = test.insertElementIntoBinnaryTree(4, node);
//        node = test.insertElementIntoBinnaryTree(9, node);
        assertEquals(test.CountLeafNodes(node), 3);
    }
    @Test
    public void deleteNode(){
        BinaryTreeNode node = null;
        BinaryTree test = new BinaryTree();
        node = test.insertElementIntoBinnaryTree(5, node);
        node = test.insertElementIntoBinnaryTree(3, node);
        node = test.insertElementIntoBinnaryTree(8, node);
        node = test.insertElementIntoBinnaryTree(2, node);
        node = test.insertElementIntoBinnaryTree(6, node);
        node = test.insertElementIntoBinnaryTree(4, node);
        node = test.insertElementIntoBinnaryTree(9, node);
        test.delete(node,2);
        assertEquals(test.GetNodesCount(node),6);
        assertEquals(test.CountLeafNodes(node),3);
    }

    @Test
    public void searchNode(){
        BinaryTreeNode node = null;
        BinaryTree test = new BinaryTree();
        node = test.insertElementIntoBinnaryTree(5, node);
        node = test.insertElementIntoBinnaryTree(3, node);
        node = test.insertElementIntoBinnaryTree(8, node);
        node = test.insertElementIntoBinnaryTree(2, node);
        node = test.insertElementIntoBinnaryTree(6, node);
        node = test.insertElementIntoBinnaryTree(4, node);
        node = test.insertElementIntoBinnaryTree(9, node);
        assertTrue(test.search(node,9));
    }


}
