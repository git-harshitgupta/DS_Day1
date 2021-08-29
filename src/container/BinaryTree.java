package container;

public class BinaryTree implements BinaryTreeIntf{

    private BinaryTreeNode createNewNode(int element){
        BinaryTreeNode newNode = new BinaryTreeNode(element);
        return newNode;
    }

    public BinaryTreeNode insertElementIntoBinnaryTree(int element,BinaryTreeNode root) {
        if(root==null)
            return createNewNode(element);
        if(root.data>element)
            root.lChild=insertElementIntoBinnaryTree(element,root.lChild);
        else if(root.data<element)
            root.rChild=insertElementIntoBinnaryTree(element,root.rChild);
        else if(root.data==element)
            root.rChild=insertElementIntoBinnaryTree(element,root.rChild);
        return root;
    }
    int[] preOrderList;
    int preOrderCount=0;
    public int[] getPreOrderList(BinaryTreeNode root){
        preOrderList= new int[GetNodesCount(root)];
        PreOrder(root);
        return  preOrderList;
    }

    @Override
    public void PreOrder(BinaryTreeNode root) {

        if (root==null)
            return ;
        preOrderList[preOrderCount]= root.data;
        preOrderCount++;
        PreOrder(root.lChild);
        PreOrder(root.rChild);


    }
    int[] postOrderList;
    int postOrderCount=0;
    public int[] getPostOrderList(BinaryTreeNode root){
        postOrderList= new int[GetNodesCount(root)];
        PostOrder(root);
        return  postOrderList;
    }

    @Override
    public void PostOrder(BinaryTreeNode root) {
        if(root==null)
            return;
        PostOrder(root.lChild);
        PostOrder(root.rChild);
        postOrderList[postOrderCount]=root.data;
        postOrderCount++;
    }

    int[] inOrderList;
    int inOrderCount=0;
    public int[] getInOrderList(BinaryTreeNode root){
        inOrderList= new int[GetNodesCount(root)];
        InOrder(root);
        return  inOrderList;
    }

    @Override
    public void InOrder(BinaryTreeNode root) {
        if(root==null)
            return;
        InOrder(root.lChild);
        inOrderList[inOrderCount]=root.data;
        inOrderCount++;
        InOrder(root.rChild);

    }

    @Override
    public BinaryTreeNode delete(BinaryTreeNode root, int element) {
        if(root==null)
            return null;
        if(element> root.data)
            root.rChild=delete(root.rChild,element);
        else if(element<root.data)
            root.lChild=delete(root.lChild,element);
        else{
            if(root.lChild!=null&&root.rChild!=null){
                root.data=minimunRightValue(root.rChild);
                root.rChild=delete(root.rChild,element);
            }
            else if(root.lChild!=null){
                root=root.lChild;
            }
            else if(root.rChild!=null){
                root=root.rChild;
            }
            else
                root = null;
        }
        return root;

    }

    private int minimunRightValue(BinaryTreeNode root) {
        if (root.lChild==null)
            return root.data;
        else
            return minimunRightValue(root.lChild);
    }


    @Override
    public int GetNodesCount(BinaryTreeNode root) {
        if(root==null)
            return 0;
        return 1+GetNodesCount(root.lChild)+GetNodesCount(root.rChild);
    }


    @Override
    public int Height(BinaryTreeNode node) {
        if(node == null)
            return 0;
        int leftHeight=Height(node.lChild);
        int rightHeight=Height(node.rChild);
        if(leftHeight<rightHeight)
            return rightHeight+1;
        else
            return leftHeight+1;
    }

    @Override
    public int FindFrequency(int element,BinaryTreeNode node) {
        if(node==null)
            return 0;
        if(node.data==element){
            int rCount=FindFrequency(element,node.rChild);
            int lCount=FindFrequency(element,node.lChild);
            return rCount+lCount+1;
        }
        else{
            int rCount=FindFrequency(element,node.rChild);
            int lCount=FindFrequency(element,node.lChild);
            return rCount+lCount+0;
        }





    }

    @Override
    public int CountLeafNodes(BinaryTreeNode node) {
        if(node==null)
            return 0;
        int lcount=CountLeafNodes(node.lChild);
        int rcount=CountLeafNodes(node.rChild);
        if(node.rChild==null&&node.lChild==null)
            return 1;
        return lcount+rcount;
    }

    @Override
    public boolean search(BinaryTreeNode node, int element) {
        if(node==null)
            return false;
        if(node.data==element)
            return true;
        else if(node.data< node.data)
            return search(node.lChild,element);
        else
            return search(node.rChild,element);
    }

    @Override
    public int MakeMirror() {
        return 0;
    }
}
