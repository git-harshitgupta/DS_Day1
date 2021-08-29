package container;

public interface BinaryTreeIntf {
    public void PreOrder(BinaryTreeNode root);
    public void PostOrder(BinaryTreeNode root);
    public void InOrder(BinaryTreeNode root);
    public BinaryTreeNode delete(BinaryTreeNode root,int element);


    // Count number of nodes in a binary tree.
    int GetNodesCount(BinaryTreeNode root);

    // Find height of a binary tree.
    int Height(BinaryTreeNode node);

    // Count frequency of an element in a binary tree
    int FindFrequency(int element,BinaryTreeNode node);

    // Count number of leaf nodes in a binary tree
    int CountLeafNodes(BinaryTreeNode node);
    boolean search(BinaryTreeNode node,int element);
    // Convert tree into mirror image.
    int MakeMirror();
}
